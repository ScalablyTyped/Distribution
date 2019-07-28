package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingGroupProperties extends js.Object {
  /**
    * The description of the billing group.
    */
  var billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.undefined
}

object BillingGroupProperties {
  @scala.inline
  def apply(billingGroupDescription: BillingGroupDescription = null): BillingGroupProperties = {
    val __obj = js.Dynamic.literal()
    if (billingGroupDescription != null) __obj.updateDynamic("billingGroupDescription")(billingGroupDescription)
    __obj.asInstanceOf[BillingGroupProperties]
  }
}

