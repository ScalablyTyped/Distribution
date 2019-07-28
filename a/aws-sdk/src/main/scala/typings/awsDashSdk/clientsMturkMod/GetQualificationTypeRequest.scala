package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQualificationTypeRequest extends js.Object {
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: EntityId
}

object GetQualificationTypeRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId): GetQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId)
  
    __obj.asInstanceOf[GetQualificationTypeRequest]
  }
}

