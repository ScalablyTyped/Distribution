package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedInstancesModification extends js.Object {
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The time when the modification request was created.
    */
  var CreateDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The time for the modification to become effective.
    */
  var EffectiveDate: js.UndefOr[DateTime] = js.undefined
  /**
    * Contains target configurations along with their corresponding new Reserved Instance IDs.
    */
  var ModificationResults: js.UndefOr[ReservedInstancesModificationResultList] = js.undefined
  /**
    * The IDs of one or more Reserved Instances.
    */
  var ReservedInstancesIds: js.UndefOr[ReservedIntancesIds] = js.undefined
  /**
    * A unique ID for the Reserved Instance modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.undefined
  /**
    * The status of the Reserved Instances modification request.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The reason for the status.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * The time when the modification request was last updated.
    */
  var UpdateDate: js.UndefOr[DateTime] = js.undefined
}

object ReservedInstancesModification {
  @scala.inline
  def apply(
    ClientToken: String = null,
    CreateDate: DateTime = null,
    EffectiveDate: DateTime = null,
    ModificationResults: ReservedInstancesModificationResultList = null,
    ReservedInstancesIds: ReservedIntancesIds = null,
    ReservedInstancesModificationId: String = null,
    Status: String = null,
    StatusMessage: String = null,
    UpdateDate: DateTime = null
  ): ReservedInstancesModification = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate)
    if (ModificationResults != null) __obj.updateDynamic("ModificationResults")(ModificationResults)
    if (ReservedInstancesIds != null) __obj.updateDynamic("ReservedInstancesIds")(ReservedInstancesIds)
    if (ReservedInstancesModificationId != null) __obj.updateDynamic("ReservedInstancesModificationId")(ReservedInstancesModificationId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (UpdateDate != null) __obj.updateDynamic("UpdateDate")(UpdateDate)
    __obj.asInstanceOf[ReservedInstancesModification]
  }
}

