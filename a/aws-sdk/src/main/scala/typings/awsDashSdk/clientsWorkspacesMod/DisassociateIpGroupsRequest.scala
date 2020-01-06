package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateIpGroupsRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsDashSdk.clientsWorkspacesMod.DirectoryId = js.native
  /**
    * The identifiers of one or more IP access control groups.
    */
  var GroupIds: IpGroupIdList = js.native
}

object DisassociateIpGroupsRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, GroupIds: IpGroupIdList): DisassociateIpGroupsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], GroupIds = GroupIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateIpGroupsRequest]
  }
}

