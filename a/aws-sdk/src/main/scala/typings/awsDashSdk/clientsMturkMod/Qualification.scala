package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Qualification extends js.Object {
  /**
    *  The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the AcceptQualificationRequest operation.
    */
  var GrantTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The value (score) of the Qualification, if the Qualification has an integer value.
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  var LocaleValue: js.UndefOr[Locale] = js.native
  /**
    *  The ID of the Qualification type for the Qualification.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
  /**
    *  The status of the Qualification. Valid values are Granted | Revoked.
    */
  var Status: js.UndefOr[QualificationStatus] = js.native
  /**
    *  The ID of the Worker who possesses the Qualification. 
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object Qualification {
  @scala.inline
  def apply(
    GrantTime: Timestamp = null,
    IntegerValue: Int | Double = null,
    LocaleValue: Locale = null,
    QualificationTypeId: EntityId = null,
    Status: QualificationStatus = null,
    WorkerId: CustomerId = null
  ): Qualification = {
    val __obj = js.Dynamic.literal()
    if (GrantTime != null) __obj.updateDynamic("GrantTime")(GrantTime.asInstanceOf[js.Any])
    if (IntegerValue != null) __obj.updateDynamic("IntegerValue")(IntegerValue.asInstanceOf[js.Any])
    if (LocaleValue != null) __obj.updateDynamic("LocaleValue")(LocaleValue.asInstanceOf[js.Any])
    if (QualificationTypeId != null) __obj.updateDynamic("QualificationTypeId")(QualificationTypeId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (WorkerId != null) __obj.updateDynamic("WorkerId")(WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qualification]
  }
}

