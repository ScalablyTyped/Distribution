package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- apolloDashClientLib.coreWatchQueryOptionsMod.ModifiableWatchQueryOptions because var conflicts: errorPolicy, fetchPolicy, fetchResults, variables. Inlined pollInterval, notifyOnNetworkStatusChange */ trait WatchQueryOptions[TVariables] extends QueryOptions[TVariables] {
  var notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
}

object WatchQueryOptions {
  @scala.inline
  def apply[TVariables](
    query: graphqlLib.languageAstMod.DocumentNode,
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: FetchPolicy = null,
    fetchResults: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: js.Any = null,
    notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined,
    pollInterval: scala.Int | scala.Double = null,
    variables: TVariables = null
  ): WatchQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchQueryOptions[TVariables]]
  }
}

