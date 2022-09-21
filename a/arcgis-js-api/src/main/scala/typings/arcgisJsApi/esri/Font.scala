package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`line-through`
import typings.arcgisJsApi.arcgisJsApiStrings.bold_
import typings.arcgisJsApi.arcgisJsApiStrings.bolder
import typings.arcgisJsApi.arcgisJsApiStrings.italic_
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.oblique
import typings.arcgisJsApi.arcgisJsApiStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The text decoration.
    *
    * @default none
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#decoration)
    */
  var decoration: underline | `line-through` | none_ = js.native
  
  /**
    * The font family of the text.
    *
    * @default sans-serif
    *
    * The font family of the text. The possible values are dependent upon the layer type, and if you are working with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/labeling/) for detailed explanation, or click the `Read more` below.  >>> esri-read-more **Font families for 3D SceneViews**  The supported font families for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) are dependent upon the fonts installed on the user's computer and web browser. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`. See these references for instructions on how to install a new font on [Windows](https://support.microsoft.com/en-us/help/314960/how-to-install-or-remove-a-font-in-windows) or [Mac](https://support.apple.com/en-us/ht201749).  Fonts that are not installed locally can also be loaded from a url by defining a [@font-face](https://developer.mozilla.org/en-US/docs/Web/CSS/@font-face) in a css file and referencing it from the `family` property in a symbol layer.  **Font families for 2D MapImageLayer**  The supported font families for [MapImageLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) are dependent upon the fonts installed on the [ArcGIS Server](https://enterprise.arcgis.com/en/server/latest/get-started/windows/what-is-arcgis-for-server-.htm) that published the layer. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`.  **Font families for 2D FeatureLayer**, CSVLayer, StreamLayer, and TextSymbol  The supported font families are based on hosted fonts files in `.pbf` format. By default, the fonts available are mostly the same ones used by the Esri Vector Basemaps. These fonts are available via `https://static.arcgis.com/fonts`. The URL can be configured to point to your own font resources by setting the [esriConfig.fontsUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl) property. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`. This uses the `Arial Unicode MS` font file.  > A preview of the fonts listed in the following table are available in the [Labeling](https://developers.arcgis.com/javascript/latest/labeling/) overview page.  List of fonts currently supported in a 2D MapView:  [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family)
    */
  var family: String = js.native
  
  /**
    * The font size in points.
    *
    * @default 9
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size)
    */
  var size: Double = js.native
  
  /**
    * The text style.
    *
    * @default normal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#style)
    */
  var style: normal | italic_ | oblique = js.native
  
  /**
    * The text weight.
    *
    * @default normal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#weight)
    */
  var weight: normal | bold_ | bolder | lighter = js.native
}
