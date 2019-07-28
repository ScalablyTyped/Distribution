package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCommandInvocationsResult extends js.Object {
  /**
    * (Optional) A list of all invocations. 
    */
  var CommandInvocations: js.UndefOr[CommandInvocationList] = js.undefined
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object ListCommandInvocationsResult {
  @scala.inline
  def apply(CommandInvocations: CommandInvocationList = null, NextToken: NextToken = null): ListCommandInvocationsResult = {
    val __obj = js.Dynamic.literal()
    if (CommandInvocations != null) __obj.updateDynamic("CommandInvocations")(CommandInvocations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCommandInvocationsResult]
  }
}

