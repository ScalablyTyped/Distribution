package typings.apolloDashServerDashCaching.apolloDashServerDashCachingMod

import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching", "PrefixingKeyValueCache")
@js.native
class PrefixingKeyValueCache[V] protected ()
  extends typings.apolloDashServerDashCaching.distPrefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
  def this(wrapped: KeyValueCache[V], prefix: String) = this()
}

