package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DnsEntry extends js.Object {
  /**
    * The DNS name.
    */
  var DnsName: js.UndefOr[String] = js.undefined
  /**
    * The ID of the private hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.undefined
}

object DnsEntry {
  @scala.inline
  def apply(DnsName: String = null, HostedZoneId: String = null): DnsEntry = {
    val __obj = js.Dynamic.literal()
    if (DnsName != null) __obj.updateDynamic("DnsName")(DnsName)
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId)
    __obj.asInstanceOf[DnsEntry]
  }
}

