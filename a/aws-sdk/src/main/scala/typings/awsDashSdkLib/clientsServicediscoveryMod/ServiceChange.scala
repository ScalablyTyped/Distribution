package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceChange extends js.Object {
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsConfig: DnsConfigChange
  var HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
}

object ServiceChange {
  @scala.inline
  def apply(
    DnsConfig: DnsConfigChange,
    Description: ResourceDescription = null,
    HealthCheckConfig: HealthCheckConfig = null
  ): ServiceChange = {
    val __obj = js.Dynamic.literal(DnsConfig = DnsConfig)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HealthCheckConfig != null) __obj.updateDynamic("HealthCheckConfig")(HealthCheckConfig)
    __obj.asInstanceOf[ServiceChange]
  }
}

