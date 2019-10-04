package typings.atApolloReactDashHooks.libTypesMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreTypesMod.PureQueryOptions
import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.MutationUpdaterFn
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
import typings.atApolloReactDashCommon.libTypesTypesMod.BaseMutationOptions
import typings.atApolloReactDashCommon.libTypesTypesMod.Context
import typings.atApolloReactDashCommon.libTypesTypesMod.RefetchQueriesFunction
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationHookOptions[TData, TVariables] extends BaseMutationOptions[TData, TVariables] {
  var mutation: js.UndefOr[DocumentNode] = js.undefined
}

object MutationHookOptions {
  @scala.inline
  def apply[TData, TVariables](
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    client: default[js.Object] = null,
    context: Context = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    ignoreResults: js.UndefOr[Boolean] = js.undefined,
    mutation: DocumentNode = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: TData => Unit = null,
    onError: /* error */ ApolloError => Unit = null,
    optimisticResponse: TData | (js.Function1[TVariables, TData]) = null,
    refetchQueries: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction = null,
    update: MutationUpdaterFn[TData] = null,
    variables: TVariables = null
  ): MutationHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries)
    if (client != null) __obj.updateDynamic("client")(client)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(ignoreResults)) __obj.updateDynamic("ignoreResults")(ignoreResults)
    if (mutation != null) __obj.updateDynamic("mutation")(mutation)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction1(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationHookOptions[TData, TVariables]]
  }
}

