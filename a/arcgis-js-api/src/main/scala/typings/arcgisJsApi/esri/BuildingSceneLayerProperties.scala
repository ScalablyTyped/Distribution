package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var activeFilterId: js.UndefOr[String] = js.native
  /**
    * Specifies how features are placed on the vertical axis (z). This property only affects [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) when using the `absolute-height` mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[BuildingSceneLayerElevationInfo] = js.native
  /**
    * Collection of filters that can be used to show or hide specific features in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Using filters is useful when only a subset of the data in the layer should be displayed. To activate a [BuildingFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html) add it to this [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) and assign its [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#id) to [activeFilterId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#activeFilterId). Once activated, only the features that satisfy the conditions defined by the [filterBlocks](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#filterBlocks) of the filter are displayed in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters)
    */
  var filters: js.UndefOr[CollectionProperties[BuildingFilterProperties]] = js.native
  /**
    * An array of field names from the service to include with each feature in all sublayers. To fetch the values from all fields in all sublayers, use `["*"]`. BuildingSceneLayers usually have a large number of fields, so fetching all the values might lead to slower load times. Fields specified in `outFields` will be requested alongside with required fields for [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer) and [filtering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#filters) on all sublayers.  To include fields only in a specific sublayer, use the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields) property of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#outFields)
    *
    * @default null
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
}

object BuildingSceneLayerProperties {
  @scala.inline
  def apply(): BuildingSceneLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingSceneLayerProperties]
  }
  @scala.inline
  implicit class BuildingSceneLayerPropertiesOps[Self <: BuildingSceneLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveFilterId(value: String): Self = this.set("activeFilterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveFilterId: Self = this.set("activeFilterId", js.undefined)
    @scala.inline
    def setElevationInfo(value: BuildingSceneLayerElevationInfo): Self = this.set("elevationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevationInfo: Self = this.set("elevationInfo", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: BuildingFilterProperties*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: CollectionProperties[BuildingFilterProperties]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = this.set("outFields", js.Array(value :_*))
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = this.set("outFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFields: Self = this.set("outFields", js.undefined)
  }
  
}

