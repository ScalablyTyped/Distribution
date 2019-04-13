package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentityPoolsInput extends js.Object {
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}

object ListIdentityPoolsInput {
  @scala.inline
  def apply(MaxResults: QueryLimit, NextToken: PaginationKey = null): ListIdentityPoolsInput = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentityPoolsInput]
  }
}

