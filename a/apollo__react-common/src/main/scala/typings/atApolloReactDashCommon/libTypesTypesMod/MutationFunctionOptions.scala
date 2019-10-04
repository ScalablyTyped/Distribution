package typings.atApolloReactDashCommon.libTypesTypesMod

import typings.apolloDashClient.coreTypesMod.PureQueryOptions
import typings.apolloDashClient.coreWatchQueryOptionsMod.MutationUpdaterFn
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationFunctionOptions[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[Context] = js.undefined
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.undefined
  var optimisticResponse: js.UndefOr[TData | (js.Function1[/* vars */ TVariables | js.Object, TData])] = js.undefined
  var refetchQueries: js.UndefOr[(js.Array[String | PureQueryOptions]) | RefetchQueriesFunction] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object MutationFunctionOptions {
  @scala.inline
  def apply[TData, TVariables](
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    context: Context = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    optimisticResponse: TData | (js.Function1[/* vars */ TVariables | js.Object, TData]) = null,
    refetchQueries: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction = null,
    update: MutationUpdaterFn[TData] = null,
    variables: TVariables = null
  ): MutationFunctionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries)
    if (context != null) __obj.updateDynamic("context")(context)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationFunctionOptions[TData, TVariables]]
  }
}

