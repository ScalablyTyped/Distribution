package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DnsProperties extends js.Object {
  /**
    * The ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
}

object DnsProperties {
  @scala.inline
  def apply(HostedZoneId: ResourceId = null): DnsProperties = {
    val __obj = js.Dynamic.literal()
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    __obj.asInstanceOf[DnsProperties]
  }
}

