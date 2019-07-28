package typings.apolloDashClient.coreWatchQueryOptionsMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryBaseOptions[TVariables] extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var fetchResults: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var query: DocumentNode
  var variables: js.UndefOr[TVariables] = js.undefined
}

object QueryBaseOptions {
  @scala.inline
  def apply[TVariables](
    query: DocumentNode,
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchResults: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Any = null,
    variables: TVariables = null
  ): QueryBaseOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBaseOptions[TVariables]]
  }
}

