package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateExclusionsPreviewRequest extends js.Object {
  /**
    * The ARN that specifies the assessment template for which you want to create an exclusions preview.
    */
  var assessmentTemplateArn: Arn
}

object CreateExclusionsPreviewRequest {
  @scala.inline
  def apply(assessmentTemplateArn: Arn): CreateExclusionsPreviewRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn)
  
    __obj.asInstanceOf[CreateExclusionsPreviewRequest]
  }
}

