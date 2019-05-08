package typings
package apolloDashServerDashCachingLib.distPrefixingKeyValueCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching/dist/PrefixingKeyValueCache", "PrefixingKeyValueCache")
@js.native
class PrefixingKeyValueCache[V] protected ()
  extends apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[V] {
  def this(wrapped: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[V], prefix: java.lang.String) = this()
  var prefix: js.Any = js.native
  var wrapped: js.Any = js.native
}

