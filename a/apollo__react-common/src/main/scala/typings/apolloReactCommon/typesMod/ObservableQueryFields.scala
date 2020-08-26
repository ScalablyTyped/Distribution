package typings.apolloReactCommon.typesMod

import typings.apolloClient.observableQueryMod.FetchMoreOptions
import typings.apolloClient.observableQueryMod.UpdateQueryOptions
import typings.apolloClient.typesMod.ApolloQueryResult
import typings.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typings.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import typings.apolloReactCommon.anon.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-client.apollo-client.ObservableQuery<TData, TVariables>, 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables'> & {  fetchMore :<K extends keyof TVariables>(fetchMoreOptions : apollo-client.apollo-client.FetchMoreQueryOptions<TVariables, K> & apollo-client.apollo-client.FetchMoreOptions<TData, TVariables>): std.Promise<apollo-client.apollo-client.ApolloQueryResult<TData>> & <TData2, TVariables2, K extends keyof TVariables2>(fetchMoreOptions : {  query :graphql.graphql.DocumentNode | undefined} & apollo-client.apollo-client.FetchMoreQueryOptions<TVariables2, K> & apollo-client.apollo-client.FetchMoreOptions<TData2, TVariables2>): std.Promise<apollo-client.apollo-client.ApolloQueryResult<TData2>>} */
@js.native
trait ObservableQueryFields[TData, TVariables] extends js.Object {
  var fetchMore: (js.Function1[
    /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, /* keyof TVariables */ String]) with (FetchMoreOptions[TData, TVariables]), 
    js.Promise[ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ Query with (FetchMoreQueryOptions[_, /* keyof any */ String]) with (FetchMoreOptions[_, _]), 
    js.Promise[ApolloQueryResult[_]]
  ]) = js.native
  var refetch: js.Function0[js.Promise[ApolloQueryResult[TData]]] = js.native
  var startPolling: js.Function1[/* pollInterval */ Double, Unit] = js.native
  var stopPolling: js.Function0[Unit] = js.native
  var subscribeToMore: js.Function1[/* options */ SubscribeToMoreOptions[TData, TVariables, TData], js.Function0[Unit]] = js.native
  var updateQuery: js.Function1[
    /* mapFn */ js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVariables], TData], 
    Unit
  ] = js.native
  var variables: TVariables = js.native
}

object ObservableQueryFields {
  @scala.inline
  def apply[TData, TVariables](
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, /* keyof TVariables */ String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ Query with (FetchMoreQueryOptions[_, /* keyof any */ String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ]),
    refetch: () => js.Promise[ApolloQueryResult[TData]],
    startPolling: /* pollInterval */ Double => Unit,
    stopPolling: () => Unit,
    subscribeToMore: /* options */ SubscribeToMoreOptions[TData, TVariables, TData] => js.Function0[Unit],
    updateQuery: /* mapFn */ js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVariables], TData] => Unit,
    variables: TVariables
  ): ObservableQueryFields[TData, TVariables] = {
    val __obj = js.Dynamic.literal(fetchMore = fetchMore.asInstanceOf[js.Any], refetch = js.Any.fromFunction0(refetch), startPolling = js.Any.fromFunction1(startPolling), stopPolling = js.Any.fromFunction0(stopPolling), subscribeToMore = js.Any.fromFunction1(subscribeToMore), updateQuery = js.Any.fromFunction1(updateQuery), variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservableQueryFields[TData, TVariables]]
  }
  @scala.inline
  implicit class ObservableQueryFieldsOps[Self <: ObservableQueryFields[_, _], TData, TVariables] (val x: Self with (ObservableQueryFields[TData, TVariables])) extends AnyVal {
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
    def setFetchMore(
      value: (js.Function1[
          /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, /* keyof TVariables */ String]) with (FetchMoreOptions[TData, TVariables]), 
          js.Promise[ApolloQueryResult[TData]]
        ]) with (js.Function1[
          /* fetchMoreOptions */ Query with (FetchMoreQueryOptions[_, /* keyof any */ String]) with (FetchMoreOptions[_, _]), 
          js.Promise[ApolloQueryResult[_]]
        ])
    ): Self = this.set("fetchMore", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefetch(value: () => js.Promise[ApolloQueryResult[TData]]): Self = this.set("refetch", js.Any.fromFunction0(value))
    @scala.inline
    def setStartPolling(value: /* pollInterval */ Double => Unit): Self = this.set("startPolling", js.Any.fromFunction1(value))
    @scala.inline
    def setStopPolling(value: () => Unit): Self = this.set("stopPolling", js.Any.fromFunction0(value))
    @scala.inline
    def setSubscribeToMore(value: /* options */ SubscribeToMoreOptions[TData, TVariables, TData] => js.Function0[Unit]): Self = this.set("subscribeToMore", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateQuery(
      value: /* mapFn */ js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVariables], TData] => Unit
    ): Self = this.set("updateQuery", js.Any.fromFunction1(value))
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

