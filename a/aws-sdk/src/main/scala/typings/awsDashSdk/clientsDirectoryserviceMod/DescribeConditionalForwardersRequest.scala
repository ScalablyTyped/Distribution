package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConditionalForwardersRequest extends js.Object {
  /**
    * The directory ID for which to get the list of associated conditional forwarders.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId = js.native
  /**
    * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional forwarders. If this member is null, all conditional forwarders are returned.
    */
  var RemoteDomainNames: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.RemoteDomainNames] = js.native
}

object DescribeConditionalForwardersRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RemoteDomainNames: RemoteDomainNames = null): DescribeConditionalForwardersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    if (RemoteDomainNames != null) __obj.updateDynamic("RemoteDomainNames")(RemoteDomainNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConditionalForwardersRequest]
  }
}

