package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dotDensityGetSchemesByTagParams
  extends stdLib.Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var basemap: java.lang.String | Basemap
  /**
    * When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var excludedTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var includedTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The number of colors to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var numColors: scala.Double
}

object dotDensityGetSchemesByTagParams {
  @scala.inline
  def apply(
    basemap: java.lang.String | Basemap,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    numColors: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    excludedTags: js.Array[java.lang.String] = null,
    includedTags: js.Array[java.lang.String] = null
  ): dotDensityGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numColors = numColors, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (excludedTags != null) __obj.updateDynamic("excludedTags")(excludedTags)
    if (includedTags != null) __obj.updateDynamic("includedTags")(includedTags)
    __obj.asInstanceOf[dotDensityGetSchemesByTagParams]
  }
}

