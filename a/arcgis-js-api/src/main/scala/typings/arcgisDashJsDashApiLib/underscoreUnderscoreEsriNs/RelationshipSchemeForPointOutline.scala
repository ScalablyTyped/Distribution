package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipSchemeForPointOutline
  extends stdLib.Object {
  /**
    * The outline color of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var color: Color
  /**
    * The width of the outline in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPoint)
    */
  var width: scala.Double
}

object RelationshipSchemeForPointOutline {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    width: scala.Double
  ): RelationshipSchemeForPointOutline = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, width = width)
  
    __obj.asInstanceOf[RelationshipSchemeForPointOutline]
  }
}

