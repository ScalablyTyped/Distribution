package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centuries
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.days
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decades
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hours
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.milliseconds
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.minutes
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.months
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.seconds
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.weeks
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    *
    * @default 0
    */
  var value: js.UndefOr[Double] = js.undefined
}

object TimeIntervalProperties {
  @scala.inline
  def apply(
    unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries = null,
    value: Int | Double = null
  ): TimeIntervalProperties = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeIntervalProperties]
  }
}

