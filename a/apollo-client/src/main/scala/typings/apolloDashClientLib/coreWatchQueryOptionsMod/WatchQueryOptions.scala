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

