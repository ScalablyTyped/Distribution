package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait heatmapGetSchemeByNameParams
  extends stdLib.Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best colors for visualizing features against the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getSchemeByName)
    */
  var basemap: java.lang.String | Basemap
  /**
    * The name of the scheme to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getSchemeByName)
    */
  var name: java.lang.String
}

object heatmapGetSchemeByNameParams {
  @scala.inline
  def apply(
    basemap: java.lang.String | Basemap,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): heatmapGetSchemeByNameParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[heatmapGetSchemeByNameParams]
  }
}

