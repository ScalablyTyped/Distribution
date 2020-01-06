package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesModification extends js.Object {
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The time when the modification request was created.
    */
  var CreateDate: js.UndefOr[DateTime] = js.native
  /**
    * The time for the modification to become effective.
    */
  var EffectiveDate: js.UndefOr[DateTime] = js.native
  /**
    * Contains target configurations along with their corresponding new Reserved Instance IDs.
    */
  var ModificationResults: js.UndefOr[ReservedInstancesModificationResultList] = js.native
  /**
    * The IDs of one or more Reserved Instances.
    */
  var ReservedInstancesIds: js.UndefOr[ReservedIntancesIds] = js.native
  /**
    * A unique ID for the Reserved Instance modification.
    */
  var ReservedInstancesModificationId: js.UndefOr[String] = js.native
  /**
    * The status of the Reserved Instances modification request.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The reason for the status.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * The time when the modification request was last updated.
    */
  var UpdateDate: js.UndefOr[DateTime] = js.native
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
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate.asInstanceOf[js.Any])
    if (ModificationResults != null) __obj.updateDynamic("ModificationResults")(ModificationResults.asInstanceOf[js.Any])
    if (ReservedInstancesIds != null) __obj.updateDynamic("ReservedInstancesIds")(ReservedInstancesIds.asInstanceOf[js.Any])
    if (ReservedInstancesModificationId != null) __obj.updateDynamic("ReservedInstancesModificationId")(ReservedInstancesModificationId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (UpdateDate != null) __obj.updateDynamic("UpdateDate")(UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedInstancesModification]
  }
}

