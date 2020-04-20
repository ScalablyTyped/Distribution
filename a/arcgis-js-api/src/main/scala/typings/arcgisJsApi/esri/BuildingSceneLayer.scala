package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`building-scene`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingSceneLayer
  extends Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer {
  /**
    * The id of the currently active filter. To activate one of the [filters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters) assign its [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#id) to this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId)
    */
  var activeFilterId: String = js.native
  /**
    * A flat [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of all the [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#sublayers) in the BuildingSublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#allSublayers)
    */
  val allSublayers: Collection[BuildingGroupSublayer | BuildingComponentSublayer] = js.native
  /**
    * Specifies how features are placed on the vertical axis (z). This property only affects [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) when using the `absolute-height` mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    */
  var elevationInfo: BuildingSceneLayerElevationInfo = js.native
  /**
    * Collection of filters that can be used to show or hide specific features in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Using filters is useful when only a subset of the data in the layer should be displayed. To activate a [BuildingFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html) add it to this [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) and assign its [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#id) to [activeFilterId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId). Once activated, only the features that satisfy the conditions defined by the [filterBlocks](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#filterBlocks) of the filter are displayed in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters)
    */
  var filters: Collection[BuildingFilter] = js.native
  /**
    * An array of field names from the service to include with each feature in all sublayers. To fetch the values from all fields in all sublayers, use `["*"]`. BuildingSceneLayers usually have a large number of fields, so fetching all the values might lead to slower load times. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer) and [filtering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters) on all sublayers.  To include fields only in a specific sublayer, use the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields) property of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.Array[String] = js.native
  /**
    * Hierarchical structure of sublayers in a BuildingSceneLayer. Usually contains an Overview [BuildingComponentSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html) and a Full Model [BuildingGroupSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html). However, some BuildingSceneLayers can contain only the Full Model [BuildingGroupSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html) or the discipline [BuildingGroupSublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html) directly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#sublayers)
    */
  val sublayers: Collection[BuildingGroupSublayer | BuildingComponentSublayer] = js.native
  /**
    * Summary statistics for all component layers in the building scene layer. This object has to be loaded before accessing its properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#summaryStatistics)
    */
  val summaryStatistics: BuildingSummaryStatistics = js.native
  @JSName("type")
  val type_BuildingSceneLayer: `building-scene` = js.native
  /**
    * Loads the layer and all of its sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#loadAll)
    *
    *
    */
  def loadAll(): js.Promise[BuildingSceneLayer] = js.native
}

@JSGlobal("__esri.BuildingSceneLayer")
@js.native
object BuildingSceneLayer extends TopLevel[BuildingSceneLayerConstructor]

