package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessfulInstanceCreditSpecificationItem extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object SuccessfulInstanceCreditSpecificationItem {
  @scala.inline
  def apply(InstanceId: String = null): SuccessfulInstanceCreditSpecificationItem = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[SuccessfulInstanceCreditSpecificationItem]
  }
}

