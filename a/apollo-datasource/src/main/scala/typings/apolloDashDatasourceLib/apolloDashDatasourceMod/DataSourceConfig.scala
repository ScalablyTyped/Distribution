package typings
package apolloDashDatasourceLib.apolloDashDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceConfig[TContext] extends js.Object {
  var cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String]
  var context: TContext
}

object DataSourceConfig {
  @scala.inline
  def apply[TContext](
    cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String],
    context: TContext
  ): DataSourceConfig[TContext] = {
    val __obj = js.Dynamic.literal(cache = cache, context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceConfig[TContext]]
  }
}

