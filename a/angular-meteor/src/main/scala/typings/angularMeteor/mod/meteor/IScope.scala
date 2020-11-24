package typings.angularMeteor.mod.meteor

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Mongo.Cursor
import typings.meteor.Tracker.Computation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScope extends IRootScopeService {
  
  /**
    * This method is a wrapper of Tracker.autorun and shares exactly the same API.
    * The autorun method is part of the ReactiveContext, and available on every context and $scope.
    * The argument of this method is a callback, which will be called each time Autorun will be used.
    * The Autorun will stop automatically when when it's context ($scope) is destroyed.
    *
    * @param runFunc - The function to run. It receives one argument: the Computation object that will be returned.
    */
  def autorun(runFunc: js.Function0[Unit]): Computation = js.native
  
  /**
    * A method to get a $scope variable and watch it reactivly
    *
    * @param scopeVariableName - The name of the scope's variable to bind to
    * @param [objectEquality=false] - Watch the object equality using angular.equals instead of comparing for reference equality, deeper watch but also slower
    */
  def getReactively(scopeVariableName: String): ReactiveResult = js.native
  def getReactively(scopeVariableName: String, objectEquality: Boolean): ReactiveResult = js.native
  
  /**
    * The helpers method is part of the ReactiveContext, and available on every context and $scope.
    * These method are defined as Object, where each key is the name of the variable that will be available on the context we run, and each value is a function with a return value.
    * Under the hood, each helper starts a new Tracker.autorun. When its reactive dependencies change, the helper is rerun.
    * To trigger a rerun every time an specific Angular variable change, use getReactively](/api/1.3.1/get-reactively) to make your Angular variable reactive inside the helper its used in.
    * Each helper function should return a MongoDB Cursor and the helpers will expose it as a normal array to the context.
    *
    * @param definitions - Object containing `name` => `function` definition, where each name is a string and each function is the helper function. Should return a [MongoDB Cursor](http://docs.meteor.com/#/full/mongo_cursor)
    * @return This method returns this, which the the reactive context, in order to provide the ability to chain the logic.
    */
  def helpers(definitions: StringDictionary[js.Function0[Cursor[_, _]]]): IScope = js.native
  
  /**
    * A service which is a wrapper for Meteor.subscribe. It subscribes to a Meteor.publish method in the client and returns a AngularJS promise when ready.
    * Calling $scope.subscribe will automatically stop the subscription when the scope is destroyed.
    *
    * @param name - Name of the subscription. Matches the name of the server's publish() call.
    * @param publisherArguments - Optional arguments passed to publisher function on server.
    *
    * @return The promise solved successfully when subscription is ready. The success promise holds the subscription handle.
    */
  def subscribe(name: String, publisherArguments: js.Any*): IPromise[SubscriptionHandle] = js.native
}
