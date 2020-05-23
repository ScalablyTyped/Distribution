package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.GeoJSON.GeoJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSON_[ExtraData]
  extends OverlayGroup[Overlay[js.Any], ExtraData] {
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

