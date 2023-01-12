package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class contains information about performance in the scene like global memory usage and additional details for layers about memory consumption and number of features.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html)
  */
trait SceneViewPerformanceInfo extends StObject {
  
  /**
    * An estimate of the memory used by the [Edges3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html) feature when added to 3D objects in [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) or to polygons with [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html) symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html#edgesMemory)
    */
  var edgesMemory: Double
  
  /**
    * An array representing detailed information about memory usage of most layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html#layerPerformanceInfos)
    */
  var layerPerformanceInfos: js.Array[LayerPerformanceInfo]
  
  /**
    * Quality level as a number between 0 and 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html#quality)
    */
  var quality: Double
  
  /**
    * An estimate of the memory currently in use by [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) and [tiled layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html), in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html#terrainMemory)
    */
  var terrainMemory: Double
  
  /**
    * The total memory available to the SceneView, in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html#totalMemory)
    */
  var totalMemory: Double
  
  /**
    * An estimate of the memory that is in use by the SceneView, in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html#usedMemory)
    */
  var usedMemory: Double
}
object SceneViewPerformanceInfo {
  
  inline def apply(
    edgesMemory: Double,
    layerPerformanceInfos: js.Array[LayerPerformanceInfo],
    quality: Double,
    terrainMemory: Double,
    totalMemory: Double,
    usedMemory: Double
  ): SceneViewPerformanceInfo = {
    val __obj = js.Dynamic.literal(edgesMemory = edgesMemory.asInstanceOf[js.Any], layerPerformanceInfos = layerPerformanceInfos.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], terrainMemory = terrainMemory.asInstanceOf[js.Any], totalMemory = totalMemory.asInstanceOf[js.Any], usedMemory = usedMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewPerformanceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewPerformanceInfo] (val x: Self) extends AnyVal {
    
    inline def setEdgesMemory(value: Double): Self = StObject.set(x, "edgesMemory", value.asInstanceOf[js.Any])
    
    inline def setLayerPerformanceInfos(value: js.Array[LayerPerformanceInfo]): Self = StObject.set(x, "layerPerformanceInfos", value.asInstanceOf[js.Any])
    
    inline def setLayerPerformanceInfosVarargs(value: LayerPerformanceInfo*): Self = StObject.set(x, "layerPerformanceInfos", js.Array(value*))
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setTerrainMemory(value: Double): Self = StObject.set(x, "terrainMemory", value.asInstanceOf[js.Any])
    
    inline def setTotalMemory(value: Double): Self = StObject.set(x, "totalMemory", value.asInstanceOf[js.Any])
    
    inline def setUsedMemory(value: Double): Self = StObject.set(x, "usedMemory", value.asInstanceOf[js.Any])
  }
}
