package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAliasesOutput extends js.Object {
  /**
    * A collection of alias resources that match the request parameters.
    */
  var Aliases: js.UndefOr[AliasList] = js.native
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListAliasesOutput {
  @scala.inline
  def apply(Aliases: AliasList = null, NextToken: NonEmptyString = null): ListAliasesOutput = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAliasesOutput]
  }
}

