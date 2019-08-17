package typings.amapDashJsDashApi.AMapNs

import typings.amapDashJsDashApi.AMapNs.GeoJSONNs.GeoJSONObject
import typings.amapDashJsDashApi.AMapNs.GeoJSONNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.GeoJSON")
@js.native
/**
  * GeoJSON
  * @param options 选项
  */
class GeoJSON[ExtraData] ()
  extends OverlayGroup[Overlay[js.Any], ExtraData] {
  def this(options: Options) = this()
  def importData(obj: js.Array[GeoJSONObject]): Unit = js.native
  /**
    * 加载新的GeoJSON对象，转化为覆盖物，旧的覆盖物将移除
    * @param obj GeoJSON对象
    */
  def importData(obj: GeoJSONObject): Unit = js.native
  /**
    * 将当前对象包含的覆盖物转换为GeoJSON对象
    */
  def toGeoJSON(): js.Array[GeoJSONObject] = js.native
}

