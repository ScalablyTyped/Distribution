package typings
package apolloDashClientLib.apolloClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultOptions extends js.Object {
  var mutate: js.UndefOr[
    stdLib.Partial[
      apolloDashClientLib.coreWatchQueryOptionsMod.MutationOptions[
        org.scalablytyped.runtime.StringDictionary[_], 
        apolloDashClientLib.coreTypesMod.OperationVariables
      ]
    ]
  ] = js.undefined
  var query: js.UndefOr[
    stdLib.Partial[
      apolloDashClientLib.coreWatchQueryOptionsMod.QueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
    ]
  ] = js.undefined
  var watchQuery: js.UndefOr[
    stdLib.Partial[
      apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
    ]
  ] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    mutate: stdLib.Partial[
      apolloDashClientLib.coreWatchQueryOptionsMod.MutationOptions[
        org.scalablytyped.runtime.StringDictionary[_], 
        apolloDashClientLib.coreTypesMod.OperationVariables
      ]
    ] = null,
    query: stdLib.Partial[
      apolloDashClientLib.coreWatchQueryOptionsMod.QueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
    ] = null,
    watchQuery: stdLib.Partial[
      apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
    ] = null
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (mutate != null) __obj.updateDynamic("mutate")(mutate)
    if (query != null) __obj.updateDynamic("query")(query)
    if (watchQuery != null) __obj.updateDynamic("watchQuery")(watchQuery)
    __obj.asInstanceOf[DefaultOptions]
  }
}

