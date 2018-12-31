package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SupportedPermissions extends js.Object

@JSImport("actions-on-google/assistant-app", "SupportedPermissions")
@js.native
object SupportedPermissions extends js.Object {
  /**
    * City and zipcode corresponding to the location of the user's current device, as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#Location|Location object}.
    */
  @js.native
  sealed trait DEVICE_COARSE_LOCATION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SupportedPermissions
  
  /**
    * The location of the user's current device, as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#Location|Location object}.
    */
  @js.native
  sealed trait DEVICE_PRECISE_LOCATION
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SupportedPermissions
  
  /**
    * The user's name as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#UserProfile|UserProfile object}
    */
  @js.native
  sealed trait NAME
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SupportedPermissions
  
  /**
    * Confirmation to receive proactive content at any time from the app.
    */
  @js.native
  sealed trait UPDATE
    extends actionsDashOnDashGoogleLib.assistantDashAppMod.SupportedPermissions
  
  val DEVICE_COARSE_LOCATION: DEVICE_COARSE_LOCATION with java.lang.String = js.native
  val DEVICE_PRECISE_LOCATION: DEVICE_PRECISE_LOCATION with java.lang.String = js.native
  val NAME: NAME with java.lang.String = js.native
  val UPDATE: UPDATE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    actionsDashOnDashGoogleLib.assistantDashAppMod.SupportedPermissions with java.lang.String
  ] = js.native
}

