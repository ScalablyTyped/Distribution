package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersResponse extends js.Object {
  /**
    * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional users.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsTransferMod.NextToken] = js.undefined
  /**
    * A system-assigned unique identifier for an SFTP server that the users are assigned to.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
  /**
    * Returns the user accounts and their properties for the ServerId value that you specify.
    */
  var Users: ListedUsers
}

object ListUsersResponse {
  @scala.inline
  def apply(ServerId: ServerId, Users: ListedUsers, NextToken: NextToken = null): ListUsersResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, Users = Users)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUsersResponse]
  }
}

