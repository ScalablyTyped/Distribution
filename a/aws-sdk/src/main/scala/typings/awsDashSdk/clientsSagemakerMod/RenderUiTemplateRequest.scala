package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderUiTemplateRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
    */
  var RoleArn: typings.awsDashSdk.clientsSagemakerMod.RoleArn
  /**
    * A RenderableTask object containing a representative task to render.
    */
  var Task: RenderableTask
  /**
    * A Template object containing the worker UI template to render.
    */
  var UiTemplate: typings.awsDashSdk.clientsSagemakerMod.UiTemplate
}

object RenderUiTemplateRequest {
  @scala.inline
  def apply(RoleArn: RoleArn, Task: RenderableTask, UiTemplate: UiTemplate): RenderUiTemplateRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn, Task = Task, UiTemplate = UiTemplate)
  
    __obj.asInstanceOf[RenderUiTemplateRequest]
  }
}

