package typings.apolloServerCaching

import typings.apolloServerCaching.anon.MaxSize
import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apollo-server-caching", "InMemoryLRUCache")
  @js.native
  class InMemoryLRUCache[V] ()
    extends typings.apolloServerCaching.inMemoryLRUCacheMod.InMemoryLRUCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: MaxSize[V]) = this()
  }
  
  @JSImport("apollo-server-caching", "PrefixingKeyValueCache")
  @js.native
  class PrefixingKeyValueCache[V] protected ()
    extends typings.apolloServerCaching.prefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
}
