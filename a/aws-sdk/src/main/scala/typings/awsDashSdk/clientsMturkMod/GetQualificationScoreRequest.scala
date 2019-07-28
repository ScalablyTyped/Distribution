package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQualificationScoreRequest extends js.Object {
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: EntityId
  /**
    * The ID of the Worker whose Qualification is being updated.
    */
  var WorkerId: CustomerId
}

object GetQualificationScoreRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId): GetQualificationScoreRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId, WorkerId = WorkerId)
  
    __obj.asInstanceOf[GetQualificationScoreRequest]
  }
}

