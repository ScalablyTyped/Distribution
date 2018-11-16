package typings
package apolloDashDatasourceLib.apolloDashDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceConfig[TContext] extends js.Object {
  var cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache
  var context: TContext
}

