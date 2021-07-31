package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workflow
  extends StObject
     with Accessor {
  
  /**
    * Cancels the active workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#cancel)
    */
  def cancel(): Unit = js.native
  
  /**
    * Call this method when the workflow is considered finished.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#commit)
    */
  def commit(): Unit = js.native
  
  /**
    * Shared workflow data.
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
    * Moves to the next step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#next)
    */
  def next(): Unit = js.native
  
  /**
    * Moves to the previous step in the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#previous)
    */
  def previous(): Unit = js.native
  
  /**
    * Resets the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#reset)
    */
  def reset(): Unit = js.native
  
  /**
    * Starts the workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#start)
    */
  def start(): Unit = js.native
  
  /**
    * Indicates whether the workflow is considered active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#started)
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#type)
    */
  val `type`: create | update = js.native
}
