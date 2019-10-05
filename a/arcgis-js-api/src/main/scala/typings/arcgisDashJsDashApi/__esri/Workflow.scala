package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workflow extends Accessor {
  /**
    * Shared workflow data.  Can be either a [CreateWorkflowData](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#CreateWorkflowData) or a [UpdateWorkflowData](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#data)
    */
  val data: CreateWorkflowData | UpdateWorkflowData = js.native
  /**
    * This property indicates whether there is a next step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#hasNextStep)
    */
  val hasNextStep: Boolean = js.native
  /**
    * This property indicates if there is a previous step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#hasPreviousStep)
    */
  val hasPreviousStep: Boolean = js.native
  /**
    * Indicates whether the workflow is considered active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#started)
    *
    * @default false
    */
  val started: Boolean = js.native
  /**
    * The name of the current step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#stepId)
    */
  val stepId: String = js.native
  /**
    * Value indicating the workflow type.
    *
    * Possible Value | Description | Example
    * ---------------|------------|----------
    * create | Indicated in the widget via the `Add feature` option. This allows the end user to create new features in the feature service. | ![combinedcreate](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/editor_combined_create.png)
    * update | Indicated in the widget via the `Edit feature` option. This allows the end user to update and/or delete features in the feature service. | ![combinedupdate](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/editor_combined_update.png)
    *
    * > These workflows are only enabled if the feature service allows these operations. For example, if a feature service is only enabled to allow updates, `Add features` is not enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#type)
    */
  val `type`: String = js.native
  /**
    * Cancels the active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#cancel)
    *
    *
    */
  def cancel(): Unit = js.native
  /**
    * Call this method when the workflow is considered finished. This method is used to help process the editing results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#commit)
    *
    *
    */
  def commit(): Unit = js.native
  /**
    * Moves to the next step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#next)
    *
    *
    */
  def next(): Unit = js.native
  /**
    * Moves to the previous step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#previous)
    *
    *
    */
  def previous(): Unit = js.native
  /**
    * Resets the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#reset)
    *
    *
    */
  def reset(): Unit = js.native
  /**
    * Starts the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#start)
    *
    *
    */
  def start(): Unit = js.native
}

@JSGlobal("__esri.Workflow")
@js.native
object Workflow extends TopLevel[WorkflowConstructor]

