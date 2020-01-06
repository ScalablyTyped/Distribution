package typings.awsDashSdk.clientsSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountRolesRequest extends js.Object {
  /**
    * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
    */
  var accessToken: AccessTokenType = js.native
  /**
    * The identifier for the AWS account that is assigned to the user.
    */
  var accountId: AccountIdType = js.native
  /**
    * The number of items that clients can request per page.
    */
  var maxResults: js.UndefOr[MaxResultType] = js.native
  /**
    * The page token from the previous response output when you request subsequent pages.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
}

object ListAccountRolesRequest {
  @scala.inline
  def apply(
    accessToken: AccessTokenType,
    accountId: AccountIdType,
    maxResults: Int | Double = null,
    nextToken: NextTokenType = null
  ): ListAccountRolesRequest = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountRolesRequest]
  }
}

