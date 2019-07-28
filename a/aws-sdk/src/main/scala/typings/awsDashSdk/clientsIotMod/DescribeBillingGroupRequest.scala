package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBillingGroupRequest extends js.Object {
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName
}

object DescribeBillingGroupRequest {
  @scala.inline
  def apply(billingGroupName: BillingGroupName): DescribeBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName)
  
    __obj.asInstanceOf[DescribeBillingGroupRequest]
  }
}

