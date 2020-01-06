package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsuccessfulInstanceCreditSpecificationItem extends js.Object {
  /**
    * The applicable error for the burstable performance instance whose credit option for CPU usage was not modified.
    */
  var Error: js.UndefOr[UnsuccessfulInstanceCreditSpecificationItemError] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object UnsuccessfulInstanceCreditSpecificationItem {
  @scala.inline
  def apply(Error: UnsuccessfulInstanceCreditSpecificationItemError = null, InstanceId: String = null): UnsuccessfulInstanceCreditSpecificationItem = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsuccessfulInstanceCreditSpecificationItem]
  }
}

