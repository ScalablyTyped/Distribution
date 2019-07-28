package typings.actionsDashOnDashGoogle.assistantDashAppMod

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
  sealed trait DEVICE_COARSE_LOCATION extends SupportedPermissions
  
  /**
    * The location of the user's current device, as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#Location|Location object}.
    */
  @js.native
  sealed trait DEVICE_PRECISE_LOCATION extends SupportedPermissions
  
  /**
    * The user's name as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#UserProfile|UserProfile object}
    */
  @js.native
  sealed trait NAME extends SupportedPermissions
  
  /**
    * Confirmation to receive proactive content at any time from the app.
    */
  @js.native
  sealed trait UPDATE extends SupportedPermissions
  
  /* 2 */ val DEVICE_COARSE_LOCATION: typings.actionsDashOnDashGoogle.assistantDashAppMod.SupportedPermissions.DEVICE_COARSE_LOCATION with Double = js.native
  /* 1 */ val DEVICE_PRECISE_LOCATION: typings.actionsDashOnDashGoogle.assistantDashAppMod.SupportedPermissions.DEVICE_PRECISE_LOCATION with Double = js.native
  /* 0 */ val NAME: typings.actionsDashOnDashGoogle.assistantDashAppMod.SupportedPermissions.NAME with Double = js.native
  /* 3 */ val UPDATE: typings.actionsDashOnDashGoogle.assistantDashAppMod.SupportedPermissions.UPDATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportedPermissions with Double] = js.native
}

