package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAliasesOutput extends js.Object {
  /**
    * Collection of alias records that match the list request.
    */
  var Aliases: js.UndefOr[AliasList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
}

object ListAliasesOutput {
  @scala.inline
  def apply(Aliases: AliasList = null, NextToken: NonEmptyString = null): ListAliasesOutput = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAliasesOutput]
  }
}

