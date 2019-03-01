package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options[TVariables] extends js.Object {
  var options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[TVariables]
  var queryManager: apolloDashClientLib.coreQueryManagerMod.QueryManager[_]
  var shouldSubscribe: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply[TVariables](
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[TVariables],
    queryManager: apolloDashClientLib.coreQueryManagerMod.QueryManager[_],
    shouldSubscribe: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Options[TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("queryManager")(queryManager)
    if (!js.isUndefined(shouldSubscribe)) __obj.updateDynamic("shouldSubscribe")(shouldSubscribe)
    __obj.asInstanceOf[Anon_Options[TVariables]]
  }
}

