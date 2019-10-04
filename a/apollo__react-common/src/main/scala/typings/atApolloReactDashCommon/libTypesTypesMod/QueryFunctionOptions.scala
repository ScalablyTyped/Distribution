package typings.atApolloReactDashCommon.libTypesTypesMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFunctionOptions[TData, TVariables] extends BaseQueryOptions[TVariables] {
  var displayName: js.UndefOr[String] = js.undefined
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.undefined
  var skip: js.UndefOr[Boolean] = js.undefined
}

object QueryFunctionOptions {
  @scala.inline
  def apply[TData, TVariables](
    client: default[_] = null,
    context: Context = null,
    displayName: String = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onCompleted: /* data */ TData => Unit = null,
    onError: /* error */ ApolloError => Unit = null,
    partialRefetch: js.UndefOr[Boolean] = js.undefined,
    pollInterval: Int | Double = null,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined,
    ssr: js.UndefOr[Boolean] = js.undefined,
    variables: TVariables = null
  ): QueryFunctionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[QueryFunctionOptions[TData, TVariables]]
  }
}

