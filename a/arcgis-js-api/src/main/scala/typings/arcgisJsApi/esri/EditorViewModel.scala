package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`awaiting-feature-creation-info`
import typings.arcgisJsApi.arcgisJsApiStrings.`awaiting-feature-to-create`
import typings.arcgisJsApi.arcgisJsApiStrings.`awaiting-feature-to-update`
import typings.arcgisJsApi.arcgisJsApiStrings.`awaiting-update-feature-candidate`
import typings.arcgisJsApi.arcgisJsApiStrings.`editing-existing-feature`
import typings.arcgisJsApi.arcgisJsApiStrings.`editing-new-feature`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorViewModel
  extends StObject
     with Accessor {
  
  /**
    * A property indicating the current active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#activeWorkflow)
    */
  val activeWorkflow: CreateWorkflow | UpdateWorkflow = js.native
  
  /**
    * An array of string values which specifies what end users are allowed to edit.
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
    * Cancels any active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#cancelWorkflow)
    */
  def cancelWorkflow(): js.Promise[Unit] = js.native
  
  /**
    * This is applicable if there is an active update workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#deleteFeatureFromWorkflow)
    */
  def deleteFeatureFromWorkflow(): js.Promise[Unit] = js.native
  
  /**
    * A collection of editable item objects that match the feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#editableItems)
    */
  val editableItems: Collection[EditableItem] = js.native
  
  /**
    * An array of objects containing information specific to any failed editing operations.
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
    * An array of editing configurations for individual layers.
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
    * Initiates the `create` workflow by displaying the panel where feature creation begins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startCreateWorkflowAtFeatureCreation)
    */
  def startCreateWorkflowAtFeatureCreation(creationInfo: CreationInfo): js.Promise[Unit] = js.native
  
  /**
    * This method starts the Editor workflow where it waits for the feature to be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startCreateWorkflowAtFeatureEdit)
    */
  def startCreateWorkflowAtFeatureEdit(feature: Graphic): js.Promise[Unit] = js.native
  
  /**
    * Initiates the `create` workflow by displaying the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startCreateWorkflowAtFeatureTypeSelection)
    */
  def startCreateWorkflowAtFeatureTypeSelection(): js.Promise[Unit] = js.native
  
  /**
    * Starts the update workflow at the feature geometry and attribute editing panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startUpdateWorkflowAtFeatureEdit)
    */
  def startUpdateWorkflowAtFeatureEdit(feature: Graphic): js.Promise[Unit] = js.native
  
  /**
    * Starts the `update` workflow using the current selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startUpdateWorkflowAtFeatureSelection)
    */
  def startUpdateWorkflowAtFeatureSelection(): js.Promise[Unit] = js.native
  
  /**
    * Starts the Editor workflow where it waits for multiple features to be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#startUpdateWorkflowAtMultipleFeatureSelection)
    */
  def startUpdateWorkflowAtMultipleFeatureSelection(): js.Promise[Unit] = js.native
  
  /**
    * The widget's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#state)
    */
  val state: ready | disabled | `editing-new-feature` | `editing-existing-feature` | `awaiting-update-feature-candidate` | `awaiting-feature-creation-info` | `awaiting-feature-to-update` | `awaiting-feature-to-create` = js.native
  
  /**
    * When `true`, there is at least one edit request being processed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#syncing)
    */
  val syncing: Boolean = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}
