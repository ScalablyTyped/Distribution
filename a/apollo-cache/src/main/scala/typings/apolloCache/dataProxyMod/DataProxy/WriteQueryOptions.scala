package typings.apolloCache.dataProxyMod.DataProxy

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteQueryOptions[TData, TVariables] extends Query[TVariables] {
  var data: TData = js.native
}

object WriteQueryOptions {
  @scala.inline
  def apply[TData, TVariables](data: TData, query: DocumentNode): WriteQueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteQueryOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class WriteQueryOptionsOps[Self <: WriteQueryOptions[_, _], TData, TVariables] (val x: Self with (WriteQueryOptions[TData, TVariables])) extends AnyVal {
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
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

