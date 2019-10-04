package typings.atApolloReactDashHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typings.atApolloReactDashCommon.libTypesTypesMod.ExecutionResult
  import typings.atApolloReactDashCommon.libTypesTypesMod.MutationFunctionOptions
  import typings.atApolloReactDashCommon.libTypesTypesMod.MutationResult
  import typings.atApolloReactDashCommon.libTypesTypesMod.QueryResult
  import typings.atApolloReactDashHooks.Anon_ClientApolloClient

  type CommonOptions[TOptions] = TOptions with Anon_ClientApolloClient
  type MutationTuple[TData, TVariables] = js.Tuple2[
    js.Function1[
      /* options */ js.UndefOr[MutationFunctionOptions[TData, TVariables]], 
      js.Promise[ExecutionResult[TData]]
    ], 
    MutationResult[TData]
  ]
  type QueryTuple[TData, TVariables] = js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ]
}
