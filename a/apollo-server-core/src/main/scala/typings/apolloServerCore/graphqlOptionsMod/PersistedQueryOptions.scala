package typings.apolloServerCore.graphqlOptionsMod

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistedQueryOptions extends js.Object {
  var cache: js.UndefOr[KeyValueCache[String]] = js.native
  var ttl: js.UndefOr[Double | Null] = js.native
}

object PersistedQueryOptions {
  @scala.inline
  def apply(): PersistedQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistedQueryOptions]
  }
  @scala.inline
  implicit class PersistedQueryOptionsOps[Self <: PersistedQueryOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: KeyValueCache[String]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setTtlNull: Self = this.set("ttl", null)
  }
  
}

