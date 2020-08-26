package typings.apolloReactHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CommonOptions[TOptions] = TOptions with typings.apolloReactHooks.anon.`0`
  type MutationTuple[TData, TVariables] = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[typings.apolloReactCommon.typesMod.MutationFunctionOptions[TData, TVariables]], 
      js.Promise[typings.apolloReactCommon.typesMod.ExecutionResult[TData]]
    ], 
    typings.apolloReactCommon.typesMod.MutationResult[TData]
  ]
  type QueryTuple[TData, TVariables] = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[typings.apolloReactHooks.typesMod.QueryLazyOptions[TVariables]], 
      scala.Unit
    ], 
    typings.apolloReactCommon.typesMod.QueryResult[TData, TVariables]
  ]
}
