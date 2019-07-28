package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostProperties extends js.Object {
  /**
    * The number of cores on the Dedicated Host.
    */
  var Cores: js.UndefOr[Integer] = js.undefined
  /**
    * The instance type size that the Dedicated Host supports (for example, m3.medium).
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    * The number of sockets on the Dedicated Host.
    */
  var Sockets: js.UndefOr[Integer] = js.undefined
  /**
    * The number of vCPUs on the Dedicated Host.
    */
  var TotalVCpus: js.UndefOr[Integer] = js.undefined
}

object HostProperties {
  @scala.inline
  def apply(
    Cores: js.UndefOr[Integer] = js.undefined,
    InstanceType: String = null,
    Sockets: js.UndefOr[Integer] = js.undefined,
    TotalVCpus: js.UndefOr[Integer] = js.undefined
  ): HostProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Cores)) __obj.updateDynamic("Cores")(Cores)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (!js.isUndefined(Sockets)) __obj.updateDynamic("Sockets")(Sockets)
    if (!js.isUndefined(TotalVCpus)) __obj.updateDynamic("TotalVCpus")(TotalVCpus)
    __obj.asInstanceOf[HostProperties]
  }
}

