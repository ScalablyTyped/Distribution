package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDedicatedIpPoolRequest extends js.Object {
  /**
    * The name of the dedicated IP pool that you want to delete.
    */
  var PoolName: typings.awsDashSdk.clientsPinpointemailMod.PoolName
}

object DeleteDedicatedIpPoolRequest {
  @scala.inline
  def apply(PoolName: PoolName): DeleteDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName)
  
    __obj.asInstanceOf[DeleteDedicatedIpPoolRequest]
  }
}

