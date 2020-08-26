package typings.apolloReactHooks.typesMod

import typings.apolloReactCommon.typesMod.QueryFunctionOptions
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryHookOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var query: js.UndefOr[DocumentNode] = js.native
}

object QueryHookOptions {
  @scala.inline
  def apply[TData, TVariables](): QueryHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryHookOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryHookOptionsOps[Self <: QueryHookOptions[_, _], TData, TVariables] (val x: Self with (QueryHookOptions[TData, TVariables])) extends AnyVal {
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
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

