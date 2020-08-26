package typings.apolloReactComponents.typesMod

import typings.apolloReactCommon.typesMod.QueryFunctionOptions
import typings.apolloReactCommon.typesMod.QueryResult
import typings.graphql.astMod.DocumentNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComponentOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var query: DocumentNode = js.native
  def children(result: QueryResult[TData, TVariables]): Element | Null = js.native
}

object QueryComponentOptions {
  @scala.inline
  def apply[TData, TVariables](children: QueryResult[TData, TVariables] => Element | Null, query: DocumentNode): QueryComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryComponentOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryComponentOptionsOps[Self <: QueryComponentOptions[_, _], TData, TVariables] (val x: Self with (QueryComponentOptions[TData, TVariables])) extends AnyVal {
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
    def setChildren(value: QueryResult[TData, TVariables] => Element | Null): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setQuery(value: DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

