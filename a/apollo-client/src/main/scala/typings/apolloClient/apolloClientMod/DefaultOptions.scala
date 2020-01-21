package typings.apolloClient.apolloClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.watchQueryOptionsMod.MutationOptions
import typings.apolloClient.watchQueryOptionsMod.QueryOptions
import typings.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var mutate: js.UndefOr[Partial[MutationOptions[StringDictionary[_], OperationVariables]]] = js.undefined
  var query: js.UndefOr[Partial[QueryOptions[OperationVariables]]] = js.undefined
  var watchQuery: js.UndefOr[Partial[WatchQueryOptions[OperationVariables]]] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    mutate: Partial[MutationOptions[StringDictionary[_], OperationVariables]] = null,
    query: Partial[QueryOptions[OperationVariables]] = null,
    watchQuery: Partial[WatchQueryOptions[OperationVariables]] = null
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (mutate != null) __obj.updateDynamic("mutate")(mutate.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (watchQuery != null) __obj.updateDynamic("watchQuery")(watchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
}

