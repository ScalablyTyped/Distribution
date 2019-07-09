package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dotDensityGetSchemeByNameParams
  extends stdLib.Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemeByName)
    */
  var basemap: java.lang.String | Basemap
  /**
    * The name of the scheme to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemeByName)
    */
  var name: java.lang.String
  /**
    * The number of colors to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemeByName)
    */
  var numColors: scala.Double
}

object dotDensityGetSchemeByNameParams {
  @scala.inline
  def apply(
    basemap: java.lang.String | Basemap,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    numColors: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): dotDensityGetSchemeByNameParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, numColors = numColors, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[dotDensityGetSchemeByNameParams]
  }
}

