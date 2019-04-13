package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedInstancesListing extends js.Object {
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The time the listing was created.
    */
  var CreateDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The number of instances in this state.
    */
  var InstanceCounts: js.UndefOr[InstanceCountList] = js.undefined
  /**
    * The price of the Reserved Instance listing.
    */
  var PriceSchedules: js.UndefOr[PriceScheduleList] = js.undefined
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: js.UndefOr[String] = js.undefined
  /**
    * The status of the Reserved Instance listing.
    */
  var Status: js.UndefOr[ListingStatus] = js.undefined
  /**
    * The reason for the current status of the Reserved Instance listing. The response can be blank.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The last modified timestamp of the listing.
    */
  var UpdateDate: js.UndefOr[DateTime] = js.undefined
}

object ReservedInstancesListing {
  @scala.inline
  def apply(
    ClientToken: String = null,
    CreateDate: DateTime = null,
    InstanceCounts: InstanceCountList = null,
    PriceSchedules: PriceScheduleList = null,
    ReservedInstancesId: String = null,
    ReservedInstancesListingId: String = null,
    Status: ListingStatus = null,
    StatusMessage: String = null,
    Tags: TagList = null,
    UpdateDate: DateTime = null
  ): ReservedInstancesListing = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (InstanceCounts != null) __obj.updateDynamic("InstanceCounts")(InstanceCounts)
    if (PriceSchedules != null) __obj.updateDynamic("PriceSchedules")(PriceSchedules)
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId)
    if (ReservedInstancesListingId != null) __obj.updateDynamic("ReservedInstancesListingId")(ReservedInstancesListingId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UpdateDate != null) __obj.updateDynamic("UpdateDate")(UpdateDate)
    __obj.asInstanceOf[ReservedInstancesListing]
  }
}

