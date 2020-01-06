package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentitiesRequest extends js.Object {
  /**
    * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is omitted, then all identities will be listed.
    */
  var IdentityType: js.UndefOr[typings.awsDashSdk.clientsSesMod.IdentityType] = js.native
  /**
    * The maximum number of identities per page. Possible values are 1-1000 inclusive.
    */
  var MaxItems: js.UndefOr[typings.awsDashSdk.clientsSesMod.MaxItems] = js.native
  /**
    * The token to use for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSesMod.NextToken] = js.native
}

object ListIdentitiesRequest {
  @scala.inline
  def apply(IdentityType: IdentityType = null, MaxItems: Int | Double = null, NextToken: NextToken = null): ListIdentitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (IdentityType != null) __obj.updateDynamic("IdentityType")(IdentityType.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesRequest]
  }
}

