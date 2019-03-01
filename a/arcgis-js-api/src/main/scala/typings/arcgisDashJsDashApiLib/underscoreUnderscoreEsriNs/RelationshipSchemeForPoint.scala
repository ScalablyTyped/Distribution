package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipSchemeForPoint
  extends stdLib.Object
     with RelationshipScheme {
  /**
    * Defines the colors to use in each bin of the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var colorsForClassBreaks: js.Array[RelationshipSchemeForPointColorsForClassBreaks]
  /**
    * The ID uniquely identifying the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var id: java.lang.String
  /**
    * The color of the point symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var noDataColor: Color
  /**
    * The opacity of the point symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var opacity: scala.Double
  /**
    * Properties for defining the outline of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var outline: RelationshipSchemeForPointOutline
  /**
    * The size of the point symbol in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var size: scala.Double
}

object RelationshipSchemeForPoint {
  @scala.inline
  def apply(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPointColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: java.lang.String,
    noDataColor: Color,
    opacity: scala.Double,
    outline: RelationshipSchemeForPointOutline,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    size: scala.Double
  ): RelationshipSchemeForPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colorsForClassBreaks")(colorsForClassBreaks)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("noDataColor")(noDataColor)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("outline")(outline)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[RelationshipSchemeForPoint]
  }
}

