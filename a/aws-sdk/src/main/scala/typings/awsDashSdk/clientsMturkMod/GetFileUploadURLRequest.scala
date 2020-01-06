package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileUploadURLRequest extends js.Object {
  /**
    * The ID of the assignment that contains the question with a FileUploadAnswer.
    */
  var AssignmentId: EntityId = js.native
  /**
    * The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
    */
  var QuestionIdentifier: String = js.native
}

object GetFileUploadURLRequest {
  @scala.inline
  def apply(AssignmentId: EntityId, QuestionIdentifier: String): GetFileUploadURLRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any], QuestionIdentifier = QuestionIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFileUploadURLRequest]
  }
}

