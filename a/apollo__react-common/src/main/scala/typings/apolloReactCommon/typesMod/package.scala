package typings.apolloReactCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Context = typings.std.Record[java.lang.String, js.Any]
  type MutationFetchResult[TData, C, E] = typings.apolloReactCommon.typesMod.ExecutionResult[TData] with (typings.apolloReactCommon.AnonContext[E, C])
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
  type ObservableQueryFields[TData, TVariables] = (typings.std.Pick[
    typings.apolloClient.mod.ObservableQuery[TData, TVariables], 
    typings.apolloReactCommon.apolloReactCommonStrings.startPolling | typings.apolloReactCommon.apolloReactCommonStrings.stopPolling | typings.apolloReactCommon.apolloReactCommonStrings.subscribeToMore | typings.apolloReactCommon.apolloReactCommonStrings.updateQuery | typings.apolloReactCommon.apolloReactCommonStrings.refetch | typings.apolloReactCommon.apolloReactCommonStrings.variables
  ]) with (typings.apolloReactCommon.AnonFetchMore[TVariables, TData])
  type OperationVariables = typings.std.Record[java.lang.String, js.Any]
  type RefetchQueriesFunction = js.Function1[
    /* repeated */ js.Any, 
    js.Array[java.lang.String | typings.apolloClient.typesMod.PureQueryOptions]
  ]
}
