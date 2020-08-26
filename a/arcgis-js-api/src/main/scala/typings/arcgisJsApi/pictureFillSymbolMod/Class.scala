package typings.arcgisJsApi.pictureFillSymbolMod

import typings.arcgisJsApi.esri.PictureFillSymbol
import typings.arcgisJsApi.esri.PictureFillSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/PictureFillSymbol", JSImport.Namespace)
@js.native
/**
  * PictureFillSymbol uses an image in a repeating pattern to symbolize polygon features in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). A [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#url) must point to a valid image. In addition, the symbol can have an optional [outline](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#outline), which is defined by a [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html). PictureFillSymbols may be applied to polygon features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or an individual [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html)
  */
class Class () extends PictureFillSymbol {
  def this(properties: PictureFillSymbolProperties) = this()
}

