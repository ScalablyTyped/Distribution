package typings.arcgisJsApi.symbolsMod

import typings.arcgisJsApi.esri.TextSymbol3DLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols", "TextSymbol3DLayer")
@js.native
/**
  * TextSymbol3DLayer is used to draw text labels for features of any geometry type. This is typically done by adding it to a [LabelSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html)
  */
class TextSymbol3DLayerCls ()
  extends typings.arcgisJsApi.esri.TextSymbol3DLayer {
  def this(properties: TextSymbol3DLayerProperties) = this()
}

