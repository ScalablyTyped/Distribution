package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDedicatedIpPoolRequest extends js.Object {
  /**
    * The name of the dedicated IP pool.
    */
  var PoolName: awsDashSdkLib.clientsPinpointemailMod.PoolName
  /**
    * An object that defines the tags (keys and values) that you want to associate with the pool.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateDedicatedIpPoolRequest {
  @scala.inline
  def apply(PoolName: PoolName, Tags: TagList = null): CreateDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateDedicatedIpPoolRequest]
  }
}

