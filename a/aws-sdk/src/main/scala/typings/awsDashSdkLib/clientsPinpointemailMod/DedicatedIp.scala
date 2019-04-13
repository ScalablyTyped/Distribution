package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DedicatedIp extends js.Object {
  /**
    * An IP address that is reserved for use by your Amazon Pinpoint account.
    */
  var Ip: awsDashSdkLib.clientsPinpointemailMod.Ip
  /**
    * The name of the dedicated IP pool that the IP address is associated with.
    */
  var PoolName: js.UndefOr[PoolName] = js.undefined
  /**
    * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed the warm-up process and is ready for use.
    */
  var WarmupPercentage: Percentage100Wrapper
  /**
    * The warm-up status of a dedicated IP address. The status can have one of the following values:    IN_PROGRESS – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.    DONE – The dedicated IP warm-up process is complete, and the IP address is ready to use.  
    */
  var WarmupStatus: awsDashSdkLib.clientsPinpointemailMod.WarmupStatus
}

object DedicatedIp {
  @scala.inline
  def apply(
    Ip: Ip,
    WarmupPercentage: Percentage100Wrapper,
    WarmupStatus: WarmupStatus,
    PoolName: PoolName = null
  ): DedicatedIp = {
    val __obj = js.Dynamic.literal(Ip = Ip, WarmupPercentage = WarmupPercentage, WarmupStatus = WarmupStatus.asInstanceOf[js.Any])
    if (PoolName != null) __obj.updateDynamic("PoolName")(PoolName)
    __obj.asInstanceOf[DedicatedIp]
  }
}

