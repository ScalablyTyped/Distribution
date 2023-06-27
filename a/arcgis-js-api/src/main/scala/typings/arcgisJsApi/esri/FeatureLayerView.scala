package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerView
  extends StObject
     with LayerView
     with LayerView2DMixin
     with HighlightLayerViewMixin {
  
  /**
  		 * The layer being viewed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#layer)
  		 */
  @JSName("layer")
  val layer_FeatureLayerView: FeatureLayer = js.native
}
