package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConditionalForwardersRequest extends js.Object {
  /**
    * The directory ID for which to get the list of associated conditional forwarders.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * The fully qualified domain names (FQDN) of the remote domains for which to get the list of associated conditional forwarders. If this member is null, all conditional forwarders are returned.
    */
  var RemoteDomainNames: js.UndefOr[RemoteDomainNames] = js.undefined
}

object DescribeConditionalForwardersRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RemoteDomainNames: RemoteDomainNames = null): DescribeConditionalForwardersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
    if (RemoteDomainNames != null) __obj.updateDynamic("RemoteDomainNames")(RemoteDomainNames)
    __obj.asInstanceOf[DescribeConditionalForwardersRequest]
  }
}

