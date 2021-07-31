package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait heatmapStatisticsHeatmapStatisticsParams
  extends StObject
     with Object {
  
  /**
    * The area of influence for each point as a radius in pixels from the point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var blurRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * A subset of features for which to calculate the statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
    * The name of the numeric field for which the statistics will be generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The layer from which to generate statistics for the pixel intensity values and a given `field` if provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * A [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance used to calculate pixel intensity values based on the features in the current view.
    *
    * [Read more...](global.html)
    */
  var view: MapView
}
object heatmapStatisticsHeatmapStatisticsParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: MapView
  ): heatmapStatisticsHeatmapStatisticsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[heatmapStatisticsHeatmapStatisticsParams]
  }
  
  @scala.inline
  implicit class heatmapStatisticsHeatmapStatisticsParamsMutableBuilder[Self <: heatmapStatisticsHeatmapStatisticsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    @scala.inline
    def setFeatures(value: js.Array[Graphic]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setView(value: MapView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
