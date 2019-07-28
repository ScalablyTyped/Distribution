package typings.apolloDashClient.coreWatchQueryOptionsMod

import typings.apolloDashClient.coreTypesMod.MutationQueryReducersMap
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationOptions[T, TVariables] extends MutationBaseOptions[T, TVariables] {
  var context: js.UndefOr[js.Any] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var mutation: DocumentNode
}

object MutationOptions {
  @scala.inline
  def apply[T, TVariables](
    mutation: DocumentNode,
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: FetchPolicy = null,
    optimisticResponse: T | (js.Function1[TVariables, T]) = null,
    refetchQueries: (js.Function1[/* result */ ExecutionResult[T], RefetchQueryDescription]) | RefetchQueryDescription = null,
    update: MutationUpdaterFn[T] = null,
    updateQueries: MutationQueryReducersMap[T] = null,
    variables: TVariables = null
  ): MutationOptions[T, TVariables] = {
    val __obj = js.Dynamic.literal(mutation = mutation)
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (updateQueries != null) __obj.updateDynamic("updateQueries")(updateQueries)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions[T, TVariables]]
  }
}

