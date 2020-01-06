package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFamilyCreditSpecification extends js.Object {
  /**
    * The default credit option for CPU usage of the instance family. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.native
  /**
    * The instance family.
    */
  var InstanceFamily: js.UndefOr[UnlimitedSupportedInstanceFamily] = js.native
}

object InstanceFamilyCreditSpecification {
  @scala.inline
  def apply(CpuCredits: String = null, InstanceFamily: UnlimitedSupportedInstanceFamily = null): InstanceFamilyCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (CpuCredits != null) __obj.updateDynamic("CpuCredits")(CpuCredits.asInstanceOf[js.Any])
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFamilyCreditSpecification]
  }
}

