package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.light
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dotDensityGetSchemesByTagParams extends Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.native
  /**
    * When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The number of colors to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var numColors: Double = js.native
}

object dotDensityGetSchemesByTagParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numColors: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): dotDensityGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numColors = numColors.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[dotDensityGetSchemesByTagParams]
  }
  @scala.inline
  implicit class dotDensityGetSchemesByTagParamsOps[Self <: dotDensityGetSchemesByTagParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNumColors(value: Double): Self = this.set("numColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    @scala.inline
    def setBasemapTheme(value: light | dark): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemapTheme: Self = this.set("basemapTheme", js.undefined)
    @scala.inline
    def setExcludedTagsVarargs(value: String*): Self = this.set("excludedTags", js.Array(value :_*))
    @scala.inline
    def setExcludedTags(value: js.Array[String]): Self = this.set("excludedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedTags: Self = this.set("excludedTags", js.undefined)
    @scala.inline
    def setIncludedTagsVarargs(value: String*): Self = this.set("includedTags", js.Array(value :_*))
    @scala.inline
    def setIncludedTags(value: js.Array[String]): Self = this.set("includedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedTags: Self = this.set("includedTags", js.undefined)
  }
  
}

