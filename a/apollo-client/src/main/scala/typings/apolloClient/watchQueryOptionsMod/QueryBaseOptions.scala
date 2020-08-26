package typings.apolloClient.watchQueryOptionsMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBaseOptions[TVariables] extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var fetchResults: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var query: DocumentNode = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object QueryBaseOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode): QueryBaseOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBaseOptions[TVariables]]
  }
  @scala.inline
  implicit class QueryBaseOptionsOps[Self <: QueryBaseOptions[_], TVariables] (val x: Self with QueryBaseOptions[TVariables]) extends AnyVal {
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
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setErrorPolicy(value: ErrorPolicy): Self = this.set("errorPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorPolicy: Self = this.set("errorPolicy", js.undefined)
    @scala.inline
    def setFetchResults(value: Boolean): Self = this.set("fetchResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchResults: Self = this.set("fetchResults", js.undefined)
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

