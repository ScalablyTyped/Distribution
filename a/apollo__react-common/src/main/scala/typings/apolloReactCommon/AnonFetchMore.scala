package typings.apolloReactCommon

import typings.apolloClient.observableQueryMod.FetchMoreOptions
import typings.apolloClient.typesMod.ApolloQueryResult
import typings.apolloClient.watchQueryOptionsMod.FetchMoreQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetchMore[TVariables, TData] extends js.Object {
  var fetchMore: (js.Function1[
    /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
    js.Promise[ApolloQueryResult[TData]]
  ]) with (js.Function1[
    /* fetchMoreOptions */ AnonQuery with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
    js.Promise[ApolloQueryResult[_]]
  ])
}

object AnonFetchMore {
  @scala.inline
  def apply[TVariables, TData](
    fetchMore: (js.Function1[
      /* fetchMoreOptions */ (FetchMoreQueryOptions[TVariables, String]) with (FetchMoreOptions[TData, TVariables]), 
      js.Promise[ApolloQueryResult[TData]]
    ]) with (js.Function1[
      /* fetchMoreOptions */ AnonQuery with (FetchMoreQueryOptions[_, String]) with (FetchMoreOptions[_, _]), 
      js.Promise[ApolloQueryResult[_]]
    ])
  ): AnonFetchMore[TVariables, TData] = {
    val __obj = js.Dynamic.literal(fetchMore = fetchMore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFetchMore[TVariables, TData]]
  }
}

