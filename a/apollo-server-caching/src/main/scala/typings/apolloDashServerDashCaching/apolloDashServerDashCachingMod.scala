package typings.apolloDashServerDashCaching

import typings.apolloDashServerDashCaching.distKeyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching", JSImport.Namespace)
@js.native
object apolloDashServerDashCachingMod extends js.Object {
  @js.native
  class InMemoryLRUCache[V] ()
    extends typings.apolloDashServerDashCaching.distInMemoryLRUCacheMod.InMemoryLRUCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: Anon_Key[V]) = this()
  }
  
  @js.native
  class PrefixingKeyValueCache[V] protected ()
    extends typings.apolloDashServerDashCaching.distPrefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
  
}

