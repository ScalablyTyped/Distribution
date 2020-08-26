package typings.apolloCache.typesCacheMod.Cache

import typings.apolloCache.dataProxyMod.DataProxy.Query
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadOptions[TVariables] extends Query[TVariables] {
  var optimistic: Boolean = js.native
  var previousResult: js.UndefOr[js.Any] = js.native
  var rootId: js.UndefOr[String] = js.native
}

object ReadOptions {
  @scala.inline
  def apply[TVariables](optimistic: Boolean, query: DocumentNode): ReadOptions[TVariables] = {
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions[TVariables]]
  }
  @scala.inline
  implicit class ReadOptionsOps[Self <: ReadOptions[_], TVariables] (val x: Self with ReadOptions[TVariables]) extends AnyVal {
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
    def setOptimistic(value: Boolean): Self = this.set("optimistic", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousResult(value: js.Any): Self = this.set("previousResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousResult: Self = this.set("previousResult", js.undefined)
    @scala.inline
    def setRootId(value: String): Self = this.set("rootId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootId: Self = this.set("rootId", js.undefined)
  }
  
}

