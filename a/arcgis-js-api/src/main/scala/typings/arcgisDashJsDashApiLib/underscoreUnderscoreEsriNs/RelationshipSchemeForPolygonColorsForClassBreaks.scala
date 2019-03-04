package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipSchemeForPolygonColorsForClassBreaks
  extends stdLib.Object {
  /**
    * The colors of the fill symbols used for each bin in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var colors: js.Array[js.Array[Color]]
  /**
    * The number of breaks (rows/columns) for each variable in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolygon)
    */
  var numClasses: scala.Double
}

object RelationshipSchemeForPolygonColorsForClassBreaks {
  @scala.inline
  def apply(
    colors: js.Array[js.Array[Color]],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    numClasses: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): RelationshipSchemeForPolygonColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = hasOwnProperty, numClasses = numClasses, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[RelationshipSchemeForPolygonColorsForClassBreaks]
  }
}

