package typings.apolloServerCaching

import typings.apolloServerCaching.anon.MaxSize
import typings.apolloServerCaching.distKeyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apollo-server-caching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("apollo-server-caching", "InMemoryLRUCache")
  @js.native
  open class InMemoryLRUCache[V] ()
    extends typings.apolloServerCaching.distInMemoryLRUCacheMod.InMemoryLRUCache[V] {
    def this(param0: MaxSize[V]) = this()
  }
  /* static members */
  object InMemoryLRUCache {
    
    @JSImport("apollo-server-caching", "InMemoryLRUCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def jsonBytesSizeCalculator[T](obj: T): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonBytesSizeCalculator")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("apollo-server-caching", "PrefixingKeyValueCache")
  @js.native
  open class PrefixingKeyValueCache[V] protected ()
    extends typings.apolloServerCaching.distPrefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
  
  inline def runKeyValueCacheTests(keyValueCache: KeyValueCache[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runKeyValueCacheTests")(keyValueCache.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def runKeyValueCacheTests(keyValueCache: KeyValueCache[String], tick: js.Function1[/* ms */ Double, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runKeyValueCacheTests")(keyValueCache.asInstanceOf[js.Any], tick.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
