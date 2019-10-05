package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Workflow")
@js.native
/**
  * A Workflow helps manage different stages of an [editing](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) workflow. A workflow can be thought of as one of two options: `create` and/or `update`. If adding a new feature, the `create` option is used. Whereas if editing an existing feature, the `update` option is used. Updating includes both editing geometry and attribute data and deleting features.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html)
  */
class WorkflowCls () extends Workflow {
  def this(properties: WorkflowProperties) = this()
}

