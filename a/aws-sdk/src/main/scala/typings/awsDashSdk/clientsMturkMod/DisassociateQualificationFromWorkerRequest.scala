package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateQualificationFromWorkerRequest extends js.Object {
  /**
    * The ID of the Qualification type of the Qualification to be revoked.
    */
  var QualificationTypeId: EntityId
  /**
    * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this message.
    */
  var Reason: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Worker who possesses the Qualification to be revoked.
    */
  var WorkerId: CustomerId
}

object DisassociateQualificationFromWorkerRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId, Reason: String = null): DisassociateQualificationFromWorkerRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId, WorkerId = WorkerId)
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    __obj.asInstanceOf[DisassociateQualificationFromWorkerRequest]
  }
}

