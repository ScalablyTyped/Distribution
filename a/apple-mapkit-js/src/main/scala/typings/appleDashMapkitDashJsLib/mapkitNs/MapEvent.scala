package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapEvent extends js.Object

@JSGlobal("mapkit.MapEvent")
@js.native
object MapEvent extends js.Object {
  @js.native
  sealed trait MapTypeChange
    extends appleDashMapkitDashJsLib.mapkitNs.MapEvent
  
  @js.native
  sealed trait RegionChange
    extends appleDashMapkitDashJsLib.mapkitNs.MapEvent
  
  @js.native
  sealed trait RegionChangeEnd
    extends appleDashMapkitDashJsLib.mapkitNs.MapEvent
  
  @js.native
  sealed trait ScrollEnd
    extends appleDashMapkitDashJsLib.mapkitNs.MapEvent
  
  @js.native
  sealed trait ScrollStart
    extends appleDashMapkitDashJsLib.mapkitNs.MapEvent
  
  @js.native
  sealed trait ZoomEnd
    extends appleDashMapkitDashJsLib.mapkitNs.MapEvent
  
  @js.native
  sealed trait ZoomStart
    extends appleDashMapkitDashJsLib.mapkitNs.MapEvent
  
  /* "map-type-change" */ val MapTypeChange: MapTypeChange with java.lang.String = js.native
  /* "region-change-start" */ val RegionChange: RegionChange with java.lang.String = js.native
  /* "region-change-end" */ val RegionChangeEnd: RegionChangeEnd with java.lang.String = js.native
  /* "scroll-end" */ val ScrollEnd: ScrollEnd with java.lang.String = js.native
  /* "scroll-start" */ val ScrollStart: ScrollStart with java.lang.String = js.native
  /* "zoom-end" */ val ZoomEnd: ZoomEnd with java.lang.String = js.native
  /* "zoom-start" */ val ZoomStart: ZoomStart with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.MapEvent with java.lang.String] = js.native
}

