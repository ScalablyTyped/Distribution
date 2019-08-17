package typings.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreWatchQueryOptionsMod {
  import typings.apolloDashCache.libTypesDataProxyMod.DataProxy
  import typings.apolloDashClient.Anon_SubscriptionData
  import typings.apolloDashClient.coreTypesMod.PureQueryOptions
  import typings.apolloDashLink.libTypesMod.FetchResult
  import typings.std.Record

  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ DataProxy, 
    /* mutationResult */ FetchResult[T, Record[String, js.Any], Record[String, js.Any]], 
    Unit
  ]
  type RefetchQueryDescription = js.Array[String | PureQueryOptions]
  type UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData] = js.Function2[
    /* previousQueryResult */ TData, 
    /* options */ Anon_SubscriptionData[TSubscriptionData, TSubscriptionVariables], 
    TData
  ]
}
