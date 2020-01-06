package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDefaultCreditSpecificationResult extends js.Object {
  /**
    * The default credit option for CPU usage of the instance family.
    */
  var InstanceFamilyCreditSpecification: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceFamilyCreditSpecification] = js.native
}

object ModifyDefaultCreditSpecificationResult {
  @scala.inline
  def apply(InstanceFamilyCreditSpecification: InstanceFamilyCreditSpecification = null): ModifyDefaultCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceFamilyCreditSpecification != null) __obj.updateDynamic("InstanceFamilyCreditSpecification")(InstanceFamilyCreditSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDefaultCreditSpecificationResult]
  }
}

