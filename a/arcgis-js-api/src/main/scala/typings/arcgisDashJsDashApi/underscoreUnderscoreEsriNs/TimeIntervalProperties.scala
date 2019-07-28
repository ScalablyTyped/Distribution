package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeIntervalProperties extends js.Object {
  /**
    * Temporal units.  **Possible Values:** milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  var unit: js.UndefOr[String] = js.undefined
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
  def apply(unit: String = null, value: Int | Double = null): TimeIntervalProperties = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeIntervalProperties]
  }
}

