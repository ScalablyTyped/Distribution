package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudRendererColorModulation
  extends stdLib.Object {
  /**
    * Field to use for the color modulation. Commonly modulation is used with the `intensity` field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    */
  var field: java.lang.String
  /**
    * Field value at which the point color will be left unchanged.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    *
    * @default 255
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Field value at which the point color becomes darkest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    *
    * @default 0
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

object PointCloudRendererColorModulation {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null
  ): PointCloudRendererColorModulation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudRendererColorModulation]
  }
}

