package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.centuries
import typings.arcgisJsApi.arcgisJsApiStrings.days
import typings.arcgisJsApi.arcgisJsApiStrings.decades
import typings.arcgisJsApi.arcgisJsApiStrings.hours
import typings.arcgisJsApi.arcgisJsApiStrings.milliseconds
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.months
import typings.arcgisJsApi.arcgisJsApiStrings.seconds
import typings.arcgisJsApi.arcgisJsApiStrings.weeks
import typings.arcgisJsApi.arcgisJsApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeIntervalProperties extends js.Object {
  /**
    * Temporal units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  var unit: js.UndefOr[
    milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
  ] = js.native
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    *
    * @default 0
    */
  var value: js.UndefOr[Double] = js.native
}

object TimeIntervalProperties {
  @scala.inline
  def apply(): TimeIntervalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeIntervalProperties]
  }
  @scala.inline
  implicit class TimeIntervalPropertiesOps[Self <: TimeIntervalProperties] (val x: Self) extends AnyVal {
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
    def setUnit(
      value: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
    ): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

