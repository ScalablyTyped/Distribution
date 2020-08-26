package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorViewModelProperties extends js.Object {
  /**
    * An array of string values which specifies what end users are allowed to edit. For example, a feature layer with full editing privileges may be available. But you may only want the end user to have the ability to update existing features. Set the `allowedWorkflows` to only `update`.
    *
    * Possible Value | Description
    * ---------------|------------
    * create | Indicated in the widget via the `Add feature` option. This allows the end user to create new features in the feature service.
    * update | Indicated in the widget via the `Edit feature` option. This allows the end user to update and/or delete features in the feature service.
    *
    * > These workflows are only enabled if the feature service allows these operations. For example, if a feature service is only enabled to allow updates, 'Add features' is not enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#allowedWorkflows)
    */
  var allowedWorkflows: js.UndefOr[js.Array[String]] = js.native
  /**
    * The [FeatureFormViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureFormViewModel)
    */
  var featureFormViewModel: js.UndefOr[FeatureFormViewModelProperties] = js.native
  /**
    * The [FeatureTemplatesViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureTemplatesViewModel)
    */
  var featureTemplatesViewModel: js.UndefOr[FeatureTemplatesViewModelProperties] = js.native
  /**
    * An array of editing configurations for individual layers.  If you have an editable feature layer but do not want the end user to do any type of editing, you can limit this by setting the `enabled` property to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LayerInfo]] = js.native
  /**
    * The [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#sketchViewModel)
    */
  var sketchViewModel: js.UndefOr[SketchViewModelProperties] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). This view provides the editable layers for the Editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}

object EditorViewModelProperties {
  @scala.inline
  def apply(): EditorViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorViewModelProperties]
  }
  @scala.inline
  implicit class EditorViewModelPropertiesOps[Self <: EditorViewModelProperties] (val x: Self) extends AnyVal {
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
    def setAllowedWorkflowsVarargs(value: String*): Self = this.set("allowedWorkflows", js.Array(value :_*))
    @scala.inline
    def setAllowedWorkflows(value: js.Array[String]): Self = this.set("allowedWorkflows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedWorkflows: Self = this.set("allowedWorkflows", js.undefined)
    @scala.inline
    def setFeatureFormViewModel(value: FeatureFormViewModelProperties): Self = this.set("featureFormViewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureFormViewModel: Self = this.set("featureFormViewModel", js.undefined)
    @scala.inline
    def setFeatureTemplatesViewModel(value: FeatureTemplatesViewModelProperties): Self = this.set("featureTemplatesViewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureTemplatesViewModel: Self = this.set("featureTemplatesViewModel", js.undefined)
    @scala.inline
    def setLayerInfosVarargs(value: LayerInfo*): Self = this.set("layerInfos", js.Array(value :_*))
    @scala.inline
    def setLayerInfos(value: js.Array[LayerInfo]): Self = this.set("layerInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerInfos: Self = this.set("layerInfos", js.undefined)
    @scala.inline
    def setSketchViewModel(value: SketchViewModelProperties): Self = this.set("sketchViewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSketchViewModel: Self = this.set("sketchViewModel", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

