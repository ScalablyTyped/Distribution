package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserLocationEvent extends js.Object

@JSGlobal("mapkit.UserLocationEvent")
@js.native
object UserLocationEvent extends js.Object {
  @js.native
  sealed trait UserLocationChange extends UserLocationEvent
  
  @js.native
  sealed trait UserLocationError extends UserLocationEvent
  
  /* "user-location-change" */ val UserLocationChange: typings.appleDashMapkitDashJs.mapkitNs.UserLocationEvent.UserLocationChange with String = js.native
  /* "user-location-error" */ val UserLocationError: typings.appleDashMapkitDashJs.mapkitNs.UserLocationEvent.UserLocationError with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UserLocationEvent with String] = js.native
}

