package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor
  extends StObject
     with Widget_ {
  
  /**
    * A property indicating the current active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#activeWorkflow)
    */
  val activeWorkflow: CreateWorkflow | UpdateWorkflow = js.native
  
  /**
    * An array of string values which specifies what end users are allowed to edit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#allowedWorkflows)
    */
  var allowedWorkflows: js.Array[String] = js.native
  
  /**
    * Cancels any active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#cancelWorkflow)
    */
  def cancelWorkflow(): js.Promise[Unit] = js.native
  
  /**
    * This is applicable if there is an active [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#deleteFeatureFromWorkflow)
    */
  def deleteFeatureFromWorkflow(): js.Promise[Unit] = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#iconClass)
    */
  val iconClass: String = js.native
  
  /**
    * An array of editing configurations for individual layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos)
    */
  var layerInfos: js.Array[LayerInfo] = js.native
  
  /**
    * Initiates the [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html) by displaying the panel where feature creation begins.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureCreation)
    */
  def startCreateWorkflowAtFeatureCreation(creationInfo: CreationInfo): js.Promise[Unit] = js.native
  
  /**
    * This method starts the [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html) where it waits for the feature to be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureEdit)
    */
  def startCreateWorkflowAtFeatureEdit(feature: Graphic): js.Promise[Unit] = js.native
  
  /**
    * Initiates the [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html) by displaying the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureTypeSelection)
    */
  def startCreateWorkflowAtFeatureTypeSelection(): js.Promise[Unit] = js.native
  
  /**
    * Starts the [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html) at the feature geometry and attribute editing panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtFeatureEdit)
    */
  def startUpdateWorkflowAtFeatureEdit(feature: Graphic): js.Promise[Unit] = js.native
  
  /**
    * Starts the [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html) using the current selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtFeatureSelection)
    */
  def startUpdateWorkflowAtFeatureSelection(): js.Promise[Unit] = js.native
  
  /**
    * This method starts the [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html) where it waits for multiple features to be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtMultipleFeatureSelection)
    */
  def startUpdateWorkflowAtMultipleFeatureSelection(candidates: js.Array[Graphic]): js.Promise[Unit] = js.native
  
  /**
    * This property allows customization of supporting Editor widgets and their default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults)
    */
  var supportingWidgetDefaults: SupportingWidgetDefaults = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#viewModel)
    */
  var viewModel: EditorViewModel = js.native
}
