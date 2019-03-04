package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions[TVariables] extends QueryBaseOptions[TVariables] {
  var context: js.UndefOr[js.Any] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
}

object QueryOptions {
  @scala.inline
  def apply[TVariables](
    query: graphqlLib.languageAstMod.DocumentNode,
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: FetchPolicy = null,
    fetchResults: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: js.Any = null,
    variables: TVariables = null
  ): QueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions[TVariables]]
  }
}

