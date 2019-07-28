package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceCreditSpecification extends js.Object {
  /**
    * The credit option for CPU usage of the instance. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object InstanceCreditSpecification {
  @scala.inline
  def apply(CpuCredits: String = null, InstanceId: String = null): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (CpuCredits != null) __obj.updateDynamic("CpuCredits")(CpuCredits)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
}

