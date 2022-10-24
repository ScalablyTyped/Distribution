package typings.apolloServerCaching

import typings.apolloServerCaching.anon.MaxSize
import typings.apolloServerCaching.anon.Ttl
import typings.apolloServerCaching.distKeyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInMemoryLRUCacheMod {
  
  @JSImport("apollo-server-caching/dist/InMemoryLRUCache", "InMemoryLRUCache")
  @js.native
  open class InMemoryLRUCache[V] ()
    extends StObject
       with KeyValueCache[V] {
    def this(param0: MaxSize[V]) = this()
    
    def flush(): js.Promise[Unit] = js.native
    
    def getTotalSize(): js.Promise[Double] = js.native
    
    def set(key: String, value: V, options: Ttl): js.Promise[Unit] = js.native
    
    /* private */ var store: Any = js.native
  }
  /* static members */
  object InMemoryLRUCache {
    
    @JSImport("apollo-server-caching/dist/InMemoryLRUCache", "InMemoryLRUCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def jsonBytesSizeCalculator[T](obj: T): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonBytesSizeCalculator")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
