package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDedicatedIpInPoolRequest extends js.Object {
  /**
    * The name of the IP pool that you want to add the dedicated IP address to. You have to specify an IP pool that already exists.
    */
  var DestinationPoolName: PoolName
  /**
    * The IP address that you want to move to the dedicated IP pool. The value you specify has to be a dedicated IP address that's associated with your Amazon Pinpoint account.
    */
  var Ip: typings.awsDashSdk.clientsPinpointemailMod.Ip
}

object PutDedicatedIpInPoolRequest {
  @scala.inline
  def apply(DestinationPoolName: PoolName, Ip: Ip): PutDedicatedIpInPoolRequest = {
    val __obj = js.Dynamic.literal(DestinationPoolName = DestinationPoolName, Ip = Ip)
  
    __obj.asInstanceOf[PutDedicatedIpInPoolRequest]
  }
}

