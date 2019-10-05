package typings.amapDashJsDashApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ArrayBounds")
@js.native
class ArrayBounds protected () extends js.Object {
  def this(bounds: js.Array[LocationValue]) = this()
  var bounds: js.Array[LngLat] = js.native
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  def contains(point: LocationValue): Boolean = js.native
  def getCenter(): LngLat = js.native
  // internal
  def toBounds(): Bounds = js.native
}

