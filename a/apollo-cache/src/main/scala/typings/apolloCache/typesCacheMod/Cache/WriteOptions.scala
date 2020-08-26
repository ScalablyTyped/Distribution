package typings.apolloCache.typesCacheMod.Cache

import typings.apolloCache.dataProxyMod.DataProxy.Query
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteOptions[TResult, TVariables] extends Query[TVariables] {
  var dataId: String = js.native
  var result: TResult = js.native
}

object WriteOptions {
  @scala.inline
  def apply[TResult, TVariables](dataId: String, query: DocumentNode, result: TResult): WriteOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions[TResult, TVariables]]
  }
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions[_, _], TResult, TVariables] (val x: Self with (WriteOptions[TResult, TVariables])) extends AnyVal {
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
    def setDataId(value: String): Self = this.set("dataId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: TResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

