package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`line-through`
import typings.arcgisJsApi.arcgisJsApiStrings.bold
import typings.arcgisJsApi.arcgisJsApiStrings.bolder
import typings.arcgisJsApi.arcgisJsApiStrings.italic
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.oblique
import typings.arcgisJsApi.arcgisJsApiStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontProperties extends js.Object {
  
  /**
    * The text decoration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#decoration)
    */
  var decoration: js.UndefOr[underline | `line-through` | none] = js.native
  
  /**
    * The font family of the text.
    *
    * The font family of the text. The possible values are dependent upon the layer type, and if you working with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for detailed explanation, or click the `Read more` below.  >>> esri-read-more **Font families for 3D SceneViews**  The supported font families for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) are dependent upon the fonts installed on the user's computer and web browser. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`.  **Font families for 2D MapImageLayer**  The supported font families for [MapImageLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) are dependent upon the fonts installed on the [ArcGIS Server](http://enterprise.arcgis.com/en/server/latest/get-started/windows/what-is-arcgis-for-server-.htm) that published the layer. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`.  **Font families for 2D FeatureLayer**, CSVLayer, StreamLayer, and TextSymbol  The supported font families are based on hosted fonts files in `.pbf` format. By default, the fonts available are mostly the same ones used by the Esri Vector Basemaps. These fonts are available via `https://static.arcgis.com/fonts`. The URL can be configured to point to your own font resources by setting the [esriConfig.fontsUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl) property. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`. This uses the `Arial Unicode MS` font file.  List of currently supported fonts: [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family)
    */
  var family: js.UndefOr[String] = js.native
  
  /**
    * The font size in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size)
    */
  var size: js.UndefOr[Double | String] = js.native
  
  /**
    * The text style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#style)
    */
  var style: js.UndefOr[normal | italic | oblique] = js.native
  
  /**
    * The text weight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#weight)
    */
  var weight: js.UndefOr[normal | bold | bolder | lighter] = js.native
}
object FontProperties {
  
  @scala.inline
  def apply(): FontProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontProperties]
  }
  
  @scala.inline
  implicit class FontPropertiesOps[Self <: FontProperties] (val x: Self) extends AnyVal {
    
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
    def setDecoration(value: underline | `line-through` | none): Self = this.set("decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoration: Self = this.set("decoration", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: normal | italic | oblique): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWeight(value: normal | bold | bolder | lighter): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
