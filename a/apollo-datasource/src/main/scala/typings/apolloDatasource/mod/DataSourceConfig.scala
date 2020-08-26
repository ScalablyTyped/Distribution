package typings.apolloDatasource.mod

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceConfig[TContext] extends js.Object {
  var cache: KeyValueCache[String] = js.native
  var context: TContext = js.native
}

object DataSourceConfig {
  @scala.inline
  def apply[TContext](cache: KeyValueCache[String], context: TContext): DataSourceConfig[TContext] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfig[TContext]]
  }
  @scala.inline
  implicit class DataSourceConfigOps[Self <: DataSourceConfig[_], TContext] (val x: Self with DataSourceConfig[TContext]) extends AnyVal {
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
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
  }
  
}

