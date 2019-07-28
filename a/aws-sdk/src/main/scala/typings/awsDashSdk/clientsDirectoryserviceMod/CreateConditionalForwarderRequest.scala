package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConditionalForwarderRequest extends js.Object {
  /**
    * The directory ID of the AWS directory for which you are creating the conditional forwarder.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName.
    */
  var DnsIpAddrs: typings.awsDashSdk.clientsDirectoryserviceMod.DnsIpAddrs
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
    */
  var RemoteDomainName: typings.awsDashSdk.clientsDirectoryserviceMod.RemoteDomainName
}

object CreateConditionalForwarderRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, DnsIpAddrs: DnsIpAddrs, RemoteDomainName: RemoteDomainName): CreateConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, DnsIpAddrs = DnsIpAddrs, RemoteDomainName = RemoteDomainName)
  
    __obj.asInstanceOf[CreateConditionalForwarderRequest]
  }
}

