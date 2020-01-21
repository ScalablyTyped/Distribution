package typings.apolloServerCaching

import typings.apolloServerCaching.keyValueCacheMod.TestableKeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching/dist/InMemoryLRUCache", JSImport.Namespace)
@js.native
object inMemoryLRUCacheMod extends js.Object {
  @js.native
  class InMemoryLRUCache[V] () extends TestableKeyValueCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: AnonKey[V]) = this()
    var store: js.Any = js.native
    @JSName("flush")
    def flush_MInMemoryLRUCache(): js.Promise[Unit] = js.native
    def getTotalSize(): js.Promise[Double] = js.native
    def set(key: String, value: V, options: AnonTtl): js.Promise[Unit] = js.native
  }
  
}

