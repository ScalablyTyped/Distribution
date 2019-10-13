package typings.atApolloReactDashComponents.libTypesMod

import typings.apolloDashCache.libTypesDataProxyMod.DataProxy
import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreTypesMod.PureQueryOptions
import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.atApolloReactDashCommon.libTypesTypesMod.BaseMutationOptions
import typings.atApolloReactDashCommon.libTypesTypesMod.Context
import typings.atApolloReactDashCommon.libTypesTypesMod.MutationFunction
import typings.atApolloReactDashCommon.libTypesTypesMod.MutationResult
import typings.atApolloReactDashCommon.libTypesTypesMod.RefetchQueriesFunction
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationComponentOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: DocumentNode
  def children(mutateFunction: MutationFunction[TData, TVariables], result: MutationResult[TData]): Element | Null
}

object MutationComponentOptions {
  @scala.inline
  def apply[TData, TVariables](
    children: (MutationFunction[TData, TVariables], MutationResult[TData]) => Element | Null,
    mutation: DocumentNode,
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    client: default[js.Object] = null,
    context: Context = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    ignoreResults: js.UndefOr[Boolean] = js.undefined,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: TData => Unit = null,
    onError: /* error */ ApolloError => Unit = null,
    optimisticResponse: TData | (js.Function1[TVariables, TData]) = null,
    refetchQueries: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[TData, Record[String, js.Any], Record[String, js.Any]]) => Unit = null,
    variables: TVariables = null
  ): MutationComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), mutation = mutation)
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries)
    if (client != null) __obj.updateDynamic("client")(client)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(ignoreResults)) __obj.updateDynamic("ignoreResults")(ignoreResults)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationComponentOptions[TData, TVariables]]
  }
}

