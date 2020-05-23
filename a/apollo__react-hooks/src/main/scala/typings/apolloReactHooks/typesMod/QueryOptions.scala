package typings.apolloReactHooks.typesMod

import typings.apolloClient.mod.ApolloError
import typings.apolloClient.mod.default
import typings.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typings.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typings.apolloReactCommon.typesMod.Context
import typings.apolloReactCommon.typesMod.QueryFunctionOptions
import typings.apolloReactCommon.typesMod.QueryResult
import typings.graphql.astMod.DocumentNode
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var children: js.UndefOr[js.Function1[/* result */ QueryResult[TData, TVariables], ReactNode]] = js.undefined
  var query: DocumentNode
}

object QueryOptions {
  @scala.inline
  def apply[TData, TVariables](
    query: DocumentNode,
    children: /* result */ QueryResult[TData, TVariables] => ReactNode = null,
    client: default[_] = null,
    context: Context = null,
    displayName: String = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: TData => Unit = null,
    onError: /* error */ ApolloError => Unit = null,
    partialRefetch: js.UndefOr[Boolean] = js.undefined,
    pollInterval: js.UndefOr[Double] = js.undefined,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined,
    ssr: js.UndefOr[Boolean] = js.undefined,
    variables: TVariables = null
  ): QueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange.get.asInstanceOf[js.Any])
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (!js.isUndefined(partialRefetch)) __obj.updateDynamic("partialRefetch")(partialRefetch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pollInterval)) __obj.updateDynamic("pollInterval")(pollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.get.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions[TData, TVariables]]
  }
}

