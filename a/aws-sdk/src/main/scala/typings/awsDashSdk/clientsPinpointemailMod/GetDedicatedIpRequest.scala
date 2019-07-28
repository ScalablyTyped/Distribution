package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDedicatedIpRequest extends js.Object {
  /**
    * The IP address that you want to obtain more information about. The value you specify has to be a dedicated IP address that's assocaited with your Amazon Pinpoint account.
    */
  var Ip: typings.awsDashSdk.clientsPinpointemailMod.Ip
}

object GetDedicatedIpRequest {
  @scala.inline
  def apply(Ip: Ip): GetDedicatedIpRequest = {
    val __obj = js.Dynamic.literal(Ip = Ip)
  
    __obj.asInstanceOf[GetDedicatedIpRequest]
  }
}

