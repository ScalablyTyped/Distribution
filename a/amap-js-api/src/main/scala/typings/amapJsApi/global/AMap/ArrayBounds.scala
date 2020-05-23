package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ArrayBounds")
@js.native
class ArrayBounds protected ()
  extends typings.amapJsApi.AMap.ArrayBounds {
  def this(bounds: js.Array[LocationValue]) = this()
  /* CompleteClass */
  override var bounds: js.Array[typings.amapJsApi.AMap.LngLat] = js.native
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  /* CompleteClass */
  override def contains(point: LocationValue): Boolean = js.native
  /* CompleteClass */
  override def getCenter(): typings.amapJsApi.AMap.LngLat = js.native
  // internal
  /* CompleteClass */
  override def toBounds(): typings.amapJsApi.AMap.Bounds = js.native
}

