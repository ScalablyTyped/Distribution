package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap")
@js.native
object ^ extends js.Object {
  /**
    * 坐标转换
    */
  def convertFrom(
    lnglat: amapDashJsDashSdkLib.AMapNs.LngLat,
    `type`: java.lang.String,
    result: js.Function2[
      /* status */ java.lang.String, 
      /* result */ amapDashJsDashSdkLib.AMapNs.ConvertorResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def convertFrom(
    lnglat: js.Array[amapDashJsDashSdkLib.AMapNs.LngLat],
    `type`: java.lang.String,
    result: js.Function2[
      /* status */ java.lang.String, 
      /* result */ amapDashJsDashSdkLib.AMapNs.ConvertorResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def convertFrom(
    lnglat: js.Tuple2[scala.Double, scala.Double],
    `type`: java.lang.String,
    result: js.Function2[
      /* status */ java.lang.String, 
      /* result */ amapDashJsDashSdkLib.AMapNs.ConvertorResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * 加载插件
    * @param pluginNames
    * @param ready
    */
  def plugin(pluginNames: js.Array[java.lang.String]): scala.Unit = js.native
  def plugin(pluginNames: js.Array[java.lang.String], ready: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * 加载服务
    * @param serviceName
    * @param ready
    */
  def service(serviceName: java.lang.String): scala.Unit = js.native
  def service(serviceName: java.lang.String, ready: js.Function0[scala.Unit]): scala.Unit = js.native
}

