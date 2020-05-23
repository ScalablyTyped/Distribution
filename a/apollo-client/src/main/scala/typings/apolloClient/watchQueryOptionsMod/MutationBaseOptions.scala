package typings.apolloClient.watchQueryOptionsMod

import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.typesMod.MutationQueryReducersMap
import typings.apolloLink.typesMod.FetchResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationBaseOptions[T, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var optimisticResponse: js.UndefOr[T | (js.Function1[/* vars */ TVariables, T])] = js.undefined
  var refetchQueries: js.UndefOr[
    (js.Function1[
      /* result */ FetchResult[T, Record[String, _], Record[String, _]], 
      RefetchQueryDescription
    ]) | RefetchQueryDescription
  ] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[T]] = js.undefined
  var updateQueries: js.UndefOr[MutationQueryReducersMap[T]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object MutationBaseOptions {
  @scala.inline
  def apply[T, TVariables](
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    errorPolicy: ErrorPolicy = null,
    optimisticResponse: T | (js.Function1[/* vars */ TVariables, T]) = null,
    refetchQueries: (js.Function1[
      /* result */ FetchResult[T, Record[String, _], Record[String, _]], 
      RefetchQueryDescription
    ]) | RefetchQueryDescription = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[T, Record[String, js.Any], Record[String, js.Any]]) => Unit = null,
    updateQueries: MutationQueryReducersMap[T] = null,
    variables: TVariables = null
  ): MutationBaseOptions[T, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries.get.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    if (updateQueries != null) __obj.updateDynamic("updateQueries")(updateQueries.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationBaseOptions[T, TVariables]]
  }
}

