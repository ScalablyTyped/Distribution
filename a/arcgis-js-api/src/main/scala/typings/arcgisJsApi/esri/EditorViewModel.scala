package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorViewModel extends Accessor {
  /**
    * A property indicating the current active workflow. This is either [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html) or [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#activeWorkflow)
    */
  val activeWorkflow: CreateWorkflow | UpdateWorkflow = js.native
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
  var allowedWorkflows: js.Array[String] = js.native
  /**
    * Convenience property that reads whether there are any editable layers that support the `create` workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#canCreate)
    */
  val canCreate: Boolean = js.native
  /**
    * Convenience property that reads whether there are any editable layers that support the `update` workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#canUpdate)
    */
  val canUpdate: Boolean = js.native
  /**
    * A collection of editable item objects that match the feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#editableItems)
    */
  val editableItems: Collection[EditableItem] = js.native
  /**
    * An array of objects containing information specific to any failed editing operations. In addition to the error(s), options to `retry()` or `cancel()` are provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#failures)
    */
  val failures: js.Array[EditorViewModelFailures] = js.native
  /**
    * The [FeatureFormViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureFormViewModel)
    */
  var featureFormViewModel: FeatureFormViewModel = js.native
  /**
    * The [FeatureTemplatesViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-FeatureTemplatesViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#featureTemplatesViewModel)
    */
  var featureTemplatesViewModel: FeatureTemplatesViewModel = js.native
  /**
    * An array of editing configurations for individual layers.  If you have an editable feature layer but do not want the end user to do any type of editing, you can limit this by setting the `enabled` property to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#layerInfos)
    */
  var layerInfos: js.Array[LayerInfo] = js.native
  /**
    * The [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) for supporting the editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#sketchViewModel)
    */
  var sketchViewModel: SketchViewModel = js.native
  /**
    * The widget's state. Possible values are in the table below.
    *
    * Value | Description
    * ------|------------
    * ready | Dependencies are met and has valid property values.
    * disabled | Dependencies are missing and cannot provide valid inputs.
    * editing-new-feature | The Editor is currently editing (creating) a new feature.
    * editing-existing-feature | The Editor is currently editing an existing feature.
    * awaiting-update-feature-candidate | The period when the application is awaiting the user's input after clicking update and multiple features are returned. Specify the feature to update.
    * awaiting-feature-creation-info | This is the first step in the `create` workflow. A [CreationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo) is required.
    * awaiting-feature-to-update | This is the first step in the `update` workflow. A [feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) is required.
    * awaiting-feature-to-create | The waiting period for when a feature is created beforte attribute/geometry edits can be performed.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * When `true`, there is at least one edit request being processed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#syncing)
    */
  val syncing: Boolean = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). This view provides the editable layers for the Editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#view)
    */
  var view: MapView = js.native
  /**
    * Cancels any active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#cancelWorkflow)
    *
    *
    */
  def cancelWorkflow(): js.Promise[Unit] = js.native
  /**
    * This is applicable if there is an active update workflow. If so, this method deletes the workflow feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#deleteFeatureFromWorkflow)
    *
    *
    */
  def deleteFeatureFromWorkflow(): js.Promise[Unit] = js.native
  /**
    * Initiates the `create` workflow by displaying the panel where feature creation begins. This method takes a [CreationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo) object containing the layer(s) and template(s) to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startCreateWorkflowAtFeatureCreation)
    *
    * @param creationInfo An object containing information needed to create a new feature using the Editor widget.
    *
    */
  def startCreateWorkflowAtFeatureCreation(creationInfo: CreationInfo): js.Promise[Unit] = js.native
  /**
    * This method starts the Editor workflow where it waits for the feature to be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startCreateWorkflowAtFeatureEdit)
    *
    * @param feature The feature to be updated.
    *
    */
  def startCreateWorkflowAtFeatureEdit(feature: Graphic): js.Promise[Unit] = js.native
  /**
    * Initiates the `create` workflow by displaying the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startCreateWorkflowAtFeatureTypeSelection)
    *
    *
    */
  def startCreateWorkflowAtFeatureTypeSelection(): js.Promise[Unit] = js.native
  /**
    * Starts the update workflow at the feature geometry and attribute editing panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startUpdateWorkflowAtFeatureEdit)
    *
    * @param feature The feature to be updated.
    *
    */
  def startUpdateWorkflowAtFeatureEdit(feature: Graphic): js.Promise[Unit] = js.native
  /**
    * Starts the `update` workflow using the current selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startUpdateWorkflowAtFeatureSelection)
    *
    *
    */
  def startUpdateWorkflowAtFeatureSelection(): js.Promise[Unit] = js.native
  /**
    * Starts the Editor workflow where it waits for multiple features to be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startUpdateWorkflowAtMultipleFeatureSelection)
    *
    *
    */
  def startUpdateWorkflowAtMultipleFeatureSelection(): js.Promise[Unit] = js.native
}

