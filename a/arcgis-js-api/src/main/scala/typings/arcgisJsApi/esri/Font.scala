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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The text decoration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#decoration)
    */
  var decoration: underline | `line-through` | none = js.native
  
  /**
    * The font family of the text.
    *
    * The font family of the text. The possible values are dependent upon the layer type, and if you working with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [Labeling guide page](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for detailed explanation, or click the `Read more` below.  >>> esri-read-more **Font families for 3D SceneViews**  The supported font families for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) are dependent upon the fonts installed on the user's computer and web browser. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`.  **Font families for 2D MapImageLayer**  The supported font families for [MapImageLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) are dependent upon the fonts installed on the [ArcGIS Server](http://enterprise.arcgis.com/en/server/latest/get-started/windows/what-is-arcgis-for-server-.htm) that published the layer. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`.  **Font families for 2D FeatureLayer**, CSVLayer, StreamLayer, and TextSymbol  The supported font families are based on hosted fonts files in `.pbf` format. By default, the fonts available are mostly the same ones used by the Esri Vector Basemaps. These fonts are available via `https://static.arcgis.com/fonts`. The URL can be configured to point to your own font resources by setting the [esriConfig.fontsUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#fontsUrl) property. If an app uses a font that is not installed, the Font class implements a fallback mechanism that will use the default font family value, which is `sans-serif`. This uses the `Arial Unicode MS` font file.  List of currently supported fonts: [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#family)
    */
  var family: String = js.native
  
  /**
    * The font size in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#size)
    */
  var size: Double = js.native
  
  /**
    * The text style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#style)
    */
  var style: normal | italic | oblique = js.native
  
  /**
    * The text weight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Font.html#weight)
    */
  var weight: normal | bold | bolder | lighter = js.native
}
