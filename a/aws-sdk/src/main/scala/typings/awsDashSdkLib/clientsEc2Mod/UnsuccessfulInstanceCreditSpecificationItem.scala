package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsuccessfulInstanceCreditSpecificationItem extends js.Object {
  /**
    * The applicable error for the T2 or T3 instance whose credit option for CPU usage was not modified.
    */
  var Error: js.UndefOr[UnsuccessfulInstanceCreditSpecificationItemError] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object UnsuccessfulInstanceCreditSpecificationItem {
  @scala.inline
  def apply(Error: UnsuccessfulInstanceCreditSpecificationItemError = null, InstanceId: String = null): UnsuccessfulInstanceCreditSpecificationItem = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[UnsuccessfulInstanceCreditSpecificationItem]
  }
}

