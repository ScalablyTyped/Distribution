package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAliasesResponse extends js.Object {
  /**
    * The entity's paginated aliases.
    */
  var Aliases: js.UndefOr[Aliases] = js.undefined
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAliasesResponse {
  @scala.inline
  def apply(Aliases: Aliases = null, NextToken: NextToken = null): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAliasesResponse]
  }
}

