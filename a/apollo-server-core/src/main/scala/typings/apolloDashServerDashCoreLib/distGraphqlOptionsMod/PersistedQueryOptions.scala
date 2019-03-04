package typings
package apolloDashServerDashCoreLib.distGraphqlOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistedQueryOptions extends js.Object {
  var cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String]
}

object PersistedQueryOptions {
  @scala.inline
  def apply(cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String]): PersistedQueryOptions = {
    val __obj = js.Dynamic.literal(cache = cache)
  
    __obj.asInstanceOf[PersistedQueryOptions]
  }
}

