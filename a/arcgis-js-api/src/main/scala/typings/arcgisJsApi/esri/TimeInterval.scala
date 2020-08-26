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
trait TimeInterval extends JSONSupport {
  /**
    * Temporal units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  var unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries = js.native
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    *
    * @default 0
    */
  var value: Double = js.native
}

object TimeInterval {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries,
    value: Double
  ): TimeInterval = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval]
  }
  @scala.inline
  implicit class TimeIntervalOps[Self <: TimeInterval] (val x: Self) extends AnyVal {
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

