package typings.apolloReactCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Context = typings.std.Record[java.lang.String, js.Any]
  type MutationFunction[TData, TVariables] = js.Function1[
    /* options */ js.UndefOr[typings.apolloReactCommon.typesMod.MutationFunctionOptions[TData, TVariables]], 
    js.Promise[
      typings.apolloReactCommon.typesMod.MutationFetchResult[
        TData, 
        typings.std.Record[java.lang.String, js.Any], 
        typings.std.Record[java.lang.String, js.Any]
      ]
    ]
  ]
  type OperationVariables = typings.std.Record[java.lang.String, js.Any]
  type RefetchQueriesFunction = js.Function1[
    /* repeated */ js.Any, 
    js.Array[java.lang.String | typings.apolloClient.typesMod.PureQueryOptions]
  ]
}
