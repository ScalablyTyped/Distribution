package typings.amapDashJsDashApi.AMapNs

import typings.amapDashJsDashApi.AMapNs.PathOverlayNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.PathOverlay")
@js.native
abstract class PathOverlay[ExtraData] () extends ShapeOverlay[ExtraData] {
  def this(options: Options[ExtraData]) = this()
  /**
    * 获取范围
    */
  def getBounds(): js.UndefOr[Bounds | Null] = js.native
}

