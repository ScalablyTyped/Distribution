package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudLayerElevationInfo
  extends stdLib.Object {
  /**
    * Defines how the points are placed on the vertical axis (z). Currently only `absolute-height` mode is supported.
    *
    * Mode | Description
    * ------|------------
    * absolute-height | Points are placed at an absolute elevation (z-value) above sea level. This z-value is determined by summing up the `offset` value and the point's z-value. It doesn't take the elevation of the terrain into account. This is the only supported elevation mode for a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#elevationInfo)
    */
  var mode: java.lang.String
  /**
    * An elevation offset, which is added to the vertical position of each point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#elevationInfo)
    *
    * @default 0
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The unit for `offset` values.  **Possible Values:** feet | meters | kilometers | miles | us-feet | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#elevationInfo)
    *
    * @default meters
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object PointCloudLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    mode: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    offset: scala.Int | scala.Double = null,
    unit: java.lang.String = null
  ): PointCloudLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[PointCloudLayerElevationInfo]
  }
}

