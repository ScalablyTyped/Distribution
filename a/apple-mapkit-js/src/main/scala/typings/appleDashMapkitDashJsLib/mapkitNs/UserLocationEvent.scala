package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserLocationEvent extends js.Object

@JSGlobal("mapkit.UserLocationEvent")
@js.native
object UserLocationEvent extends js.Object {
  @js.native
  sealed trait UserLocationChange
    extends appleDashMapkitDashJsLib.mapkitNs.UserLocationEvent
  
  @js.native
  sealed trait UserLocationError
    extends appleDashMapkitDashJsLib.mapkitNs.UserLocationEvent
  
  /* "user-location-change" */ val UserLocationChange: UserLocationChange with java.lang.String = js.native
  /* "user-location-error" */ val UserLocationError: UserLocationError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.UserLocationEvent with java.lang.String] = js.native
}

