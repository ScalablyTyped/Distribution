package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearUnitProperties extends js.Object {
  /**
    * Specifies the value of the linear distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html#distance)
    *
    * @default 0
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the unit type of the linear distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html#units)
    */
  var units: js.UndefOr[feet | kilometers | meters | miles | `nautical-miles` | yards] = js.undefined
}

object LinearUnitProperties {
  @scala.inline
  def apply(
    distance: Int | Double = null,
    units: feet | kilometers | meters | miles | `nautical-miles` | yards = null
  ): LinearUnitProperties = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearUnitProperties]
  }
}

