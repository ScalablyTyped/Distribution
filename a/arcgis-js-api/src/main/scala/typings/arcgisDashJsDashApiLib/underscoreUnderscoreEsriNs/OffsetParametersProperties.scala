package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetParametersProperties extends js.Object {
  /**
    * The `bevelRatio` is multiplied by the offset distance and the result determines how far a mitered offset intersection can be located before it is beveled. When mitered is specified, the value set for `bevelRatio` is ignored and `10` is used internally. If beveled is specified, `1.1` will be used if no value is set for bevelRatio. The bevelRatio is ignored when `rounded` is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#bevelRatio)
    */
  var bevelRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * The array of geometries to be offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  /**
    * Specifies the planar distance for constructing an offset based on the input geometries. If the `offsetDistance` parameter is positive, the constructed offset will be on the right side of the curve. Left side offsets are constructed with negative values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetDistance)
    */
  var offsetDistance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Options that determine how the ends intersect. Set to one of the following options:
    *
    * Possible Value | Description
    * ---------------|-------------
    * bevelled | Squares off the corner after a given ratio distance.
    * mitered | Attempts to allow extended offsets to naturally intersect. If the intersection occurs too far from a corner, the corner will be beveled off at a fixed distance.
    * rounded | Rounds the corner between extended offsets.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetHow)
    */
  var offsetHow: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The offset distance unit. For a list of valid units see [esriSRUnitType constants](http://resources.esri.com/help/9.3/ArcGISDesktop/ArcObjects/esriGeometry/esriSRUnitType.htm) or [esriSRUnit2Type constants](http://resources.esri.com/help/9.3/ArcGISDesktop/ArcObjects/esriGeometry/esriSRUnit2Type.htm).  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetUnit)
    */
  var offsetUnit: js.UndefOr[java.lang.String] = js.undefined
}

object OffsetParametersProperties {
  @scala.inline
  def apply(
    bevelRatio: scala.Int | scala.Double = null,
    geometries: js.Array[GeometryProperties] = null,
    offsetDistance: scala.Int | scala.Double = null,
    offsetHow: java.lang.String = null,
    offsetUnit: java.lang.String = null
  ): OffsetParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (bevelRatio != null) __obj.updateDynamic("bevelRatio")(bevelRatio.asInstanceOf[js.Any])
    if (geometries != null) __obj.updateDynamic("geometries")(geometries)
    if (offsetDistance != null) __obj.updateDynamic("offsetDistance")(offsetDistance.asInstanceOf[js.Any])
    if (offsetHow != null) __obj.updateDynamic("offsetHow")(offsetHow)
    if (offsetUnit != null) __obj.updateDynamic("offsetUnit")(offsetUnit)
    __obj.asInstanceOf[OffsetParametersProperties]
  }
}

