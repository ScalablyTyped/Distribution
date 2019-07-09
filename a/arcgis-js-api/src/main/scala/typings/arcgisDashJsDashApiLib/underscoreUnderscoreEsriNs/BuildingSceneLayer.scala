package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var activeFilterId: java.lang.String = js.native
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
    * Hierarchical structure of sublayers in a BuildingSceneLayer. Usually contains an Overview [BuildingComponentSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html) and a Full Model [BuildingGroupSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html). However, some BuildingSceneLayers can contain only the Full Model [BuildingGroupSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html) or the discipline [BuildingGroupSublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html) directly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#sublayers)
    */
  val sublayers: Collection[BuildingGroupSublayer | BuildingComponentSublayer] = js.native
  /**
    * Loads the layer and all of its sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#loadAll)
    *
    *
    */
  def loadAll(): arcgisDashJsDashApiLib.IPromise[BuildingSceneLayer] = js.native
  @JSName("on")
  def on_layerviewcreate(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: BuildingSceneLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create-error`,
    eventHandler: BuildingSceneLayerLayerviewCreateErrorEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: BuildingSceneLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.BuildingSceneLayer")
@js.native
/**
  * The BuildingSceneLayer is designed for visualizing buildings with detailed interiors in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). These building models are usually exported from Building Information Modeling (BIM) projects. The data in a BuildingSceneLayer can represent walls, lighting fixtures, mechanical systems, furniture and so on.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html)
  */
class BuildingSceneLayerCls () extends BuildingSceneLayer {
  def this(properties: BuildingSceneLayerProperties) = this()
  /**
    * The copyright text as defined by the scene service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#copyright)
    */
  /* CompleteClass */
  override var copyright: java.lang.String = js.native
  /**
    * The layer ID, or layer index, of a Scene Service layer. This is particularly useful when loading a single layer with the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#portalItem) property from a service containing multiple layers. You can specify this value in one of two scenarios:
    *   * When loading the layer via the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#portalItem) property.
    *   * When pointing the layer [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url) directly to the Scene Service.
    *
    *
    * If a layerId is not specified in either of the above scenarios, then the first layer in the service (`layerId = 0`) is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId)
    */
  /* CompleteClass */
  override var layerId: scala.Double = js.native
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: scala.Double = js.native
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: PortalItem = js.native
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#spatialReference)
    */
  /* CompleteClass */
  override var spatialReference: SpatialReference = js.native
  /**
    * The URL of the REST endpoint of the layer or scene service. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.  The layer may be specified using the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId) property when the url points directly to a service and not a specific layer. If [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId) is not specified, then it will default to the first layer in the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url)
    */
  /* CompleteClass */
  override var url: java.lang.String = js.native
  /**
    * The version of the scene service specification used for this service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
    */
  /* CompleteClass */
  override val version: SceneServiceVersion = js.native
}

