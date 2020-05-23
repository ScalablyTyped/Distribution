package typings.apolloClient.anon

import typings.apolloClient.queryManagerMod.QueryManager
import typings.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TVariables] extends js.Object {
  var options: WatchQueryOptions[TVariables]
  var queryManager: QueryManager[_]
  var shouldSubscribe: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[TVariables](
    options: WatchQueryOptions[TVariables],
    queryManager: QueryManager[_],
    shouldSubscribe: js.UndefOr[Boolean] = js.undefined
  ): Options[TVariables] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], queryManager = queryManager.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldSubscribe)) __obj.updateDynamic("shouldSubscribe")(shouldSubscribe.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TVariables]]
  }
}

