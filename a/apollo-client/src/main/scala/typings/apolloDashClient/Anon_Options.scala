package typings.apolloDashClient

import typings.apolloDashClient.coreQueryManagerMod.QueryManager
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options[TVariables] extends js.Object {
  var options: WatchQueryOptions[TVariables]
  var queryManager: QueryManager[_]
  var shouldSubscribe: js.UndefOr[Boolean] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply[TVariables](
    options: WatchQueryOptions[TVariables],
    queryManager: QueryManager[_],
    shouldSubscribe: js.UndefOr[Boolean] = js.undefined
  ): Anon_Options[TVariables] = {
    val __obj = js.Dynamic.literal(options = options, queryManager = queryManager)
    if (!js.isUndefined(shouldSubscribe)) __obj.updateDynamic("shouldSubscribe")(shouldSubscribe)
    __obj.asInstanceOf[Anon_Options[TVariables]]
  }
}

