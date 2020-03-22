package typings.apolloClient.apolloClientMod

import typings.apolloClient.PartialMutationOptionskey
import typings.apolloClient.PartialQueryOptionsOperat
import typings.apolloClient.PartialWatchQueryOptionsO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var mutate: js.UndefOr[PartialMutationOptionskey] = js.undefined
  var query: js.UndefOr[PartialQueryOptionsOperat] = js.undefined
  var watchQuery: js.UndefOr[PartialWatchQueryOptionsO] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    mutate: PartialMutationOptionskey = null,
    query: PartialQueryOptionsOperat = null,
    watchQuery: PartialWatchQueryOptionsO = null
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (mutate != null) __obj.updateDynamic("mutate")(mutate.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (watchQuery != null) __obj.updateDynamic("watchQuery")(watchQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
}

