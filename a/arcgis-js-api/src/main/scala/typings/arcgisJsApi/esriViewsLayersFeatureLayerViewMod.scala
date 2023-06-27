package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureLayerView
import typings.arcgisJsApi.esri.FeatureLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsLayersFeatureLayerViewMod {
  
  @JSImport("esri/views/layers/FeatureLayerView", JSImport.Namespace)
  @js.native
  /**
  		 * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html)
  		 */
  open class ^ ()
    extends StObject
       with FeatureLayerView {
    def this(properties: FeatureLayerViewProperties) = this()
  }
}
