package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConditionalForwarderRequest extends js.Object {
  /**
    * The directory ID of the AWS directory for which to update the conditional forwarder.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
    */
  var DnsIpAddrs: typings.awsDashSdk.clientsDirectoryserviceMod.DnsIpAddrs
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
    */
  var RemoteDomainName: typings.awsDashSdk.clientsDirectoryserviceMod.RemoteDomainName
}

object UpdateConditionalForwarderRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, DnsIpAddrs: DnsIpAddrs, RemoteDomainName: RemoteDomainName): UpdateConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, DnsIpAddrs = DnsIpAddrs, RemoteDomainName = RemoteDomainName)
  
    __obj.asInstanceOf[UpdateConditionalForwarderRequest]
  }
}

