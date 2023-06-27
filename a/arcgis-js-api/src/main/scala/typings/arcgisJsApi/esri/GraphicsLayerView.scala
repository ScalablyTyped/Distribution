package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsLayerView
  extends StObject
     with LayerView
     with HighlightLayerViewMixin {
  
  /**
  		 * Returns all graphics available for drawing in the layer view as a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GraphicsLayerView.html#queryGraphics)
  		 */
  def queryGraphics(): js.Promise[Collection[Graphic]] = js.native
}
