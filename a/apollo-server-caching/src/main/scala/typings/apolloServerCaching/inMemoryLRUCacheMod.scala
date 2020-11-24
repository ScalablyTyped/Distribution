package typings.apolloServerCaching

import typings.apolloServerCaching.anon.MaxSize
import typings.apolloServerCaching.anon.Ttl
import typings.apolloServerCaching.keyValueCacheMod.TestableKeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-caching/dist/InMemoryLRUCache", JSImport.Namespace)
@js.native
object inMemoryLRUCacheMod extends js.Object {
  
  @js.native
  class InMemoryLRUCache[V] () extends TestableKeyValueCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: MaxSize[V]) = this()
    
    @JSName("flush")
    def flush_MInMemoryLRUCache(): js.Promise[Unit] = js.native
    
    def getTotalSize(): js.Promise[Double] = js.native
    
    def set(key: String, value: V, options: Ttl): js.Promise[Unit] = js.native
    
    var store: js.Any = js.native
  }
}
