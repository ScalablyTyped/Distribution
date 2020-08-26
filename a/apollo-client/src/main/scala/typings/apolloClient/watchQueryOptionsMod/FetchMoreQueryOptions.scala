package typings.apolloClient.watchQueryOptionsMod

import typings.graphql.astMod.DocumentNode
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMoreQueryOptions[TVariables, K /* <: /* keyof TVariables */ String */] extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var query: js.UndefOr[DocumentNode] = js.native
  var variables: js.UndefOr[Pick[TVariables, K]] = js.native
}

object FetchMoreQueryOptions {
  @scala.inline
  def apply[TVariables, /* <: / * keyof TVariables * / java.lang.String */ K](): FetchMoreQueryOptions[TVariables, K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchMoreQueryOptions[TVariables, K]]
  }
  @scala.inline
  implicit class FetchMoreQueryOptionsOps[Self <: FetchMoreQueryOptions[_, _], TVariables, /* <: / * keyof TVariables * / java.lang.String */ K] (val x: Self with (FetchMoreQueryOptions[TVariables, K])) extends AnyVal {
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
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setVariables(value: Pick[TVariables, K]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

