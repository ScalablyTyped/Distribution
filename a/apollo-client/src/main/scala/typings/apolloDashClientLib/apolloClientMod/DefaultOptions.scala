package typings
package apolloDashClientLib.apolloClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var mutate: js.UndefOr[
    apolloDashClientLib.coreWatchQueryOptionsMod.MutationBaseOptions[
      org.scalablytyped.runtime.StringDictionary[_], 
      apolloDashClientLib.coreTypesMod.OperationVariables
    ]
  ] = js.undefined
  var query: js.UndefOr[
    apolloDashClientLib.coreWatchQueryOptionsMod.QueryBaseOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ] = js.undefined
  var watchQuery: js.UndefOr[
    apolloDashClientLib.coreWatchQueryOptionsMod.ModifiableWatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    mutate: apolloDashClientLib.coreWatchQueryOptionsMod.MutationBaseOptions[
      org.scalablytyped.runtime.StringDictionary[_], 
      apolloDashClientLib.coreTypesMod.OperationVariables
    ] = null,
    query: apolloDashClientLib.coreWatchQueryOptionsMod.QueryBaseOptions[apolloDashClientLib.coreTypesMod.OperationVariables] = null,
    watchQuery: apolloDashClientLib.coreWatchQueryOptionsMod.ModifiableWatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables] = null
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (mutate != null) __obj.updateDynamic("mutate")(mutate)
    if (query != null) __obj.updateDynamic("query")(query)
    if (watchQuery != null) __obj.updateDynamic("watchQuery")(watchQuery)
    __obj.asInstanceOf[DefaultOptions]
  }
}

