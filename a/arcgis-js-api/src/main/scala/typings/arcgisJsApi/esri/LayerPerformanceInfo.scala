package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class contains performance information like memory usage and number of features for a specific layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html)
  */
@js.native
trait LayerPerformanceInfo extends StObject {
  
  /**
    * The number of features displayed in the SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#displayedNumberOfFeatures)
    */
  var displayedNumberOfFeatures: Double = js.native
  
  /**
    * The layer corresponding to the memory usage information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#layer)
    */
  var layer: Layer = js.native
  
  /**
    * The maximum number of features that can be displayed in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: Double = js.native
  
  /**
    * An estimate of the memory currently in use by the layer, in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#memory)
    */
  var memory: Double = js.native
  
  /**
    * The total number of features contained in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#totalNumberOfFeatures)
    */
  var totalNumberOfFeatures: Double = js.native
}
object LayerPerformanceInfo {
  
  @scala.inline
  def apply(
    displayedNumberOfFeatures: Double,
    layer: Layer,
    maximumNumberOfFeatures: Double,
    memory: Double,
    totalNumberOfFeatures: Double
  ): LayerPerformanceInfo = {
    val __obj = js.Dynamic.literal(displayedNumberOfFeatures = displayedNumberOfFeatures.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], maximumNumberOfFeatures = maximumNumberOfFeatures.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], totalNumberOfFeatures = totalNumberOfFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPerformanceInfo]
  }
  
  @scala.inline
  implicit class LayerPerformanceInfoMutableBuilder[Self <: LayerPerformanceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayedNumberOfFeatures(value: Double): Self = StObject.set(x, "displayedNumberOfFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumNumberOfFeatures(value: Double): Self = StObject.set(x, "maximumNumberOfFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNumberOfFeatures(value: Double): Self = StObject.set(x, "totalNumberOfFeatures", value.asInstanceOf[js.Any])
  }
}
