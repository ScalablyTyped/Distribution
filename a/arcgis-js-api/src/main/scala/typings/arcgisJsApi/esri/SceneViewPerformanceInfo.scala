package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class contains information about performance in the scene like global memory usage and additional details for layers about memory consumption and number of features.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html)
  */
trait SceneViewPerformanceInfo extends js.Object {
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
    * Quality level as a number between 0 and 1. The quality decreases when layers would need more memory than available, which reduces the level of detail, number of features and tile resolution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-SceneViewPerformanceInfo.html#quality)
    */
  var quality: Double
  /**
    * An estimate of the memory currently in use by [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html) and [tiled layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html), in bytes.  This property also includes internal memory of the terrain subsystem, e.g., memory used to composite tiles in case multiple [tiled layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html) are added to the scene.
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

@JSGlobal("__esri.SceneViewPerformanceInfo")
@js.native
object SceneViewPerformanceInfo extends TopLevel[SceneViewPerformanceInfo]

