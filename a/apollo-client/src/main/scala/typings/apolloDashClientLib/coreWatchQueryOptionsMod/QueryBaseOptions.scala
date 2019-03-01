package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryBaseOptions[TVariables] extends js.Object {
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var fetchResults: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object QueryBaseOptions {
  @scala.inline
  def apply[TVariables](
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: FetchPolicy = null,
    fetchResults: js.UndefOr[scala.Boolean] = js.undefined,
    variables: TVariables = null
  ): QueryBaseOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBaseOptions[TVariables]]
  }
}

