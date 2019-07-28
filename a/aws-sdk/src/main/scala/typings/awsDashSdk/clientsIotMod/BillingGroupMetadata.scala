package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingGroupMetadata extends js.Object {
  /**
    * The date the billing group was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
}

object BillingGroupMetadata {
  @scala.inline
  def apply(creationDate: CreationDate = null): BillingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    __obj.asInstanceOf[BillingGroupMetadata]
  }
}

