package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoadBalancerTlsCertificateResult extends js.Object {
  /**
    * An object containing information about the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object CreateLoadBalancerTlsCertificateResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateLoadBalancerTlsCertificateResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[CreateLoadBalancerTlsCertificateResult]
  }
}

