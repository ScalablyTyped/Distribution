package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class contains performance information like memory usage and number of features for a specific layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html)
  */
trait LayerPerformanceInfo extends js.Object {
  /**
    * The number of features displayed in the SceneView. This property is only available for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [point SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#displayedNumberOfFeatures)
    */
  var displayedNumberOfFeatures: Double
  /**
    * The layer corresponding to the memory usage information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#layer)
    */
  var layer: Layer
  /**
    * The maximum number of features that can be displayed in the layer.  This number depends on the symbol complexity and [qualityProfile](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#qualityProfile) of the SceneView. If you want to increase it manually, set the [maximumNumberOfFeatures](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#maximumNumberOfFeatures) property. This property is only available for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [point SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: Double
  /**
    * An estimate of the memory currently in use by the layer, in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#memory)
    */
  var memory: Double
  /**
    * The total number of features contained in the layer. This property is only available for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [point SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#totalNumberOfFeatures)
    */
  var totalNumberOfFeatures: Double
}

@JSGlobal("__esri.LayerPerformanceInfo")
@js.native
object LayerPerformanceInfo extends TopLevel[LayerPerformanceInfo]

