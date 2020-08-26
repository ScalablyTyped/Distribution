package typings.apolloReactCommon.typesMod

import typings.apolloClient.mod.ApolloError
import typings.apolloClient.mod.default
import typings.apolloClient.networkStatusMod.NetworkStatus
import typings.apolloClient.observableQueryMod.FetchMoreOptions
import typings.apolloClient.observableQueryMod.UpdateQueryOptions
import typings.apolloClient.typesMod.ApolloQueryResult
import typings.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typings.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import typings.apolloReactCommon.anon.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult[TData, TVariables] extends ObservableQueryFields[TData, TVariables] {
  var called: Boolean = js.native
  var client: default[_] = js.native
  var data: js.UndefOr[TData] = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
  var networkStatus: NetworkStatus = js.native
}

object QueryResult {
  @scala.inline
  def apply[TData, TVariables](
    called: Boolean,
    client: default[_],
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, /* keyof TVariables */ String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ Query with (FetchMoreQueryOptions[_, /* keyof any */ String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ]),
    loading: Boolean,
    networkStatus: NetworkStatus,
    refetch: () => js.Promise[ApolloQueryResult[TData]],
    startPolling: /* pollInterval */ Double => Unit,
    stopPolling: () => Unit,
    subscribeToMore: /* options */ SubscribeToMoreOptions[TData, TVariables, TData] => js.Function0[Unit],
    updateQuery: /* mapFn */ js.Function2[TData, /* options */ UpdateQueryOptions[TVariables], TData] => Unit,
    variables: TVariables
  ): QueryResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], fetchMore = fetchMore.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], refetch = js.Any.fromFunction0(refetch), startPolling = js.Any.fromFunction1(startPolling), stopPolling = js.Any.fromFunction0(stopPolling), subscribeToMore = js.Any.fromFunction1(subscribeToMore), updateQuery = js.Any.fromFunction1(updateQuery), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult[_, _], TData, TVariables] (val x: Self with (QueryResult[TData, TVariables])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalled(value: Boolean): Self = this.set("called", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: default[_]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkStatus(value: NetworkStatus): Self = this.set("networkStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: ApolloError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

