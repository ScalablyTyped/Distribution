package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersRequest extends js.Object {
  /**
    * Specifies the number of users to return as a response to the ListUsers request.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsTransferMod.MaxResults] = js.undefined
  /**
    * When you can get additional results from the ListUsers call, a NextToken parameter is returned in the output. You can then pass in a subsequent command to the NextToken parameter to continue listing additional users.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsTransferMod.NextToken] = js.undefined
  /**
    * A system-assigned unique identifier for a Secure File Transfer Protocol (SFTP) server that has users assigned to it.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
}

object ListUsersRequest {
  @scala.inline
  def apply(ServerId: ServerId, MaxResults: Int | Double = null, NextToken: NextToken = null): ListUsersRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUsersRequest]
  }
}

