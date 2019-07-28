package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapEvent extends js.Object

@JSGlobal("mapkit.MapEvent")
@js.native
object MapEvent extends js.Object {
  @js.native
  sealed trait MapTypeChange extends MapEvent
  
  @js.native
  sealed trait RegionChange extends MapEvent
  
  @js.native
  sealed trait RegionChangeEnd extends MapEvent
  
  @js.native
  sealed trait ScrollEnd extends MapEvent
  
  @js.native
  sealed trait ScrollStart extends MapEvent
  
  @js.native
  sealed trait ZoomEnd extends MapEvent
  
  @js.native
  sealed trait ZoomStart extends MapEvent
  
  /* "map-type-change" */ val MapTypeChange: typings.appleDashMapkitDashJs.mapkitNs.MapEvent.MapTypeChange with String = js.native
  /* "region-change-start" */ val RegionChange: typings.appleDashMapkitDashJs.mapkitNs.MapEvent.RegionChange with String = js.native
  /* "region-change-end" */ val RegionChangeEnd: typings.appleDashMapkitDashJs.mapkitNs.MapEvent.RegionChangeEnd with String = js.native
  /* "scroll-end" */ val ScrollEnd: typings.appleDashMapkitDashJs.mapkitNs.MapEvent.ScrollEnd with String = js.native
  /* "scroll-start" */ val ScrollStart: typings.appleDashMapkitDashJs.mapkitNs.MapEvent.ScrollStart with String = js.native
  /* "zoom-end" */ val ZoomEnd: typings.appleDashMapkitDashJs.mapkitNs.MapEvent.ZoomEnd with String = js.native
  /* "zoom-start" */ val ZoomStart: typings.appleDashMapkitDashJs.mapkitNs.MapEvent.ZoomStart with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MapEvent with String] = js.native
}

