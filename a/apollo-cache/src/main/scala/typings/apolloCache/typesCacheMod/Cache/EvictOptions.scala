package typings.apolloCache.typesCacheMod.Cache

import typings.apolloCache.dataProxyMod.DataProxy.Query
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvictOptions[TVariables] extends Query[TVariables] {
  var rootId: js.UndefOr[String] = js.native
}

object EvictOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode): EvictOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvictOptions[TVariables]]
  }
  @scala.inline
  implicit class EvictOptionsOps[Self <: EvictOptions[_], TVariables] (val x: Self with EvictOptions[TVariables]) extends AnyVal {
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
    def setRootId(value: String): Self = this.set("rootId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootId: Self = this.set("rootId", js.undefined)
  }
  
}

