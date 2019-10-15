package typings.arcgisDashJsDashApi.esriSymbolsMod

import typings.arcgisDashJsDashApi.__esri.PictureFillSymbol
import typings.arcgisDashJsDashApi.__esri.PictureFillSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols", "PictureFillSymbol")
@js.native
/**
  * PictureFillSymbol uses an image in a repeating pattern to symbolize polygon features in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). A [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#url) must point to a valid image. In addition, the symbol can have an optional [outline](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#outline), which is defined by a [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html). PictureFillSymbols may be applied to polygon features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or an individual [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html)
  */
class PictureFillSymbolCls () extends PictureFillSymbol {
  def this(properties: PictureFillSymbolProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

