package typings.atApolloReactDashCommon.libTypesTypesMod

import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus
import typings.apolloDashClient.coreObservableQueryMod.FetchMoreOptions
import typings.apolloDashClient.coreTypesMod.ApolloQueryResult
import typings.apolloDashClient.coreWatchQueryOptionsMod.FetchMoreQueryOptions
import typings.atApolloReactDashCommon.Anon_FetchMore
import typings.atApolloReactDashCommon.Anon_Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables' ]: apollo-client.apollo-client.ObservableQuery<TData, TVariables>[P]} */ trait QueryResult[TData, TVariables] extends Anon_FetchMore[TVariables, TData] {
  var called: Boolean
  var client: default[_]
  var data: js.UndefOr[TData] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var loading: Boolean
  var networkStatus: NetworkStatus
}

object QueryResult {
  @scala.inline
  def apply[TData, TVariables](
    called: Boolean,
    client: default[_],
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ Anon_Query with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ]),
    loading: Boolean,
    networkStatus: NetworkStatus,
    data: TData = null,
    error: ApolloError = null
  ): QueryResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal(called = called, client = client, fetchMore = fetchMore, loading = loading, networkStatus = networkStatus)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[QueryResult[TData, TVariables]]
  }
}

