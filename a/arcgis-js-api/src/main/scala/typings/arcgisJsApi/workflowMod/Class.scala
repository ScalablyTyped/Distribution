package typings.arcgisJsApi.workflowMod

import typings.arcgisJsApi.esri.Workflow
import typings.arcgisJsApi.esri.WorkflowProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/Editor/Workflow", JSImport.Namespace)
@js.native
/**
  * A Workflow helps manage different stages of an [editing](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) workflow. A workflow can be thought of as one of two types: [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html) and [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html). If adding a new feature, the [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html) is used. Whereas if editing an existing feature, the [UpdateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-UpdateWorkflow.html) is used. Updating includes both editing geometry and attribute data and deleting features.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html)
  */
class Class () extends Workflow {
  def this(properties: WorkflowProperties) = this()
}

