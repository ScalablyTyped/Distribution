package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserPoolClientsResponse extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  /**
    * The user pool clients in the response that lists user pool clients.
    */
  var UserPoolClients: js.UndefOr[UserPoolClientListType] = js.undefined
}

object ListUserPoolClientsResponse {
  @scala.inline
  def apply(NextToken: PaginationKey = null, UserPoolClients: UserPoolClientListType = null): ListUserPoolClientsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UserPoolClients != null) __obj.updateDynamic("UserPoolClients")(UserPoolClients)
    __obj.asInstanceOf[ListUserPoolClientsResponse]
  }
}

