package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.convertFrom")
@js.native
object convertFrom extends js.Object {
  def apply(
    lnglat: js.Array[LngLat],
    `type`: String,
    result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
  ): Unit = js.native
  def apply(
    lnglat: js.Tuple2[Double, Double],
    `type`: String,
    result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
  ): Unit = js.native
  /**
    * 坐标转换
    */
  def apply(
    lnglat: LngLat,
    `type`: String,
    result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
  ): Unit = js.native
}

