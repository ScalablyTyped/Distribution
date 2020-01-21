package typings.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  *
  * <p>A AV.User object is a local representation of a user persisted to the
  * AV cloud. This class is a subclass of a AV.Object, and retains the
  * same functionality of a AV.Object, but also extends it with various
  * user specific methods, like authentication, signing up, and validation of
  * uniqueness.</p>
  */
@JSImport("avoscloud-sdk", "User")
@js.native
class User () extends Object {
  def authenticated(): Boolean = js.native
  def fetch[T](options: SuccessFailureOptions): Promise[T] = js.native
  def getEmail(): String = js.native
  def getSessionToken(): String = js.native
  def getUsername(): String = js.native
  def isCurrent(): Boolean = js.native
  def logIn[T](): Promise[T] = js.native
  def logIn[T](options: SuccessFailureOptions): Promise[T] = js.native
  def save[T](arg1: js.Any): Promise[T] = js.native
  def save[T](arg1: js.Any, arg2: js.Any): Promise[T] = js.native
  def save[T](arg1: js.Any, arg2: js.Any, arg3: js.Any): Promise[T] = js.native
  def setEmail(email: String, options: SuccessFailureOptions): Boolean = js.native
  def setPassword(password: String): Boolean = js.native
  def setPassword(password: String, options: SuccessFailureOptions): Boolean = js.native
  def setUsername(username: String): Boolean = js.native
  def setUsername(username: String, options: SuccessFailureOptions): Boolean = js.native
  def signUp[T](attrs: js.Any): Promise[T] = js.native
  def signUp[T](attrs: js.Any, options: SuccessFailureOptions): Promise[T] = js.native
}

/* static members */
@JSImport("avoscloud-sdk", "User")
@js.native
object User extends js.Object {
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  def become[T](sessionToken: String): Promise[T] = js.native
  def become[T](sessionToken: String, options: SuccessFailureOptions): Promise[T] = js.native
  def current(): User = js.native
  def logIn[T](username: String, password: String): Promise[T] = js.native
  def logIn[T](username: String, password: String, options: SuccessFailureOptions): Promise[T] = js.native
  def logOut[T](): Promise[T] = js.native
  def requestPasswordReset[T](email: String): Promise[T] = js.native
  def requestPasswordReset[T](email: String, options: SuccessFailureOptions): Promise[T] = js.native
  def signUp[T](username: String, password: String, attrs: js.Any): Promise[T] = js.native
  def signUp[T](username: String, password: String, attrs: js.Any, options: SuccessFailureOptions): Promise[T] = js.native
}

