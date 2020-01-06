package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditSpecificationRequest extends js.Object {
  /**
    * The credit option for CPU usage of a T2 or T3 instance. Valid values are standard and unlimited.
    */
  var CpuCredits: String = js.native
}

object CreditSpecificationRequest {
  @scala.inline
  def apply(CpuCredits: String): CreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(CpuCredits = CpuCredits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreditSpecificationRequest]
  }
}

