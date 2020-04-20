package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkflow extends Workflow {
  /**
    * The type of workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html#type)
    */
  @JSName("type")
  val type_CreateWorkflow: create = js.native
}

@JSGlobal("__esri.CreateWorkflow")
@js.native
object CreateWorkflow extends TopLevel[CreateWorkflowConstructor]

