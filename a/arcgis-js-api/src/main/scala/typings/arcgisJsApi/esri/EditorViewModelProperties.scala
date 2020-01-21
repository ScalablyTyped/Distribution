package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorViewModelProperties extends js.Object {
  /**
    * An array of string values which specifies what end users are allowed edit. For example, a feature layer with full editing privileges may be available. But you may only want the end user to have the ability to update existing features. Set the `allowedWorkflows` to only `update`.
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
  var allowedWorkflows: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The [FeatureFormViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureFormViewModel)
    */
  var featureFormViewModel: js.UndefOr[FeatureFormViewModelProperties] = js.undefined
  /**
    * The [FeatureTemplatesViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureTemplatesViewModel)
    */
  var featureTemplatesViewModel: js.UndefOr[FeatureTemplatesViewModelProperties] = js.undefined
  /**
    * An array of editing configurations for individual layers.  If you have an editable feature layer but do not want the end user to do any type of editing, you can limit this by setting the `enabled` property to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LayerInfo]] = js.undefined
  /**
    * The [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#sketchViewModel)
    */
  var sketchViewModel: js.UndefOr[SketchViewModelProperties] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). This view provides the editable layers for the Editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object EditorViewModelProperties {
  @scala.inline
  def apply(
    allowedWorkflows: js.Array[String] = null,
    featureFormViewModel: FeatureFormViewModelProperties = null,
    featureTemplatesViewModel: FeatureTemplatesViewModelProperties = null,
    layerInfos: js.Array[LayerInfo] = null,
    sketchViewModel: SketchViewModelProperties = null,
    view: MapViewProperties = null
  ): EditorViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (allowedWorkflows != null) __obj.updateDynamic("allowedWorkflows")(allowedWorkflows.asInstanceOf[js.Any])
    if (featureFormViewModel != null) __obj.updateDynamic("featureFormViewModel")(featureFormViewModel.asInstanceOf[js.Any])
    if (featureTemplatesViewModel != null) __obj.updateDynamic("featureTemplatesViewModel")(featureTemplatesViewModel.asInstanceOf[js.Any])
    if (layerInfos != null) __obj.updateDynamic("layerInfos")(layerInfos.asInstanceOf[js.Any])
    if (sketchViewModel != null) __obj.updateDynamic("sketchViewModel")(sketchViewModel.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorViewModelProperties]
  }
}

