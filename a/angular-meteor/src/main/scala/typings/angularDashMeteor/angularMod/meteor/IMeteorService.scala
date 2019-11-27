package typings.angularDashMeteor.angularMod.meteor

import typings.angular.angularMod.IPromise
import typings.angular.angularMod._Global_.Function
import typings.angularDashMeteor.Anon_Bind
import typings.angularDashMeteor.Anon_Email
import typings.angularDashMeteor.Anon_EmailPassword
import typings.angularDashMeteor.Anon_Height
import typings.angularDashMeteor.Anon_Id
import typings.angularDashMeteor.Anon_Username
import typings.meteor.Meteor.LoginWithExternalServiceOptions
import typings.meteor.Meteor.SubscriptionHandle
import typings.meteor.Meteor.User
import typings.meteor.Mongo.Collection
import typings.meteor.Mongo.ObjectID
import typings.meteor.Mongo.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $meteor in angularjs
  */
@js.native
trait IMeteorService extends js.Object {
  @JSName("loginWithFacebook")
  var loginWithFacebook_Original: ILoginWithExternalService = js.native
  @JSName("loginWithGithub")
  var loginWithGithub_Original: ILoginWithExternalService = js.native
  @JSName("loginWithGoogle")
  var loginWithGoogle_Original: ILoginWithExternalService = js.native
  @JSName("loginWithMeetup")
  var loginWithMeetup_Original: ILoginWithExternalService = js.native
  @JSName("loginWithTwitter")
  var loginWithTwitter_Original: ILoginWithExternalService = js.native
  @JSName("loginWithWeibo")
  var loginWithWeibo_Original: ILoginWithExternalService = js.native
  // <- User Authentication END
  // $meteorUtils BEGIN ->
  /**
    * @param scope - The AngularJS scope you use the autorun on.
    * @param fn - The function that will re-run every time a reactive variable changes inside it.
    */
  def autorun(scope: typings.angular.angularMod.IScope, fn: Function): Unit = js.native
  /**
    * A service service which wraps up Meteor.methods with AngularJS promises.
    *
    * @param name - Name of method to invoke
    * @param methodArguments - Optional method arguments
    *
    * @return The promise solves successfully with the return value of the method or return reject with the error from the method.
    */
  def call[T](name: String, methodArguments: js.Any*): IPromise[T] = js.native
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
  def collection[T](collection: Collection[T]): AngularMeteorCollection[T] = js.native
  def collection[T](collection: Collection[T], autoClientSave: Boolean): AngularMeteorCollection[T] = js.native
  def collection[T, U](collection: js.Function0[T], autoClientSave: Boolean, updateCollection: Collection[U]): AngularMeteorCollection2[T, U] = js.native
  def collection[T, U](collection: Function, autoClientSave: Boolean, updateCollection: Collection[U]): AngularMeteorCollection2[T, U] = js.native
  def collection[T, U](collection: ReactiveResult, autoClientSave: Boolean, updateCollection: Collection[U]): AngularMeteorCollection2[T, U] = js.native
  /**
    * A service that wraps the Meteor collections to enable reactivity within AngularJS.
    *
    * @param collection - A Meteor Collection or a reactive function to bind to.
    *                   - Reactive function can be used with $scope.getReactively to add $scope variable as reactive variable to the cursor.
    * @param [autoClientSave=true] - By default, changes in the Angular collection will automatically update the Meteor collection.
    *                              - However if set to false, changes in the client won't be automatically propagated back to the Meteor collection.
    * @param [updateCollection] - A collection object which will be used for updates (insert, update, delete).
    */
  def collection[T, U](collection: Collection[T], autoClientSave: Boolean, updateCollection: Collection[U]): AngularMeteorCollection2[T, U] = js.native
  /**
    * Create a new user. More information: http://docs.meteor.com/#/full/accounts_createuser
    *
    * @param options.username - A unique name for this user. Either this, or email is required.
    * @param options.email - The user's email address. Either this, or username is required.
    * @param options.password - The user's password. This is not sent in plain text over the wire.
    * @param options.profile - The user's profile, typically including the name field.
    */
  def createUser(options: Anon_EmailPassword): IPromise[Unit] = js.native
  /**
    * Request a forgot password email.
    *
    * @param options.email - The email address to send a password reset link.
    */
  def forgotPassword(options: Anon_Email): IPromise[Unit] = js.native
  /**
    * @param collectionName - The name of the collection you want to get back
    */
  def getCollectionByName[T](collectionName: String): Collection[T] = js.native
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
  def getPicture(): IPromise[_] = js.native
  def getPicture(options: Anon_Height): IPromise[_] = js.native
  def loginWithFacebook(options: LoginWithExternalServiceOptions): IPromise[Unit] = js.native
  def loginWithGithub(options: LoginWithExternalServiceOptions): IPromise[Unit] = js.native
  def loginWithGoogle(options: LoginWithExternalServiceOptions): IPromise[Unit] = js.native
  def loginWithMeetup(options: LoginWithExternalServiceOptions): IPromise[Unit] = js.native
  /**
    * Log the user in with a password.
    *
    * @param user - Either a string interpreted as a username or an email; or an object with a single key: email, username or id.
    * @param password - The user's password.
    */
  def loginWithPassword(user: String, password: String): IPromise[Unit] = js.native
  def loginWithPassword(user: Anon_Email, password: String): IPromise[Unit] = js.native
  def loginWithPassword(user: Anon_Id, password: String): IPromise[Unit] = js.native
  def loginWithPassword(user: Anon_Username, password: String): IPromise[Unit] = js.native
  def loginWithTwitter(options: LoginWithExternalServiceOptions): IPromise[Unit] = js.native
  def loginWithWeibo(options: LoginWithExternalServiceOptions): IPromise[Unit] = js.native
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
  def `object`[T](collection: Collection[T], selector: String): AngularMeteorObject[T] = js.native
  def `object`[T](collection: Collection[T], selector: String, autoClientSave: Boolean): AngularMeteorObject[T] = js.native
  def `object`[T](collection: Collection[T], selector: ObjectID): AngularMeteorObject[T] = js.native
  def `object`[T](collection: Collection[T], selector: ObjectID, autoClientSave: Boolean): AngularMeteorObject[T] = js.native
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
  def `object`[T](collection: Collection[T], selector: Selector[T]): AngularMeteorObject[T] = js.native
  def `object`[T](collection: Collection[T], selector: Selector[T], autoClientSave: Boolean): AngularMeteorObject[T] = js.native
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
  def session(sessionKey: String): Anon_Bind = js.native
  /**
    * A service which is a wrapper for Meteor.subscribe. It subscribes to a Meteor.publish method in the client and returns a AngularJS promise when ready.
    *
    * @param name - Name of the subscription. Matches the name of the server's publish() call.
    * @param publisherArguments - Optional arguments passed to publisher function on server.
    *
    * @return The promise solved successfully when subscription is ready. The success promise holds the subscription handle.
    */
  def subscribe(name: String, publisherArguments: js.Any*): IPromise[SubscriptionHandle] = js.native
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

