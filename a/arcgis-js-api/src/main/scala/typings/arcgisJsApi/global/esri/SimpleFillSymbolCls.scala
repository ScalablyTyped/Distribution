package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SimpleFillSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.SimpleFillSymbol")
@js.native
/**
  * SimpleFillSymbol is used for rendering 2D polygons in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). It can be filled with a solid [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#color), or a [pattern](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style). In addition, the symbol can have an optional [outline](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#outline), which is defined by a [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html)
  */
class SimpleFillSymbolCls ()
  extends typings.arcgisJsApi.esri.SimpleFillSymbol {
  def this(properties: SimpleFillSymbolProperties) = this()
}

