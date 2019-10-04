package typings.atApolloReactDashCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesTypesMod {
  import typings.apolloDashClient.apolloDashClientMod.ObservableQuery
  import typings.apolloDashClient.coreTypesMod.PureQueryOptions
  import typings.atApolloReactDashCommon.Anon_Context
  import typings.atApolloReactDashCommon.Anon_FetchMore
  import typings.atApolloReactDashCommon.atApolloReactDashCommonStrings.refetch
  import typings.atApolloReactDashCommon.atApolloReactDashCommonStrings.startPolling
  import typings.atApolloReactDashCommon.atApolloReactDashCommonStrings.stopPolling
  import typings.atApolloReactDashCommon.atApolloReactDashCommonStrings.subscribeToMore
  import typings.atApolloReactDashCommon.atApolloReactDashCommonStrings.updateQuery
  import typings.atApolloReactDashCommon.atApolloReactDashCommonStrings.variables
  import typings.std.Pick
  import typings.std.Record

  type Context = Record[String, js.Any]
  type MutationFetchResult[TData, C, E] = ExecutionResult[TData] with (Anon_Context[E, C])
  type MutationFunction[TData, TVariables] = js.Function1[
    /* options */ js.UndefOr[MutationFunctionOptions[TData, TVariables]], 
    js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]]
  ]
  type ObservableQueryFields[TData, TVariables] = (Pick[
    ObservableQuery[TData, TVariables], 
    startPolling | stopPolling | subscribeToMore | updateQuery | refetch | variables
  ]) with (Anon_FetchMore[TVariables, TData])
  type OperationVariables = Record[String, js.Any]
  type RefetchQueriesFunction = js.Function1[/* repeated */ js.Any, js.Array[String | PureQueryOptions]]
}
