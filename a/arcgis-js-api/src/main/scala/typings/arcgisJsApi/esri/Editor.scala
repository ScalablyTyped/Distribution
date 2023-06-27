package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`create-features`
import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.update
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
  val activeWorkflow: CreateWorkflow | CreateFeaturesWorkflow | UpdateWorkflow = js.native
  
  /**
  		 * An array of string values which specifies what end users are allowed to edit.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#allowedWorkflows)
  		 */
  var allowedWorkflows: `create-features` | create | update = js.native
  
  /**
  		 * Cancels any active workflow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#cancelWorkflow)
  		 */
  def cancelWorkflow(): js.Promise[scala.Unit] = js.native
  
  /**
  		 * This is applicable if there is an active [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#deleteFeatureFromWorkflow)
  		 */
  def deleteFeatureFromWorkflow(): js.Promise[scala.Unit] = js.native
  
  /**
  		 * Indicates the heading level to use for title of the widget.
  		 *
  		 * @default 4
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/Editor#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#iconClass)
  		 */
  val iconClass: String = js.native
  
  /**
  		 * Options to configure the labels shown next to each segment of the geometry being created or updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#labelOptions)
  		 */
  var labelOptions: SketchLabelOptions = js.native
  
  /**
  		 * An array of editing configurations for individual layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos)
  		 */
  var layerInfos: js.Array[LayerInfo] = js.native
  
  /**
  		 * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for editing.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#snappingOptions)
  		 */
  var snappingOptions: SnappingOptions = js.native
  
  /**
  		 * Initiates the [CreateFeaturesWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html) by displaying the panel where feature(s) creation begins.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateFeaturesWorkflowAtFeatureCreation)
  		 */
  def startCreateFeaturesWorkflowAtFeatureCreation(creationInfo: CreationInfo): js.Promise[scala.Unit] = js.native
  
  /**
  		 * Initiates the [CreateFeaturesWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html) by displaying the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) panel.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateFeaturesWorkflowAtFeatureTypeSelection)
  		 */
  def startCreateFeaturesWorkflowAtFeatureTypeSelection(): js.Promise[scala.Unit] = js.native
  
  /**
  		 * Initiates the [CreateFeaturesWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html) by displaying the panel where feature creation begins.
  		 *
  		 * @deprecated since version 4.23. Instead use [startCreateFeaturesWorkflowAtFeatureCreation](#startCreateFeaturesWorkflowAtFeatureCreation)
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureCreation)
  		 */
  def startCreateWorkflowAtFeatureCreation(creationInfo: CreationInfo): js.Promise[scala.Unit] = js.native
  
  /**
  		 * This method starts the [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html) where it waits for the feature to be selected.
  		 *
  		 * @deprecated since 4.23
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureEdit)
  		 */
  def startCreateWorkflowAtFeatureEdit(feature: Graphic): js.Promise[scala.Unit] = js.native
  
  /**
  		 * Initiates the [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html) by displaying the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) panel.
  		 *
  		 * @deprecated since version 4.23. Instead use [startCreateFeaturesWorkflowAtFeatureTypeSelection](#startCreateFeaturesWorkflowAtFeatureTypeSelection) instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startCreateWorkflowAtFeatureTypeSelection)
  		 */
  def startCreateWorkflowAtFeatureTypeSelection(): js.Promise[scala.Unit] = js.native
  
  /**
  		 * Starts the [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html) at the attribute editing panel.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtFeatureEdit)
  		 */
  def startUpdateWorkflowAtFeatureEdit(feature: Graphic): js.Promise[scala.Unit] = js.native
  
  /**
  		 * Starts the [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html) using the current selected feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtFeatureSelection)
  		 */
  def startUpdateWorkflowAtFeatureSelection(): js.Promise[scala.Unit] = js.native
  
  /**
  		 * This method starts the [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html) where it waits for multiple features to be selected.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#startUpdateWorkflowAtMultipleFeatureSelection)
  		 */
  def startUpdateWorkflowAtMultipleFeatureSelection(candidates: js.Array[Graphic]): js.Promise[scala.Unit] = js.native
  
  /**
  		 * This property allows customization of supporting Editor widgets and their default behavior.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults)
  		 */
  var supportingWidgetDefaults: SupportingWidgetDefaults = js.native
  
  /**
  		 * Options to configure the tooltip shown next to the cursor when creating or updating graphics.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#tooltipOptions)
  		 */
  var tooltipOptions: SketchTooltipOptions = js.native
  
  /**
  		 * Indicates whether the Editor should default to use the deprecated [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html).
  		 *
  		 * @default false
  		 * @deprecated since version 4.23. Although new at 4.23, this property was introduced to help migrate from the legacy {@link module:esri/widgets/Editor/CreateWorkflow} to the updated {@link module:esri/widgets/Editor/CreateFeaturesWorkflow}. Once {@link module:esri/widgets/Editor/CreateWorkflow} is fully removed, this property will no longer be necessary.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#useDeprecatedCreateWorkflow)
  		 */
  var useDeprecatedCreateWorkflow: Boolean = js.native
  
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
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#visibleElements)
  		 */
  var visibleElements: EditorVisibleElements = js.native
}
