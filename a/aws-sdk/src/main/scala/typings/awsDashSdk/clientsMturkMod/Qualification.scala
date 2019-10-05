package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Qualification extends js.Object {
  /**
    *  The date and time the Qualification was granted to the Worker. If the Worker's Qualification was revoked, and then re-granted based on a new Qualification request, GrantTime is the date and time of the last call to the AcceptQualificationRequest operation.
    */
  var GrantTime: js.UndefOr[Timestamp] = js.undefined
  /**
    *  The value (score) of the Qualification, if the Qualification has an integer value.
    */
  var IntegerValue: js.UndefOr[Integer] = js.undefined
  var LocaleValue: js.UndefOr[Locale] = js.undefined
  /**
    *  The ID of the Qualification type for the Qualification.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
  /**
    *  The status of the Qualification. Valid values are Granted | Revoked.
    */
  var Status: js.UndefOr[QualificationStatus] = js.undefined
  /**
    *  The ID of the Worker who possesses the Qualification. 
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
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
    if (GrantTime != null) __obj.updateDynamic("GrantTime")(GrantTime)
    if (IntegerValue != null) __obj.updateDynamic("IntegerValue")(IntegerValue.asInstanceOf[js.Any])
    if (LocaleValue != null) __obj.updateDynamic("LocaleValue")(LocaleValue)
    if (QualificationTypeId != null) __obj.updateDynamic("QualificationTypeId")(QualificationTypeId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (WorkerId != null) __obj.updateDynamic("WorkerId")(WorkerId)
    __obj.asInstanceOf[Qualification]
  }
}

