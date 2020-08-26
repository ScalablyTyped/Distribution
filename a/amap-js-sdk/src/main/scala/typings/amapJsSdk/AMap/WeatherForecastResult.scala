package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeatherForecastResult extends js.Object {
  var adcode: String = js.native
  var city: String = js.native
  var forecasts: js.Array[Forecast] = js.native
  var info: String = js.native
  var province: String = js.native
  var reportTime: String = js.native
}

object WeatherForecastResult {
  @scala.inline
  def apply(
    adcode: String,
    city: String,
    forecasts: js.Array[Forecast],
    info: String,
    province: String,
    reportTime: String
  ): WeatherForecastResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], forecasts = forecasts.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], reportTime = reportTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeatherForecastResult]
  }
  @scala.inline
  implicit class WeatherForecastResultOps[Self <: WeatherForecastResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdcode(value: String): Self = this.set("adcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setForecastsVarargs(value: Forecast*): Self = this.set("forecasts", js.Array(value :_*))
    @scala.inline
    def setForecasts(value: js.Array[Forecast]): Self = this.set("forecasts", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportTime(value: String): Self = this.set("reportTime", value.asInstanceOf[js.Any])
  }
  
}

