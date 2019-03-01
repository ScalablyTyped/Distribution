package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSchemeForPolygon
  extends stdLib.Object
     with SizeScheme {
  /**
    * The schema defining the backgound symbol of the feature. This is a fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var background: SizeSchemeForPolygonBackground
  /**
    * The scheme defining the symbology of the marker symbol used to represent polygon features by size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var marker: SizeSchemeForPoint
  /**
    * The opacity of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var opacity: scala.Double
}

object SizeSchemeForPolygon {
  @scala.inline
  def apply(
    background: SizeSchemeForPolygonBackground,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    marker: SizeSchemeForPoint,
    opacity: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): SizeSchemeForPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("background")(background)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("marker")(marker)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[SizeSchemeForPolygon]
  }
}

