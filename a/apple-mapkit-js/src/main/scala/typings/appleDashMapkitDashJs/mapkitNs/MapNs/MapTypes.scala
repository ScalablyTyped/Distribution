package typings.appleDashMapkitDashJs.mapkitNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypes extends js.Object

@JSGlobal("mapkit.Map.MapTypes")
@js.native
object MapTypes extends js.Object {
  @js.native
  sealed trait Hybrid extends MapTypes
  
  @js.native
  sealed trait Satellite extends MapTypes
  
  @js.native
  sealed trait Standard extends MapTypes
  
  /* "hybrid" */ val Hybrid: typings.appleDashMapkitDashJs.mapkitNs.MapNs.MapTypes.Hybrid with String = js.native
  /* "satellite" */ val Satellite: typings.appleDashMapkitDashJs.mapkitNs.MapNs.MapTypes.Satellite with String = js.native
  /* "standard" */ val Standard: typings.appleDashMapkitDashJs.mapkitNs.MapNs.MapTypes.Standard with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MapTypes with String] = js.native
}

