package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDedicatedIpWarmupAttributesRequest extends js.Object {
  /**
    * The dedicated IP address that you want to update the warm-up attributes for.
    */
  var Ip: awsDashSdkLib.clientsPinpointemailMod.Ip
  /**
    * The warm-up percentage that you want to associate with the dedicated IP address.
    */
  var WarmupPercentage: Percentage100Wrapper
}

object PutDedicatedIpWarmupAttributesRequest {
  @scala.inline
  def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper): PutDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip, WarmupPercentage = WarmupPercentage)
  
    __obj.asInstanceOf[PutDedicatedIpWarmupAttributesRequest]
  }
}

