package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait binsGetLabelSchemesParams extends StObject {
  
  /**
  		 * The point layer that has or will have binning enabled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html#getLabelSchemes)
  		 */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer
  
  /**
  		 * The renderer to set on `layer.featureReduction.renderer` when binning is enabled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-bins.html#getLabelSchemes)
  		 */
  var renderer: js.UndefOr[Renderer] = js.undefined
}
object binsGetLabelSchemesParams {
  
  inline def apply(layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer): binsGetLabelSchemesParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[binsGetLabelSchemesParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: binsGetLabelSchemesParams] (val x: Self) extends AnyVal {
    
    inline def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer | StreamLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
