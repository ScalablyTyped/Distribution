package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoolsInput extends js.Object {
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object ListIdentityPoolsInput {
  @scala.inline
  def apply(MaxResults: QueryLimit, NextToken: PaginationKey = null): ListIdentityPoolsInput = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolsInput]
  }
}

