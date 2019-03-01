package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the unit type of the linear distance.  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LinearUnit.html#units)
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object LinearUnitProperties {
  @scala.inline
  def apply(distance: scala.Int | scala.Double = null, units: java.lang.String = null): LinearUnitProperties = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[LinearUnitProperties]
  }
}

