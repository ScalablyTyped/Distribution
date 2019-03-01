package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSchemeForPoint
  extends stdLib.Object
     with SizeScheme {
  /**
    * The fill color of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPoint)
    */
  var color: Color
  /**
    * The maximum size of a marker symbol in pixels or points representing features with high data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPoint)
    */
  var maxSize: scala.Double
  /**
    * The minimum size of a marker symbol in pixels or points representing features with low data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPoint)
    */
  var minSize: scala.Double
  /**
    * The color of the marker symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPoint)
    */
  var noDataColor: Color
  /**
    * The size of the marker symbol (in pixels or points) used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPoint)
    */
  var noDataSize: scala.Double
  /**
    * The opacity of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPoint)
    */
  var opacity: scala.Double
  /**
    * Properties for defining the outline of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPoint)
    */
  var outline: SizeSchemeForPointOutline
  /**
    * The default size of the marker symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPoint)
    */
  var size: scala.Double
}

object SizeSchemeForPoint {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    maxSize: scala.Double,
    minSize: scala.Double,
    noDataColor: Color,
    noDataSize: scala.Double,
    opacity: scala.Double,
    outline: SizeSchemeForPointOutline,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    size: scala.Double
  ): SizeSchemeForPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("maxSize")(maxSize)
    __obj.updateDynamic("minSize")(minSize)
    __obj.updateDynamic("noDataColor")(noDataColor)
    __obj.updateDynamic("noDataSize")(noDataSize)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("outline")(outline)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SizeSchemeForPoint]
  }
}

