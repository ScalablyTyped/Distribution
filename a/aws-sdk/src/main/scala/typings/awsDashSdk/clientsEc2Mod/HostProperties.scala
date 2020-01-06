package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostProperties extends js.Object {
  /**
    * The number of cores on the Dedicated Host.
    */
  var Cores: js.UndefOr[Integer] = js.native
  /**
    * The instance family supported by the Dedicated Host. For example, m5.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * The instance type supported by the Dedicated Host. For example, m5.large. If the host supports multiple instance types, no instanceType is returned.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The number of sockets on the Dedicated Host.
    */
  var Sockets: js.UndefOr[Integer] = js.native
  /**
    * The total number of vCPUs on the Dedicated Host.
    */
  var TotalVCpus: js.UndefOr[Integer] = js.native
}

object HostProperties {
  @scala.inline
  def apply(
    Cores: Int | scala.Double = null,
    InstanceFamily: String = null,
    InstanceType: String = null,
    Sockets: Int | scala.Double = null,
    TotalVCpus: Int | scala.Double = null
  ): HostProperties = {
    val __obj = js.Dynamic.literal()
    if (Cores != null) __obj.updateDynamic("Cores")(Cores.asInstanceOf[js.Any])
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (Sockets != null) __obj.updateDynamic("Sockets")(Sockets.asInstanceOf[js.Any])
    if (TotalVCpus != null) __obj.updateDynamic("TotalVCpus")(TotalVCpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostProperties]
  }
}

