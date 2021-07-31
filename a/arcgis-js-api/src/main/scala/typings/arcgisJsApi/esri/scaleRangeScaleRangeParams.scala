package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait scaleRangeScaleRangeParams
  extends StObject
     with Object {
  
  /**
    * The layer for which to generate a suggested min/max scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer
  
  /**
    * The number of features in the `layer` to sample for spatial statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  var sampleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View
}
object scaleRangeScaleRangeParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: View
  ): scaleRangeScaleRangeParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[scaleRangeScaleRangeParams]
  }
  
  @scala.inline
  implicit class scaleRangeScaleRangeParamsMutableBuilder[Self <: scaleRangeScaleRangeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
