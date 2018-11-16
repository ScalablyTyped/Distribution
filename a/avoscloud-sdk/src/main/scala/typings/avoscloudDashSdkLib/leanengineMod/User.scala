package typings
package avoscloudDashSdkLib.leanengineMod

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
@JSImport("leanengine", "User")
@js.native
class User ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.User

/**
     * @class
     *
     * <p>A AV.User object is a local representation of a user persisted to the
     * AV cloud. This class is a subclass of a AV.Object, and retains the
     * same functionality of a AV.Object, but also extends it with various
     * user specific methods, like authentication, signing up, and validation of
     * uniqueness.</p>
     */
@JSImport("leanengine", "User")
@js.native
object User extends js.Object {
  def allowCustomUserClass(isAllowed: scala.Boolean): scala.Unit = js.native
  def become[T](sessionToken: java.lang.String): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
  def become[T](
    sessionToken: java.lang.String,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.SuccessFailureOptions
  ): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
  def current(): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.User = js.native
  def logIn[T](username: java.lang.String, password: java.lang.String): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
  def logIn[T](
    username: java.lang.String,
    password: java.lang.String,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.SuccessFailureOptions
  ): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
  def logOut[T](): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
  def requestPasswordReset[T](email: java.lang.String): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
  def requestPasswordReset[T](
    email: java.lang.String,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.SuccessFailureOptions
  ): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
  def signUp[T](username: java.lang.String, password: java.lang.String, attrs: js.Any): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
  def signUp[T](
    username: java.lang.String,
    password: java.lang.String,
    attrs: js.Any,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.SuccessFailureOptions
  ): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Promise[T] = js.native
}

