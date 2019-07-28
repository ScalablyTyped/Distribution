package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQualificationTypeRequest extends js.Object {
  /**
    * The ID of the QualificationType to dispose.
    */
  var QualificationTypeId: EntityId
}

object DeleteQualificationTypeRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId): DeleteQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId)
  
    __obj.asInstanceOf[DeleteQualificationTypeRequest]
  }
}

