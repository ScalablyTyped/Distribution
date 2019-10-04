package typings.atApolloReactDashHooks.libTypesMod

import typings.apolloDashClient.apolloDashClientMod.ApolloClient
import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.coreTypesMod.ApolloQueryResult
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryPreviousData[TData, TVariables] extends js.Object {
  var client: js.UndefOr[ApolloClient[js.Object]] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var observableQueryOptions: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[QueryOptions[TData, TVariables]] = js.undefined
  var query: js.UndefOr[DocumentNode] = js.undefined
  var result: js.UndefOr[ApolloQueryResult[TData] | Null] = js.undefined
}

object QueryPreviousData {
  @scala.inline
  def apply[TData, TVariables](
    client: ApolloClient[js.Object] = null,
    error: ApolloError = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    observableQueryOptions: js.Object = null,
    options: QueryOptions[TData, TVariables] = null,
    query: DocumentNode = null,
    result: ApolloQueryResult[TData] = null
  ): QueryPreviousData[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (observableQueryOptions != null) __obj.updateDynamic("observableQueryOptions")(observableQueryOptions)
    if (options != null) __obj.updateDynamic("options")(options)
    if (query != null) __obj.updateDynamic("query")(query)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[QueryPreviousData[TData, TVariables]]
  }
}

