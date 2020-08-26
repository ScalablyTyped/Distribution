package typings.apolloClient.anon

import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typings.apolloClient.watchQueryOptionsMod.FetchPolicy
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<apollo-client.apollo-client/core/watchQueryOptions.QueryOptions<apollo-client.apollo-client/core/types.OperationVariables>> */
@js.native
trait PartialQueryOptionsOperat extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var fetchResults: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var query: js.UndefOr[DocumentNode] = js.native
  var variables: js.UndefOr[OperationVariables] = js.native
}

object PartialQueryOptionsOperat {
  @scala.inline
  def apply(): PartialQueryOptionsOperat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialQueryOptionsOperat]
  }
  @scala.inline
  implicit class PartialQueryOptionsOperatOps[Self <: PartialQueryOptionsOperat] (val x: Self) extends AnyVal {
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
    def setFetchResults(value: Boolean): Self = this.set("fetchResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchResults: Self = this.set("fetchResults", js.undefined)
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setVariables(value: OperationVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

