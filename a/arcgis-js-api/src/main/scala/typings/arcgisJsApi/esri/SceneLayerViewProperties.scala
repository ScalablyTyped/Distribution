package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneLayerViewProperties extends LayerViewProperties {
  /**
    * Applies a client-side [FeatureFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html) to the displayed data. Only the features that satisfy the filter are displayed.  For 3D object scene layers, only spatial filters with [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship) set to `contains`, `intersects` or `disjoint` are supported.  The fields to be used for the filter must be present in the layer view's [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields) list.  The [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) property is not supported on a SceneLayerView filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.native
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to point scene layers. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: js.UndefOr[Double] = js.native
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to point scene layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: js.UndefOr[Boolean] = js.native
}

object SceneLayerViewProperties {
  @scala.inline
  def apply(): SceneLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneLayerViewProperties]
  }
  @scala.inline
  implicit class SceneLayerViewPropertiesOps[Self <: SceneLayerViewProperties] (val x: Self) extends AnyVal {
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
    def setFilter(value: FeatureFilterProperties): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMaximumNumberOfFeatures(value: Double): Self = this.set("maximumNumberOfFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNumberOfFeatures: Self = this.set("maximumNumberOfFeatures", js.undefined)
    @scala.inline
    def setMaximumNumberOfFeaturesExceeded(value: Boolean): Self = this.set("maximumNumberOfFeaturesExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumNumberOfFeaturesExceeded: Self = this.set("maximumNumberOfFeaturesExceeded", js.undefined)
  }
  
}

