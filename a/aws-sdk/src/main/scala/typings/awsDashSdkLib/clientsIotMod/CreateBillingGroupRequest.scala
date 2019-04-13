package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBillingGroupRequest extends js.Object {
  /**
    * The name you wish to give to the billing group.
    */
  var billingGroupName: BillingGroupName
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined
  /**
    * Metadata which can be used to manage the billing group.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateBillingGroupRequest {
  @scala.inline
  def apply(
    billingGroupName: BillingGroupName,
    billingGroupProperties: BillingGroupProperties = null,
    tags: TagList = null
  ): CreateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName)
    if (billingGroupProperties != null) __obj.updateDynamic("billingGroupProperties")(billingGroupProperties)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateBillingGroupRequest]
  }
}

