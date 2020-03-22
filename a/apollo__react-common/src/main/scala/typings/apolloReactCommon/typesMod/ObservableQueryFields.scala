package typings.apolloReactCommon.typesMod

import typings.apolloClient.observableQueryMod.FetchMoreOptions
import typings.apolloClient.observableQueryMod.UpdateQueryOptions
import typings.apolloClient.typesMod.ApolloQueryResult
import typings.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import typings.apolloClient.watchQueryOptionsMod.SubscribeToMoreOptions
import typings.apolloReactCommon.AnonQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-client.apollo-client.ObservableQuery<TData, TVariables>, 'startPolling' | 'stopPolling' | 'subscribeToMore' | 'updateQuery' | 'refetch' | 'variables'> & {  fetchMore  :<K extends keyof TVariables>(fetchMoreOptions : apollo-client.apollo-client.FetchMoreQueryOptions<TVariables, K> & apollo-client.apollo-client.FetchMoreOptions<TData, TVariables>): std.Promise<apollo-client.apollo-client.ApolloQueryResult<TData>> & <TData2, TVariables2, K extends keyof TVariables2>(fetchMoreOptions : {  query ? :graphql.graphql.DocumentNode} & apollo-client.apollo-client.FetchMoreQueryOptions<TVariables2, K> & apollo-client.apollo-client.FetchMoreOptions<TData2, TVariables2>): std.Promise<apollo-client.apollo-client.ApolloQueryResult<TData2>>} */
trait ObservableQueryFields[TData, TVariables] extends js.Object {
  var fetchMore: (js.Function1[
    /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
    js.Promise[ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ AnonQuery with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
    js.Promise[ApolloQueryResult[_]]
  ])
  var refetch: js.Function0[js.Promise[ApolloQueryResult[TData]]]
  var startPolling: js.Function1[/* pollInterval */ Double, Unit]
  var stopPolling: js.Function0[Unit]
  var subscribeToMore: js.Function1[/* options */ SubscribeToMoreOptions[TData, TVariables, TData], js.Function0[Unit]]
  var updateQuery: js.Function1[
    /* mapFn */ js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVariables], TData], 
    Unit
  ]
  var variables: TVariables
}

object ObservableQueryFields {
  @scala.inline
  def apply[TData, TVariables](
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ AnonQuery with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
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
}

