package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessfulQueuedPurchaseDeletion extends js.Object {
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}

object SuccessfulQueuedPurchaseDeletion {
  @scala.inline
  def apply(ReservedInstancesId: String = null): SuccessfulQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulQueuedPurchaseDeletion]
  }
}

