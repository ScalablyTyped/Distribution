package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipSchemeForPolyline
  extends stdLib.Object
     with RelationshipScheme {
  /**
    * Defines the colors to use in each bin of the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var colorsForClassBreaks: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks]
  /**
    * The ID uniquely identifying the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var id: java.lang.String
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var name: java.lang.String
  /**
    * The color of the line symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var noDataColor: Color
  /**
    * The opacity of the line symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var opacity: scala.Double
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var tags: js.Array[java.lang.String]
  /**
    * The width of the line symbol in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var width: scala.Double
}

object RelationshipSchemeForPolyline {
  @scala.inline
  def apply(
    colorsForClassBreaks: js.Array[RelationshipSchemeForPolylineColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    noDataColor: Color,
    opacity: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    tags: js.Array[java.lang.String],
    width: scala.Double
  ): RelationshipSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colorsForClassBreaks = colorsForClassBreaks, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, noDataColor = noDataColor, opacity = opacity, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags, width = width)
  
    __obj.asInstanceOf[RelationshipSchemeForPolyline]
  }
}

