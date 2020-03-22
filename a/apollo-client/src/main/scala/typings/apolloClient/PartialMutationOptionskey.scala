package typings.apolloClient

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.typesMod.MutationQueryReducersMap
import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typings.apolloClient.watchQueryOptionsMod.FetchPolicy
import typings.apolloClient.watchQueryOptionsMod.MutationUpdaterFn
import typings.apolloClient.watchQueryOptionsMod.RefetchQueryDescription
import typings.apolloLink.typesMod.FetchResult
import typings.graphql.astMod.DocumentNode
import typings.graphql.executeMod.ExecutionResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-client.apollo-client/core/watchQueryOptions.MutationOptions<{[key: string] : any}, apollo-client.apollo-client/core/types.OperationVariables>> */
trait PartialMutationOptionskey extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var mutation: js.UndefOr[DocumentNode] = js.undefined
  var optimisticResponse: js.UndefOr[
    StringDictionary[js.Any] | (js.Function1[/* vars */ OperationVariables, StringDictionary[_]])
  ] = js.undefined
  var refetchQueries: js.UndefOr[
    (js.Function1[/* result */ ExecutionResult[StringDictionary[_]], RefetchQueryDescription]) | RefetchQueryDescription
  ] = js.undefined
  var update: js.UndefOr[MutationUpdaterFn[StringDictionary[_]]] = js.undefined
  var updateQueries: js.UndefOr[MutationQueryReducersMap[StringDictionary[_]]] = js.undefined
  var variables: js.UndefOr[OperationVariables] = js.undefined
}

object PartialMutationOptionskey {
  @scala.inline
  def apply(
    awaitRefetchQueries: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: FetchPolicy = null,
    mutation: DocumentNode = null,
    optimisticResponse: StringDictionary[js.Any] | (js.Function1[/* vars */ OperationVariables, StringDictionary[_]]) = null,
    refetchQueries: (js.Function1[/* result */ ExecutionResult[StringDictionary[_]], RefetchQueryDescription]) | RefetchQueryDescription = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[StringDictionary[_], Record[String, js.Any], Record[String, js.Any]]) => Unit = null,
    updateQueries: MutationQueryReducersMap[StringDictionary[_]] = null,
    variables: OperationVariables = null
  ): PartialMutationOptionskey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(awaitRefetchQueries)) __obj.updateDynamic("awaitRefetchQueries")(awaitRefetchQueries.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (mutation != null) __obj.updateDynamic("mutation")(mutation.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (refetchQueries != null) __obj.updateDynamic("refetchQueries")(refetchQueries.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    if (updateQueries != null) __obj.updateDynamic("updateQueries")(updateQueries.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMutationOptionskey]
  }
}

