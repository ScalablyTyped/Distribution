package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Weather")
@js.native
class Weather () extends js.Object {
  /**
    * 查询四天预报天气，包括查询当天天气信息
    * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
    * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
    */
  def getForecast(
    district: java.lang.String,
    callback: js.Function2[/* errorStatus */ js.Any, /* result */ WeatherForecastResult, scala.Unit]
  ): scala.Unit = js.native
  /**
    * 查询实时天气信息
    * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
    * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
    */
  def getLive(
    district: java.lang.String,
    callback: js.Function2[/* errorStatus */ js.Any, /* result */ WeatherLiveResult, scala.Unit]
  ): scala.Unit = js.native
}

