package typings
package appleDashMapkitDashJsLib.mapkitNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypes extends js.Object

@JSGlobal("mapkit.Map.MapTypes")
@js.native
object MapTypes extends js.Object {
  @js.native
  sealed trait Hybrid
    extends appleDashMapkitDashJsLib.mapkitNs.MapNs.MapTypes
  
  @js.native
  sealed trait Satellite
    extends appleDashMapkitDashJsLib.mapkitNs.MapNs.MapTypes
  
  @js.native
  sealed trait Standard
    extends appleDashMapkitDashJsLib.mapkitNs.MapNs.MapTypes
  
  /* "hybrid" */ val Hybrid: Hybrid with java.lang.String = js.native
  /* "satellite" */ val Satellite: Satellite with java.lang.String = js.native
  /* "standard" */ val Standard: Standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.MapNs.MapTypes with java.lang.String] = js.native
}

