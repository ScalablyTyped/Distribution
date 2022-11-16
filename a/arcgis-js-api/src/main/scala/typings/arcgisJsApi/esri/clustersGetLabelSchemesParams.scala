package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait clustersGetLabelSchemesParams extends StObject {
  
  /**
    * The point layer that has or will have clustering enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#getLabelSchemes)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
  
  /**
    * The renderer to set on the input layer when clustering is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#getLabelSchemes)
    */
  var renderer: js.UndefOr[Renderer] = js.undefined
  
  /**
    * The view where the input layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView
}
object clustersGetLabelSchemesParams {
  
  inline def apply(layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer, view: MapView): clustersGetLabelSchemesParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[clustersGetLabelSchemesParams]
  }
  
  extension [Self <: clustersGetLabelSchemesParams](x: Self) {
    
    inline def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
