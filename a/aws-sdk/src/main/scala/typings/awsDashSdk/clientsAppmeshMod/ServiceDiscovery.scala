package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceDiscovery extends js.Object {
  /**
    * Specifies any AWS Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery] = js.undefined
  /**
    * Specifies the DNS information for the virtual node.
    */
  var dns: js.UndefOr[DnsServiceDiscovery] = js.undefined
}

object ServiceDiscovery {
  @scala.inline
  def apply(awsCloudMap: AwsCloudMapServiceDiscovery = null, dns: DnsServiceDiscovery = null): ServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    if (awsCloudMap != null) __obj.updateDynamic("awsCloudMap")(awsCloudMap)
    if (dns != null) __obj.updateDynamic("dns")(dns)
    __obj.asInstanceOf[ServiceDiscovery]
  }
}

