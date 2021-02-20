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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontProperties extends StObject {
  
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
  implicit class FontPropertiesMutableBuilder[Self <: FontProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecoration(value: underline | `line-through` | none): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: normal | italic | oblique): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWeight(value: normal | bold | bolder | lighter): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
