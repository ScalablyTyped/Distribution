package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestDNSAnswerRequest extends js.Object {
  /**
    * If the resolver that you specified for resolverip supports EDNS0, specify the IPv4 or IPv6 address of a client in the applicable location, for example, 192.0.2.44 or 2001:db8:85a3::8a2e:370:7334.
    */
  var EDNS0ClientSubnetIP: js.UndefOr[IPAddress] = js.undefined
  /**
    * If you specify an IP address for edns0clientsubnetip, you can optionally specify the number of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you specify 192.0.2.44 for edns0clientsubnetip and 24 for edns0clientsubnetmask, the checking tool will simulate a request from 192.0.2.0/24. The default value is 24 bits for IPv4 addresses and 64 bits for IPv6 addresses. The range of valid values depends on whether edns0clientsubnetip is an IPv4 or an IPv6 address:    IPv4: Specify a value between 0 and 32    IPv6: Specify a value between 0 and 128  
    */
  var EDNS0ClientSubnetMask: js.UndefOr[SubnetMask] = js.undefined
  /**
    * The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
    */
  var HostedZoneId: ResourceId
  /**
    * The name of the resource record set that you want Amazon Route 53 to simulate a query for.
    */
  var RecordName: DNSName
  /**
    * The type of the resource record set.
    */
  var RecordType: RRType
  /**
    * If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver. If you omit this value, TestDnsAnswer uses the IP address of a DNS resolver in the AWS US East (N. Virginia) Region (us-east-1).
    */
  var ResolverIP: js.UndefOr[IPAddress] = js.undefined
}

object TestDNSAnswerRequest {
  @scala.inline
  def apply(
    HostedZoneId: ResourceId,
    RecordName: DNSName,
    RecordType: RRType,
    EDNS0ClientSubnetIP: IPAddress = null,
    EDNS0ClientSubnetMask: SubnetMask = null,
    ResolverIP: IPAddress = null
  ): TestDNSAnswerRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId, RecordName = RecordName, RecordType = RecordType.asInstanceOf[js.Any])
    if (EDNS0ClientSubnetIP != null) __obj.updateDynamic("EDNS0ClientSubnetIP")(EDNS0ClientSubnetIP)
    if (EDNS0ClientSubnetMask != null) __obj.updateDynamic("EDNS0ClientSubnetMask")(EDNS0ClientSubnetMask)
    if (ResolverIP != null) __obj.updateDynamic("ResolverIP")(ResolverIP)
    __obj.asInstanceOf[TestDNSAnswerRequest]
  }
}

