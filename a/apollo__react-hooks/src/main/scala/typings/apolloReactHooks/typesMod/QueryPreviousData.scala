package typings.apolloReactHooks.typesMod

import typings.apolloClient.mod.ApolloClient
import typings.apolloClient.mod.ApolloError
import typings.apolloReactCommon.typesMod.QueryResult
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryPreviousData[TData, TVariables] extends js.Object {
  var client: js.UndefOr[ApolloClient[js.Object]] = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var observableQueryOptions: js.UndefOr[js.Object] = js.native
  var options: js.UndefOr[QueryOptions[TData, TVariables]] = js.native
  var query: js.UndefOr[DocumentNode] = js.native
  var result: js.UndefOr[(QueryResult[TData, TVariables]) | Null] = js.native
}

object QueryPreviousData {
  @scala.inline
  def apply[TData, TVariables](): QueryPreviousData[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryPreviousData[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryPreviousDataOps[Self <: QueryPreviousData[_, _], TData, TVariables] (val x: Self with (QueryPreviousData[TData, TVariables])) extends AnyVal {
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
    def setClient(value: ApolloClient[js.Object]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setError(value: ApolloError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setObservableQueryOptions(value: js.Object): Self = this.set("observableQueryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservableQueryOptions: Self = this.set("observableQueryOptions", js.undefined)
    @scala.inline
    def setOptions(value: QueryOptions[TData, TVariables]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setResult(value: QueryResult[TData, TVariables]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setResultNull: Self = this.set("result", null)
  }
  
}

