package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
  /**
    * The dedicated IP address that you want to update the warm-up attributes for.
    */
  var Ip: typings.awsDashSdk.clientsSesv2Mod.Ip = js.native
  /**
    * The warm-up percentage that you want to associate with the dedicated IP address.
    */
  var WarmupPercentage: Percentage100Wrapper = js.native
}

object PutDedicatedIpWarmupAttributesRequest {
  @scala.inline
  def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper): PutDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
  }
}

