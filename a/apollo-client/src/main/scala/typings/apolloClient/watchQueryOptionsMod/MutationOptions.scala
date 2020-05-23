package typings.apolloClient.watchQueryOptionsMod

import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.typesMod.MutationQueryReducersMap
import typings.apolloLink.typesMod.FetchResult
import typings.graphql.astMod.DocumentNode
import typings.std.Record
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
    refetchQueries: (js.Function1[
      /* result */ FetchResult[T, Record[String, _], Record[String, _]], 
      RefetchQueryDescription
    ]) | RefetchQueryDescription = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[T, Record[String, js.Any], Record[String, js.Any]]) => Unit = null,
    updateQueries: MutationQueryReducersMap[T] = null,
    variables: TVariables = null
  ): MutationOptions[T, TVariables] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    if (updateQueries != null) __obj.updateDynamic("updateQueries")(updateQueries.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions[T, TVariables]]
  }
}

