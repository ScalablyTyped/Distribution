package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingSceneLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  /**
    * The id of the currently active filter. To activate one of the [filters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters) assign its [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#id) to this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId)
    */
  var activeFilterId: js.UndefOr[String] = js.undefined
  /**
    * Specifies how features are placed on the vertical axis (z). This property only affects [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) when using the `absolute-height` mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[BuildingSceneLayerElevationInfo] = js.undefined
  /**
    * Collection of filters that can be used to show or hide specific features in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Using filters is useful when only a subset of the data in the layer should be displayed. To activate a [BuildingFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html) add it to this [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) and assign its [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#id) to [activeFilterId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId). Once activated, only the features that satisfy the conditions defined by the [filterBlocks](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#filterBlocks) of the filter are displayed in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters)
    */
  var filters: js.UndefOr[CollectionProperties[BuildingFilterProperties]] = js.undefined
  /**
    * An array of field names from the service to include with each feature in all sublayers. To fetch the values from all fields in all sublayers, use `["*"]`. BuildingSceneLayers usually have a large number of fields, so fetching all the values might lead to slower load times. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer) and [filtering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters) on all sublayers.  To include fields only in a specific sublayer, use the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields) property of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
}

object BuildingSceneLayerProperties {
  @scala.inline
  def apply(
    activeFilterId: String = null,
    copyright: String = null,
    elevationInfo: BuildingSceneLayerElevationInfo = null,
    filters: CollectionProperties[BuildingFilterProperties] = null,
    fullExtent: ExtentProperties = null,
    id: String = null,
    layerId: Int | Double = null,
    listMode: show | hide | `hide-children` = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    opacity: Int | Double = null,
    outFields: js.Array[String] = null,
    portalItem: PortalItemProperties = null,
    spatialReference: SpatialReferenceProperties = null,
    title: String = null,
    url: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BuildingSceneLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (activeFilterId != null) __obj.updateDynamic("activeFilterId")(activeFilterId.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (elevationInfo != null) __obj.updateDynamic("elevationInfo")(elevationInfo.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingSceneLayerProperties]
  }
}

