package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.light
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dotDensityGetSchemesParams extends Object {
  /**
    * The Esri basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features against the given basemap. If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, then use the `basemapTheme` parameter instead of this parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.native
  /**
    * The number of colors to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  var numColors: Double = js.native
}

object dotDensityGetSchemesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numColors: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): dotDensityGetSchemesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numColors = numColors.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[dotDensityGetSchemesParams]
  }
  @scala.inline
  implicit class dotDensityGetSchemesParamsOps[Self <: dotDensityGetSchemesParams] (val x: Self) extends AnyVal {
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
  }
  
}

