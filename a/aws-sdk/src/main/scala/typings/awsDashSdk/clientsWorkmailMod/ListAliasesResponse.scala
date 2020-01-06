package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAliasesResponse extends js.Object {
  /**
    * The entity's paginated aliases.
    */
  var Aliases: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.Aliases] = js.native
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.native
}

object ListAliasesResponse {
  @scala.inline
  def apply(Aliases: Aliases = null, NextToken: NextToken = null): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAliasesResponse]
  }
}

