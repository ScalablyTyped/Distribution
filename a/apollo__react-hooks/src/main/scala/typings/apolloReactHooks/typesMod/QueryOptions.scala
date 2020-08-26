package typings.apolloReactHooks.typesMod

import typings.apolloReactCommon.typesMod.QueryFunctionOptions
import typings.apolloReactCommon.typesMod.QueryResult
import typings.graphql.astMod.DocumentNode
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions[TData, TVariables] extends QueryFunctionOptions[TData, TVariables] {
  var children: js.UndefOr[js.Function1[/* result */ QueryResult[TData, TVariables], ReactNode]] = js.native
  var query: DocumentNode = js.native
}

object QueryOptions {
  @scala.inline
  def apply[TData, TVariables](query: DocumentNode): QueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions[_, _], TData, TVariables] (val x: Self with (QueryOptions[TData, TVariables])) extends AnyVal {
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
    def setChildren(value: /* result */ QueryResult[TData, TVariables] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

