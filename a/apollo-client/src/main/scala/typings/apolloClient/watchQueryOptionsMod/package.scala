package typings.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object watchQueryOptionsMod {
  type MutationUpdaterFn[T] = js.Function2[
    /* proxy */ typings.apolloCache.dataProxyMod.DataProxy, 
    /* mutationResult */ typings.apolloLink.typesMod.FetchResult[
      T, 
      typings.std.Record[java.lang.String, js.Any], 
      typings.std.Record[java.lang.String, js.Any]
    ], 
    scala.Unit
  ]
  type RefetchQueryDescription = js.Array[java.lang.String | typings.apolloClient.typesMod.PureQueryOptions]
  type UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData] = js.Function2[
    /* previousQueryResult */ TData, 
    /* options */ typings.apolloClient.anon.SubscriptionData[TSubscriptionData, TSubscriptionVariables], 
    TData
  ]
}
