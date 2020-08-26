package typings.apolloClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.typesMod.MutationQueryReducersMap
import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.typesMod.PureQueryOptions
import typings.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typings.apolloClient.watchQueryOptionsMod.FetchPolicy
import typings.apolloClient.watchQueryOptionsMod.MutationUpdaterFn
import typings.apolloClient.watchQueryOptionsMod.RefetchQueryDescription
import typings.apolloLink.typesMod.FetchResult
import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-client.apollo-client/core/watchQueryOptions.MutationOptions<{[key: string] : any}, apollo-client.apollo-client/core/types.OperationVariables>> */
@js.native
trait PartialMutationOptionskey extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[js.Any] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var mutation: js.UndefOr[DocumentNode] = js.native
  var optimisticResponse: js.UndefOr[
    StringDictionary[js.Any] | (js.Function1[/* vars */ OperationVariables, StringDictionary[_]])
  ] = js.native
  var refetchQueries: js.UndefOr[
    (js.Function1[
      /* result */ FetchResult[StringDictionary[_], Record[String, _], Record[String, _]], 
      RefetchQueryDescription
    ]) | RefetchQueryDescription
  ] = js.native
  var update: js.UndefOr[MutationUpdaterFn[StringDictionary[_]]] = js.native
  var updateQueries: js.UndefOr[MutationQueryReducersMap[StringDictionary[_]]] = js.native
  var variables: js.UndefOr[OperationVariables] = js.native
}

object PartialMutationOptionskey {
  @scala.inline
  def apply(): PartialMutationOptionskey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMutationOptionskey]
  }
  @scala.inline
  implicit class PartialMutationOptionskeyOps[Self <: PartialMutationOptionskey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwaitRefetchQueries(value: Boolean): Self = this.set("awaitRefetchQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitRefetchQueries: Self = this.set("awaitRefetchQueries", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setErrorPolicy(value: ErrorPolicy): Self = this.set("errorPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorPolicy: Self = this.set("errorPolicy", js.undefined)
    @scala.inline
    def setFetchPolicy(value: FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    @scala.inline
    def setMutation(value: DocumentNode): Self = this.set("mutation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutation: Self = this.set("mutation", js.undefined)
    @scala.inline
    def setOptimisticResponseFunction1(value: /* vars */ OperationVariables => StringDictionary[_]): Self = this.set("optimisticResponse", js.Any.fromFunction1(value))
    @scala.inline
    def setOptimisticResponse(
      value: StringDictionary[js.Any] | (js.Function1[/* vars */ OperationVariables, StringDictionary[_]])
    ): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    @scala.inline
    def setRefetchQueriesVarargs(value: (String | PureQueryOptions)*): Self = this.set("refetchQueries", js.Array(value :_*))
    @scala.inline
    def setRefetchQueriesFunction1(
      value: /* result */ FetchResult[StringDictionary[_], Record[String, _], Record[String, _]] => RefetchQueryDescription
    ): Self = this.set("refetchQueries", js.Any.fromFunction1(value))
    @scala.inline
    def setRefetchQueries(
      value: (js.Function1[
          /* result */ FetchResult[StringDictionary[_], Record[String, _], Record[String, _]], 
          RefetchQueryDescription
        ]) | RefetchQueryDescription
    ): Self = this.set("refetchQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefetchQueries: Self = this.set("refetchQueries", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[StringDictionary[_], Record[String, js.Any], Record[String, js.Any]]) => Unit
    ): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpdateQueries(value: MutationQueryReducersMap[StringDictionary[_]]): Self = this.set("updateQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateQueries: Self = this.set("updateQueries", js.undefined)
    @scala.inline
    def setVariables(value: OperationVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

