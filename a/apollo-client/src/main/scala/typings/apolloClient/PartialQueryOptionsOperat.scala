package typings.apolloClient

import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typings.apolloClient.watchQueryOptionsMod.FetchPolicy
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-client.apollo-client/core/watchQueryOptions.QueryOptions<apollo-client.apollo-client/core/types.OperationVariables>> */
trait PartialQueryOptionsOperat extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var fetchResults: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var query: js.UndefOr[DocumentNode] = js.undefined
  var variables: js.UndefOr[OperationVariables] = js.undefined
}

object PartialQueryOptionsOperat {
  @scala.inline
  def apply(
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: FetchPolicy = null,
    fetchResults: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Any = null,
    query: DocumentNode = null,
    variables: OperationVariables = null
  ): PartialQueryOptionsOperat = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialQueryOptionsOperat]
  }
}

