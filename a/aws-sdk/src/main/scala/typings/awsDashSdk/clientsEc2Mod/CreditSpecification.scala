package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditSpecification extends js.Object {
  /**
    * The credit option for CPU usage of a T2 or T3 instance. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.undefined
}

object CreditSpecification {
  @scala.inline
  def apply(CpuCredits: String = null): CreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (CpuCredits != null) __obj.updateDynamic("CpuCredits")(CpuCredits)
    __obj.asInstanceOf[CreditSpecification]
  }
}

