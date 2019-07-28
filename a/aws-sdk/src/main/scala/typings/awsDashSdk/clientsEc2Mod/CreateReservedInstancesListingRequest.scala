package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReservedInstancesListingRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure idempotency of your listings. This helps avoid duplicate listings. For more information, see Ensuring Idempotency.
    */
  var ClientToken: String
  /**
    * The number of instances that are a part of a Reserved Instance account to be listed in the Reserved Instance Marketplace. This number should be less than or equal to the instance count associated with the Reserved Instance ID specified in this call.
    */
  var InstanceCount: Integer
  /**
    * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance term.
    */
  var PriceSchedules: PriceScheduleSpecificationList
  /**
    * The ID of the active Standard Reserved Instance.
    */
  var ReservedInstancesId: String
}

object CreateReservedInstancesListingRequest {
  @scala.inline
  def apply(
    ClientToken: String,
    InstanceCount: Integer,
    PriceSchedules: PriceScheduleSpecificationList,
    ReservedInstancesId: String
  ): CreateReservedInstancesListingRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken, InstanceCount = InstanceCount, PriceSchedules = PriceSchedules, ReservedInstancesId = ReservedInstancesId)
  
    __obj.asInstanceOf[CreateReservedInstancesListingRequest]
  }
}

