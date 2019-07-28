package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap")
@js.native
object ^ extends js.Object {
  def convertFrom(
    lnglat: js.Array[LngLat],
    `type`: String,
    result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
  ): Unit = js.native
  def convertFrom(
    lnglat: js.Tuple2[Double, Double],
    `type`: String,
    result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
  ): Unit = js.native
  /**
    * 坐标转换
    */
  def convertFrom(
    lnglat: LngLat,
    `type`: String,
    result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
  ): Unit = js.native
  /**
    * 加载插件
    * @param pluginNames
    * @param ready
    */
  def plugin(pluginNames: js.Array[String]): Unit = js.native
  def plugin(pluginNames: js.Array[String], ready: js.Function0[Unit]): Unit = js.native
  /**
    * 加载服务
    * @param serviceName
    * @param ready
    */
  def service(serviceName: String): Unit = js.native
  def service(serviceName: String, ready: js.Function0[Unit]): Unit = js.native
}

