package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MutationBaseOptions[T, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[scala.Boolean] = js.undefined
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var optimisticResponse: js.UndefOr[js.Object | js.Function] = js.undefined
  var refetchQueries: js.UndefOr[
    (js.Function1[
      /* result */ graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault], 
      RefetchQueryDescription
    ]) | RefetchQueryDescription
  ] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[T]] = js.undefined
  var updateQueries: js.UndefOr[apolloDashClientLib.coreTypesMod.MutationQueryReducersMap[T]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

