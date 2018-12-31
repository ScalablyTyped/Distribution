package typings
package angularDashMeteorLib.angularMod.meteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that connects a Meteor Object to an AngularJS scope variable.
  *
  * The object contains also all the properties from the generic type T,
  * unfortunately TypeScript doesn't at the moment allow to extend a generic type (see https://github.com/Microsoft/TypeScript/issues/2225 for details and updates).
  * For a workaround, you'll need to implement an interface which will merge AngularMeteorObject<T> together with T and cast it, like this:
  *
  * interface TodoAngularMeteorObject extends ITodo, AngularMeteorObject<ITodo> { }
  * var todo = <TodoAngularMeteorObject>$meteor.object(TodoCollection, 'TodoID');
  */
@js.native
trait AngularMeteorObject[T] extends js.Object {
  /**
    * Returns a copy of the AngularMeteorObject with all the AngularMeteor-specific internal properties removed.
    * The returned object is then safe to use as a parameter for method calls, or anywhere else where the data needs to be converted to JSON.
    */
  def getRawObject(): T = js.native
  /**
    * Reset the current value of the object to the one in the server.
    */
  def reset(): scala.Unit = js.native
  /**
    * @param [doc] - The doc to save to the Meteor Object. If nothing is passed, the method saves everything in the AngularMeteorObject as is.
    *              - Unchanged properties will be overridden with their existing values, which may trigger hooks.
    *              - If doc is passed, the method only updates the Meteor Object with the properties passed, and no other changes will be saved.
    *
    * @return Returns a promise with an error in case for an error or a number of successful docs changed in case of success.
    */
  def save(): angularLib.angularMod.angularNs.IPromise[scala.Double] = js.native
  def save(doc: T): angularLib.angularMod.angularNs.IPromise[scala.Double] = js.native
  /**
    * A shorten (Syntactic sugar) function for the $meteor.subscribe function.
    * Takes only one parameter and not returns a promise like $meteor.subscribe does.
    *
    * @param subscriptionName - The subscription name to subscribe to. Exactly like the first parameter in $meteor.subscribe service.
    */
  def subscribe(subscriptionName: java.lang.String): AngularMeteorObject[T] = js.native
}

