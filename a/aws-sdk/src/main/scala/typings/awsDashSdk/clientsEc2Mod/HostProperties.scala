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
    Cores: Int | scala.Double = null,
    InstanceType: String = null,
    Sockets: Int | scala.Double = null,
    TotalVCpus: Int | scala.Double = null
  ): HostProperties = {
    val __obj = js.Dynamic.literal()
    if (Cores != null) __obj.updateDynamic("Cores")(Cores.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (Sockets != null) __obj.updateDynamic("Sockets")(Sockets.asInstanceOf[js.Any])
    if (TotalVCpus != null) __obj.updateDynamic("TotalVCpus")(TotalVCpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostProperties]
  }
}

