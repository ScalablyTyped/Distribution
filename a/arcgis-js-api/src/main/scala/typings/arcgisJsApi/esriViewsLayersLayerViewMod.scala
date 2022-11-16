package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LayerView
import typings.arcgisJsApi.esri.LayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsLayersLayerViewMod {
  
  @JSImport("esri/views/layers/LayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the view for a single layer after it has been added to either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html)
    */
  open class ^ ()
    extends StObject
       with LayerView {
    def this(properties: LayerViewProperties) = this()
  }
}
