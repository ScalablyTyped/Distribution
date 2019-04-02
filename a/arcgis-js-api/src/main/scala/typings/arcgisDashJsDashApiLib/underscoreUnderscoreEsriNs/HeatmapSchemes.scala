package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapSchemes
  extends stdLib.Object {
  /**
    * The ID of the basemap associated with the given schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#HeatmapSchemes)
    */
  var basemapId: java.lang.String
  /**
    * The heatmap color scheme best suited for the given basemap and geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#HeatmapSchemes)
    */
  var primaryScheme: HeatmapScheme
  /**
    * Additional heatmap color schemes that may be used to visualize data overlaid on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#HeatmapSchemes)
    */
  var secondarySchemes: js.Array[HeatmapScheme]
}

object HeatmapSchemes {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    primaryScheme: HeatmapScheme,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    secondarySchemes: js.Array[HeatmapScheme]
  ): HeatmapSchemes = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primaryScheme = primaryScheme, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondarySchemes = secondarySchemes)
  
    __obj.asInstanceOf[HeatmapSchemes]
  }
}

