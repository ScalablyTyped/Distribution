package typings.arcgisJsApi

import typings.arcgisJsApi.esri.StreamLayerView
import typings.arcgisJsApi.esri.StreamLayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsLayersStreamLayerViewMod {
  
  @JSImport("esri/views/layers/StreamLayerView", JSImport.Namespace)
  @js.native
  /**
  		 * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html)
  		 */
  open class ^ ()
    extends StObject
       with StreamLayerView {
    def this(properties: StreamLayerViewProperties) = this()
  }
}
