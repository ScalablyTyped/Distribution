package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait sizeRangeSizeRangeParams extends StObject {
  
  /**
    * Indicates whether the generated renderer is for a binning visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#sizeRange)
    */
  var forBinning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The layer for which to generate a suggested min/max size range based on scale for a size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#sizeRange)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | OGCFeatureLayer | PointCloudLayer | GeoJSONLayer | WFSLayer
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#sizeRange)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * The [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView
}
object sizeRangeSizeRangeParams {
  
  inline def apply(
    layer: FeatureLayer | SceneLayer | CSVLayer | OGCFeatureLayer | PointCloudLayer | GeoJSONLayer | WFSLayer,
    view: MapView
  ): sizeRangeSizeRangeParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeRangeSizeRangeParams]
  }
  
  extension [Self <: sizeRangeSizeRangeParams](x: Self) {
    
    inline def setForBinning(value: Boolean): Self = StObject.set(x, "forBinning", value.asInstanceOf[js.Any])
    
    inline def setForBinningUndefined: Self = StObject.set(x, "forBinning", js.undefined)
    
    inline def setLayer(
      value: FeatureLayer | SceneLayer | CSVLayer | OGCFeatureLayer | PointCloudLayer | GeoJSONLayer | WFSLayer
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
