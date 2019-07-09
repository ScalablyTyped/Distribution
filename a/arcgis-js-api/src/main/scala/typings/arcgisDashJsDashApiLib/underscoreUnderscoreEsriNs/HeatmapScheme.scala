package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapScheme
  extends stdLib.Object {
  /**
    * A continuous color ramp used to construct a heatmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#HeatmapScheme)
    */
  var colors: js.Array[Color]
  /**
    * The unique id of the color scheme to usee in the visualization. The id is assigned based on the following template: `<themeName>/<basemapName>/<schemeName>`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#HeatmapScheme)
    */
  var id: java.lang.String
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#HeatmapScheme)
    */
  var name: java.lang.String
  /**
    * The opacity of the heatmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#HeatmapScheme)
    */
  var opacity: scala.Double
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#HeatmapScheme)
    */
  var tags: js.Array[java.lang.String]
}

object HeatmapScheme {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    opacity: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    tags: js.Array[java.lang.String]
  ): HeatmapScheme = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, opacity = opacity, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags)
  
    __obj.asInstanceOf[HeatmapScheme]
  }
}

