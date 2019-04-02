package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends Widget {
  /**
    * A property indicating the current active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#activeWorkflow)
    */
  val activeWorkflow: Workflow = js.native
  /**
    * An array of string values which specifies what end users are allowed to edit. For example, a feature layer with full editing privileges may be available. But you may only want the end user to have the ability to update existing features. Set the `allowedWorkflows` to only `update`.
    *
    * Possible Value | Description | Example
    * ---------------|------------|----------
    * create | Indicated in the widget via the `Add feature` option. This allows the end user to create new features in the feature service. | ![combinedcreate](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/editor_combined_create.png)
    * update | Indicated in the widget via the `Edit feature` option. This allows the end user to update and/or delete features in the feature service. | ![combinedupdate](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/editor_combined_update.png)
    *
    * > These workflows are only enabled if the feature service allows these operations. For example, if a feature service is only enabled to allow updates, `Add features` is not enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#allowedWorkflows)
    */
  var allowedWorkflows: js.Array[java.lang.String] = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#iconClass)
    */
  val iconClass: java.lang.String = js.native
  /**
    * An array of editing configurations for individual layers.  If you have an editable feature layer but do not want the end user to do any type of editing, you can limit this by setting the `enabled` property to `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos)
    */
  var layerInfos: js.Array[LayerInfo] = js.native
  /**
    * This property allows customization of supporting Editor widgets and their default behavior. These widgets include [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html), [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html), and [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html).
    * > This property is useful for basic overrides of the default widgets. There may be some limitations to what the Editor can do with these overridden properties. For example, the Editor will always disable the `multipleSelectionEnabled` property in [Sketch.defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions) no matter what is set within this property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults)
    */
  var supportingWidgetDefaults: SupportingWidgetDefaults = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). This view provides the editable layers for the Editor widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#view)
    */
  var view: MapView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the module:esri/widgets/Editor/EditorToggleViewModel class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#viewModel)
    */
  var viewModel: EditorViewModel = js.native
  /**
    * Cancels any active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#cancelWorkflow)
    *
    *
    */
  def cancelWorkflow(): scala.Unit = js.native
  /**
    * This is applicable if there is an active update workflow. If so, this method deletes the workflow feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#deleteFeatureFromWorkflow)
    *
    *
    */
  def deleteFeatureFromWorkflow(): scala.Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#render)
    *
    *
    */
  def render(): js.Any = js.native
  /**
    * Initiates the `create` workflow by displaying the panel where feature creation begins. This method takes a [CreationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo) object containing the layer(s) and template(s) to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureCreation)
    *
    * @param creationInfo An object containing information needed to create a new feature using the Editor widget.
    *
    */
  def startCreateWorkflowAtFeatureCreation(creationInfo: CreationInfo): scala.Unit = js.native
  /**
    * This method starts the Editor workflow where it waits for the feature to be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureEdit)
    *
    * @param feature The feature to be edited.
    *
    */
  def startCreateWorkflowAtFeatureEdit(feature: Graphic): scala.Unit = js.native
  /**
    * Initiates the `create` workflow by displaying the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureTypeSelection)
    *
    *
    */
  def startCreateWorkflowAtFeatureTypeSelection(): scala.Unit = js.native
  /**
    * Starts the `update` workflow at the feature geometry and attribute editing panel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtFeatureEdit)
    *
    * @param feature The feature to be updated.
    *
    */
  def startUpdateWorkflowAtFeatureEdit(feature: Graphic): scala.Unit = js.native
  /**
    * Starts the `update` workflow using the current selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtFeatureSelection)
    *
    *
    */
  def startUpdateWorkflowAtFeatureSelection(): scala.Unit = js.native
  /**
    * This method starts the Editor workflow where it waits for multiple features to be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtMultipleFeatureSelection)
    *
    * @param candidates An array of features to be updated.
    *
    */
  def startUpdateWorkflowAtMultipleFeatureSelection(candidates: js.Array[Graphic]): scala.Unit = js.native
}

@JSGlobal("__esri.Editor")
@js.native
/**
  * This widget provides an out-of-the-box editing experience to help streamline the editing experience within a web application. The widget has two different [Workflows](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html), `create` and `update`. These workflows allow you to either add features or edit and/or delete existing features within an editable feature layer. The widget automatically recognizes if there are editable feature layers within the map. If it recognizes that they are editable, the layers can be used by the widget. In addition, it is also possible to configure how the `Editor` behaves by setting its [layerInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos) property. This property takes an array of configuration objects which allow you to configure the editing experience for these layers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html)
  */
class EditorCls () extends Editor {
  def this(properties: EditorProperties) = this()
}

