package typings.angularMeteor

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angular.mod.global.Function
import typings.angularMeteor.anon.Bind
import typings.angularMeteor.anon.Email
import typings.angularMeteor.anon.Height
import typings.angularMeteor.anon.Id
import typings.angularMeteor.anon.Password
import typings.angularMeteor.anon.Username
import typings.meteor.Meteor.LoginWithExternalServiceOptions
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Meteor.User
import typings.meteor.Mongo.Collection
import typings.meteor.Mongo.Cursor
import typings.meteor.Mongo.ObjectID
import typings.meteor.Mongo.Selector
import typings.meteor.Tracker.Computation
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object meteor {
    
    /**
      * An object that connects a Meteor Collection to an AngularJS scope variable
      */
    type AngularMeteorCollection[T] = AngularMeteorCollection2[T, T]
    
    /**
      * An object that connects a Meteor Collection to an AngularJS scope variable,
      * but can use a differen type for updates.
      */
    @js.native
    trait AngularMeteorCollection2[T, U]
      extends StObject
         with Array[T] {
      
      /**
        * @param [keys] - The keys of the object to remove from the Meteor Collection.
        *               - If nothing is passed, the method removes all the documents from the AngularMeteorCollection.
        *               - If an object is passed, the method removes the object with that key from the AngularMeteorCollection.
        *               - If an array is passed, the method removes all objects that matches the keys in the array from the AngularMeteorCollection.
        */
      def remove(): Unit = js.native
      def remove(keys: U): Unit = js.native
      def remove(keys: String): Unit = js.native
      def remove(keys: js.Array[Double | String]): Unit = js.native
      def remove(keys: Double): Unit = js.native
      
      /**
        * @param [docs] - The docs to save to the Meteor Collection.
        *               - If the docs parameter is empty, the method saves everything in the AngularMeteorCollection as is.
        *               - If an object is passed, the method pushes that object into the AngularMeteorCollection.
        *               - If an array is passed, the method pushes all objects in the array into the AngularMeteorCollection.
        */
      def save(): Unit = js.native
      def save(docs: U): Unit = js.native
      def save(docs: js.Array[U]): Unit = js.native
      
      /**
        * A shorten (Syntactic sugar) function for the $meteor.subscribe function.
        * Takes only one parameter and not returns a promise like $meteor.subscribe does.
        *
        * @param subscriptionName - The subscription name to subscribe to. Exactly like the first parameter in $meteor.subscribe service.
        */
      def subscribe(subscriptionName: String): AngularMeteorCollection2[T, U] = js.native
    }
    
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
    trait AngularMeteorObject[T] extends StObject {
      
      /**
        * Returns a copy of the AngularMeteorObject with all the AngularMeteor-specific internal properties removed.
        * The returned object is then safe to use as a parameter for method calls, or anywhere else where the data needs to be converted to JSON.
        */
      def getRawObject(): T = js.native
      
      /**
        * Reset the current value of the object to the one in the server.
        */
      def reset(): Unit = js.native
      
      /**
        * @param [doc] - The doc to save to the Meteor Object. If nothing is passed, the method saves everything in the AngularMeteorObject as is.
        *              - Unchanged properties will be overridden with their existing values, which may trigger hooks.
        *              - If doc is passed, the method only updates the Meteor Object with the properties passed, and no other changes will be saved.
        *
        * @return Returns a promise with an error in case for an error or a number of successful docs changed in case of success.
        */
      def save(): IPromise[Double] = js.native
      def save(doc: T): IPromise[Double] = js.native
      
      /**
        * A shorten (Syntactic sugar) function for the $meteor.subscribe function.
        * Takes only one parameter and not returns a promise like $meteor.subscribe does.
        *
        * @param subscriptionName - The subscription name to subscribe to. Exactly like the first parameter in $meteor.subscribe service.
        */
      def subscribe(subscriptionName: String): AngularMeteorObject[T] = js.native
    }
    
    type ILoginWithExternalService = js.Function1[/* options */ LoginWithExternalServiceOptions, IPromise[Unit]]
    
    /**
      * $meteor in angularjs
      */
    @js.native
    trait IMeteorService extends StObject {
      
      // <- User Authentication END
      // $meteorUtils BEGIN ->
      /**
        * @param scope - The AngularJS scope you use the autorun on.
        * @param fn - The function that will re-run every time a reactive variable changes inside it.
        */
      def autorun(scope: typings.angular.mod.IScope, fn: Function): Unit = js.native
      
      /**
        * A service service which wraps up Meteor.methods with AngularJS promises.
        *
        * @param name - Name of method to invoke
        * @param methodArguments - Optional method arguments
        *
        * @return The promise solves successfully with the return value of the method or return reject with the error from the method.
        */
      def call[T](name: String, methodArguments: Any*): IPromise[T] = js.native
      
      /**
        * Change the current user's password. Must be logged in.
        *
        * @param oldPassword - The user's current password. This is not sent in plain text over the wire.
        * @param newPassword - A new password for the user. This is not sent in plain text over the wire.
        */
      def changePassword(oldPassword: String, newPassword: String): IPromise[Unit] = js.native
      
      def collection[T](collection: js.Function0[T]): AngularMeteorCollection[T] = js.native
      def collection[T](collection: js.Function0[T], autoClientSave: Boolean): AngularMeteorCollection[T] = js.native
      def collection[T](collection: Function): AngularMeteorCollection[T] = js.native
      def collection[T](collection: Function, autoClientSave: Boolean): AngularMeteorCollection[T] = js.native
      def collection[T](collection: ReactiveResult): AngularMeteorCollection[T] = js.native
      def collection[T](collection: ReactiveResult, autoClientSave: Boolean): AngularMeteorCollection[T] = js.native
      /**
        * A service that wraps the Meteor collections to enable reactivity within AngularJS.
        *
        * @param collection - A Meteor Collection or a reactive function to bind to.
        *                   - Reactive function can be used with $scope.getReactively to add $scope variable as reactive variable to the cursor.
        * @param [autoClientSave=true] - By default, changes in the Angular collection will automatically update the Meteor collection.
        *                              - However if set to false, changes in the client won't be automatically propagated back to the Meteor collection.
        */
      def collection[T](collection: Collection[T, T]): AngularMeteorCollection[T] = js.native
      def collection[T](collection: Collection[T, T], autoClientSave: Boolean): AngularMeteorCollection[T] = js.native
      def collection[T, U](collection: js.Function0[T], autoClientSave: Boolean, updateCollection: Collection[U, U]): AngularMeteorCollection2[T, U] = js.native
      def collection[T, U](collection: Function, autoClientSave: Boolean, updateCollection: Collection[U, U]): AngularMeteorCollection2[T, U] = js.native
      def collection[T, U](collection: ReactiveResult, autoClientSave: Boolean, updateCollection: Collection[U, U]): AngularMeteorCollection2[T, U] = js.native
      /**
        * A service that wraps the Meteor collections to enable reactivity within AngularJS.
        *
        * @param collection - A Meteor Collection or a reactive function to bind to.
        *                   - Reactive function can be used with $scope.getReactively to add $scope variable as reactive variable to the cursor.
        * @param [autoClientSave=true] - By default, changes in the Angular collection will automatically update the Meteor collection.
        *                              - However if set to false, changes in the client won't be automatically propagated back to the Meteor collection.
        * @param [updateCollection] - A collection object which will be used for updates (insert, update, delete).
        */
      def collection[T, U](collection: Collection[T, T], autoClientSave: Boolean, updateCollection: Collection[U, U]): AngularMeteorCollection2[T, U] = js.native
      
      /**
        * Create a new user. More information: http://docs.meteor.com/#/full/accounts_createuser
        *
        * @param options.username - A unique name for this user. Either this, or email is required.
        * @param options.email - The user's email address. Either this, or username is required.
        * @param options.password - The user's password. This is not sent in plain text over the wire.
        * @param options.profile - The user's profile, typically including the name field.
        */
      def createUser(options: Password): IPromise[Unit] = js.native
      
      /**
        * Request a forgot password email.
        *
        * @param options.email - The email address to send a password reset link.
        */
      def forgotPassword(options: Email): IPromise[Unit] = js.native
      
      /**
        * @param collectionName - The name of the collection you want to get back
        */
      def getCollectionByName[T](collectionName: String): Collection[T, T] = js.native
      
      // <- $meteorUtils END
      // $meteorCamera BEGIN ->
      /**
        * A helper service for taking pictures across platforms.
        * Must add mdg:camera package to use! (meteor add mdg:camera)
        *
        * @param [options] - options is an optional argument that is an Object with the following possible keys:
        * @param options.width - An integer that specifies the minimum width of the returned photo.
        * @param options.height - An integer that specifies the minimum height of the returned photo.
        * @param options.quality - A number from 0 to 100 specifying the desired quality of JPEG encoding.
        *
        * @return The promise solved successfully when the picture is taken with the data as a parameter or rejected with an error as a parameter in case of error.
        */
      def getPicture(): IPromise[Any] = js.native
      def getPicture(options: Height): IPromise[Any] = js.native
      
      var loginWithFacebook: ILoginWithExternalService = js.native
      
      var loginWithGithub: ILoginWithExternalService = js.native
      
      var loginWithGoogle: ILoginWithExternalService = js.native
      
      var loginWithMeetup: ILoginWithExternalService = js.native
      
      /**
        * Log the user in with a password.
        *
        * @param user - Either a string interpreted as a username or an email; or an object with a single key: email, username or id.
        * @param password - The user's password.
        */
      def loginWithPassword(user: String, password: String): IPromise[Unit] = js.native
      def loginWithPassword(user: Email, password: String): IPromise[Unit] = js.native
      def loginWithPassword(user: Id, password: String): IPromise[Unit] = js.native
      def loginWithPassword(user: Username, password: String): IPromise[Unit] = js.native
      
      var loginWithTwitter: ILoginWithExternalService = js.native
      
      var loginWithWeibo: ILoginWithExternalService = js.native
      
      /**
        * Log the user out.
        *
        * @return Resolves with no arguments on success, or reject with a Error argument on failure.
        */
      def logout(): IPromise[Unit] = js.native
      
      /**
        * Log out other clients logged in as the current user, but does not log out the client that calls this function.
        * For example, when called in a user's browser, connections in that browser remain logged in,
        * but any other browsers or DDP clients logged in as that user will be logged out.
        *
        * @return Resolves with no arguments on success, or reject with a Error argument on failure.
        */
      def logoutOtherClients(): IPromise[Unit] = js.native
      
      def `object`[T](collection: Collection[T, T], selector: String): AngularMeteorObject[T] = js.native
      def `object`[T](collection: Collection[T, T], selector: String, autoClientSave: Boolean): AngularMeteorObject[T] = js.native
      def `object`[T](collection: Collection[T, T], selector: ObjectID): AngularMeteorObject[T] = js.native
      def `object`[T](collection: Collection[T, T], selector: ObjectID, autoClientSave: Boolean): AngularMeteorObject[T] = js.native
      /**
        * A service that wraps a Meteor object to enable reactivity within AngularJS.
        * Finds the first document that matches the selector, as ordered by sort and skip options. Wraps collection.findOne
        *
        * @param collection - A Meteor Collection to bind to.
        * @param selector - A query describing the documents to find or just the ID of the document.
        *                 - $meteor.object will find the first document that matches the selector,
        *                 - as ordered by sort and skip options, exactly like Meteor's collection.findOne
        * @param [autoClientSave=true] - By default, changes in the Angular object will automatically update the Meteor object.
        *                              - However if set to false, changes in the client won't be automatically propagated back to the Meteor object.
        */
      def `object`[T](collection: Collection[T, T], selector: Selector[T]): AngularMeteorObject[T] = js.native
      def `object`[T](collection: Collection[T, T], selector: Selector[T], autoClientSave: Boolean): AngularMeteorObject[T] = js.native
      
      /**
        * Resolves the promise successfully if a user is authenticated and rejects otherwise.
        * This is useful in cases where you want to require a route to have an authenticated user.
        * You can catch the rejected promise and redirect the unauthenticated user to a different page, such as the login page.
        * See the “Authentication with Routers” section of our tutorial for more information and a full example.
        */
      def requireUser(): IPromise[User] = js.native
      
      /**
        * Resolves the promise successfully if a user is authenticated and the validatorFn returns true; rejects otherwise.
        * This is useful in cases where you want to require a route to have an authenticated user and do extra validation like the user's role or group.
        * You can catch the rejected promise and redirect the unauthenticated user to a different page, such as the login page.
        * See the “Authentication with Routers” section of our tutorial for more information and a full example.
        *
        * The mandatory validator function will be called with the authenticated user as the single param and it's expected to return true in order to resolve.
        * If it returns a string, the promise will be rejected using said string as the reason.
        * Any other return (false, null, undefined) will be rejected with the default "FORBIDDEN" reason.
        */
      def requireValidUser(validatorFn: js.Function1[/* user */ User, Boolean | String]): IPromise[User] = js.native
      
      /**
        * Reset the password for a user using a token received in email. Logs the user in afterwards.
        *
        * @param token - The token retrieved from the reset password URL.
        * @param newPassword - A new password for the user. This is not sent in plain text over the wire.
        */
      def resetPassword(token: String, newPassword: String): IPromise[Unit] = js.native
      
      // <- $meteorCamera END
      /**
        * A service that binds a scope variable to a Meteor Session variable.
        *
        * @param sessionKey - The name of the session variable
        * @return An object with a single function bind - to bind to that variable.
        */
      def session(sessionKey: String): Bind = js.native
      
      /**
        * A service which is a wrapper for Meteor.subscribe. It subscribes to a Meteor.publish method in the client and returns a AngularJS promise when ready.
        *
        * @param name - Name of the subscription. Matches the name of the server's publish() call.
        * @param publisherArguments - Optional arguments passed to publisher function on server.
        *
        * @return The promise solved successfully when subscription is ready. The success promise holds the subscription handle.
        */
      def subscribe(name: String, publisherArguments: Any*): IPromise[SubscriptionHandle] = js.native
      
      /**
        * Marks the user's email address as verified. Logs the user in afterwards.
        *
        * @param token - The token retrieved from the reset password URL.
        */
      def verifyEmail(token: String): IPromise[Unit] = js.native
      
      // User Authentication BEGIN ->
      /**
        * Returns a promise fulfilled with the currentUser when the user subscription is ready.
        * This is useful when you want to grab the current user before the route is rendered.
        * If there is no logged in user, it will return null.
        * See the “Authentication with Routers” section of our tutorial for more information and a full example.
        */
      def waitForUser(): IPromise[User] = js.native
    }
    
    @js.native
    trait IRootScopeService
      extends StObject
         with typings.angular.mod.IRootScopeService {
      
      /**
        * The current logged in user and it's data. it is null if the user is not logged in. A reactive data source.
        */
      var currentUser: User = js.native
      
      /**
        * True if a login method (such as Meteor.loginWithPassword, Meteor.loginWithFacebook, or Accounts.createUser) is currently in progress.
        * A reactive data source. Can be use to display animation while user is logging in.
        */
      var loggingIn: Boolean = js.native
    }
    
    @js.native
    trait IScope
      extends StObject
         with IRootScopeService {
      
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
      def helpers(definitions: StringDictionary[js.Function0[Cursor[Any, Any]]]): IScope = js.native
      
      /**
        * A service which is a wrapper for Meteor.subscribe. It subscribes to a Meteor.publish method in the client and returns a AngularJS promise when ready.
        * Calling $scope.subscribe will automatically stop the subscription when the scope is destroyed.
        *
        * @param name - Name of the subscription. Matches the name of the server's publish() call.
        * @param publisherArguments - Optional arguments passed to publisher function on server.
        *
        * @return The promise solved successfully when subscription is ready. The success promise holds the subscription handle.
        */
      def subscribe(name: String, publisherArguments: Any*): IPromise[SubscriptionHandle] = js.native
    }
    
    trait ReactiveResult extends StObject
  }
}
