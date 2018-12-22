package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreWatchQueryOptionsMod {
  type ErrorPolicy = apolloDashClientLib.apolloDashClientLibStrings.none | apolloDashClientLib.apolloDashClientLibStrings.ignore | apolloDashClientLib.apolloDashClientLibStrings.all
  type FetchPolicy = apolloDashClientLib.apolloDashClientLibStrings.`cache-first` | apolloDashClientLib.apolloDashClientLibStrings.`cache-and-network` | apolloDashClientLib.apolloDashClientLibStrings.`network-only` | apolloDashClientLib.apolloDashClientLibStrings.`cache-only` | apolloDashClientLib.apolloDashClientLibStrings.`no-cache` | apolloDashClientLib.apolloDashClientLibStrings.standby
  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ apolloDashCacheLib.libTypesDataProxyMod.DataProxy, 
    /* mutationResult */ apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, js.Any], stdLib.Record[java.lang.String, js.Any]], 
    scala.Unit
  ]
  type RefetchQueryDescription = js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]
  type UpdateQueryFn[TData, TVariables, TSubscriptionData] = js.Function2[
    /* previousQueryResult */ TData, 
    /* options */ apolloDashClientLib.Anon_SubscriptionData[TSubscriptionData, TVariables], 
    TData
  ]
}
