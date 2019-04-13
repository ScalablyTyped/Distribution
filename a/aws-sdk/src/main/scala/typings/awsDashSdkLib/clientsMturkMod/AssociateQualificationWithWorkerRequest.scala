package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateQualificationWithWorkerRequest extends js.Object {
  /**
    * The value of the Qualification to assign.
    */
  var IntegerValue: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the Qualification type to use for the assigned Qualification.
    */
  var QualificationTypeId: EntityId
  /**
    *  Specifies whether to send a notification email message to the Worker saying that the qualification was assigned to the Worker. Note: this is true by default. 
    */
  var SendNotification: js.UndefOr[Boolean] = js.undefined
  /**
    *  The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT assignments and Qualification requests. 
    */
  var WorkerId: CustomerId
}

object AssociateQualificationWithWorkerRequest {
  @scala.inline
  def apply(
    QualificationTypeId: EntityId,
    WorkerId: CustomerId,
    IntegerValue: js.UndefOr[Integer] = js.undefined,
    SendNotification: js.UndefOr[Boolean] = js.undefined
  ): AssociateQualificationWithWorkerRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId, WorkerId = WorkerId)
    if (!js.isUndefined(IntegerValue)) __obj.updateDynamic("IntegerValue")(IntegerValue)
    if (!js.isUndefined(SendNotification)) __obj.updateDynamic("SendNotification")(SendNotification)
    __obj.asInstanceOf[AssociateQualificationWithWorkerRequest]
  }
}

