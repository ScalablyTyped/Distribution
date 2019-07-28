package typings.apolloDashDatasource.apolloDashDatasourceMod

import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceConfig[TContext] extends js.Object {
  var cache: KeyValueCache[String]
  var context: TContext
}

object DataSourceConfig {
  @scala.inline
  def apply[TContext](cache: KeyValueCache[String], context: TContext): DataSourceConfig[TContext] = {
    val __obj = js.Dynamic.literal(cache = cache, context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceConfig[TContext]]
  }
}

