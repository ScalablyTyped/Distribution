package typings.atApolloReactDashCommon

import typings.apolloDashClient.coreObservableQueryMod.FetchMoreOptions
import typings.apolloDashClient.coreTypesMod.ApolloQueryResult
import typings.apolloDashClient.coreWatchQueryOptionsMod.FetchMoreQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FetchMore[TVariables, TData] extends js.Object {
  var fetchMore: (js.Function1[
    /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
    js.Promise[ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ Anon_Query with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
    js.Promise[ApolloQueryResult[_]]
  ])
}

object Anon_FetchMore {
  @scala.inline
  def apply[TVariables, TData](
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ Anon_Query with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ])
  ): Anon_FetchMore[TVariables, TData] = {
    val __obj = js.Dynamic.literal(fetchMore = fetchMore)
  
    __obj.asInstanceOf[Anon_FetchMore[TVariables, TData]]
  }
}

