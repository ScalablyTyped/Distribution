package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifiableWatchQueryOptions[TVariables] extends QueryBaseOptions[TVariables] {
  var notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
}

object ModifiableWatchQueryOptions {
  @scala.inline
  def apply[TVariables](
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: FetchPolicy = null,
    fetchResults: js.UndefOr[scala.Boolean] = js.undefined,
    notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined,
    pollInterval: scala.Int | scala.Double = null,
    variables: TVariables = null
  ): ModifiableWatchQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiableWatchQueryOptions[TVariables]]
  }
}

