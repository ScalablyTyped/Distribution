package typings
package apolloDashServerDashCachingLib.apolloDashServerDashCachingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching", "PrefixingKeyValueCache")
@js.native
class PrefixingKeyValueCache[V] protected ()
  extends apolloDashServerDashCachingLib.distPrefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
  def this(wrapped: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[V], prefix: java.lang.String) = this()
}

