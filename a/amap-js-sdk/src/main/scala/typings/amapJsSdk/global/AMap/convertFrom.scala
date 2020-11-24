package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.ConvertorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.convertFrom")
@js.native
object convertFrom extends js.Object {
  
  def apply(
    lnglat: js.Array[typings.amapJsSdk.AMap.LngLat],
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
    lnglat: typings.amapJsSdk.AMap.LngLat,
    `type`: String,
    result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
  ): Unit = js.native
}
