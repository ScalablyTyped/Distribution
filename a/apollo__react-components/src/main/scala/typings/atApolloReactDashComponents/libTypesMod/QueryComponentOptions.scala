package typings.atApolloReactDashComponents.libTypesMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
import typings.atApolloReactDashCommon.libTypesTypesMod.Context
import typings.atApolloReactDashCommon.libTypesTypesMod.QueryFunctionOptions
import typings.atApolloReactDashCommon.libTypesTypesMod.QueryResult
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryComponentOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var query: DocumentNode
  def children(result: QueryResult[TData, TVariables]): Element | Null
}

object QueryComponentOptions {
  @scala.inline
  def apply[TData, TVariables](
    children: QueryResult[TData, TVariables] => Element | Null,
    query: DocumentNode,
    client: default[_] = null,
    context: Context = null,
    displayName: String = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: TData => Unit = null,
    onError: /* error */ ApolloError => Unit = null,
    partialRefetch: js.UndefOr[Boolean] = js.undefined,
    pollInterval: Int | Double = null,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined,
    ssr: js.UndefOr[Boolean] = js.undefined,
    variables: TVariables = null
  ): QueryComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query)
    if (client != null) __obj.updateDynamic("client")(client)
    if (context != null) __obj.updateDynamic("context")(context)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (!js.isUndefined(partialRefetch)) __obj.updateDynamic("partialRefetch")(partialRefetch)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData)
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryComponentOptions[TData, TVariables]]
  }
}

