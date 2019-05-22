package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreWatchQueryOptionsMod {
  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ apolloDashCacheLib.libTypesDataProxyMod.DataProxy, 
    /* mutationResult */ apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, js.Any], stdLib.Record[java.lang.String, js.Any]], 
    scala.Unit
  ]
  type RefetchQueryDescription = js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]
  type UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData] = js.Function2[
    /* previousQueryResult */ TData, 
    /* options */ apolloDashClientLib.Anon_SubscriptionData[TSubscriptionData, TSubscriptionVariables], 
    TData
  ]
}
