package typings.amapJsApi.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.OverlayGroup")
@js.native
/**
  * 覆盖物集合
  * @param overlays 覆盖物
  */
class OverlayGroup[O /* <: typings.amapJsApi.AMap.Overlay[_] */, ExtraData] ()
  extends typings.amapJsApi.AMap.OverlayGroup[O, ExtraData] {
  def this(overlays: O) = this()
  def this(overlays: js.Array[O]) = this()
}

