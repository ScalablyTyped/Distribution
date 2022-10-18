package typings.apolloUtilsKeyvaluecache

import typings.apolloUtilsKeyvaluecache.distKeyValueCacheMod.KeyValueCache
import typings.apolloUtilsLogger.mod.Logger
import typings.lruCache.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@apollo/utils.keyvaluecache", "ErrorsAreMissesCache")
  @js.native
  open class ErrorsAreMissesCache[V] protected ()
    extends typings.apolloUtilsKeyvaluecache.distErrorsAreMissesCacheMod.ErrorsAreMissesCache[V] {
    def this(cache: KeyValueCache[V]) = this()
    def this(cache: KeyValueCache[V], logger: Logger) = this()
  }
  
  @JSImport("@apollo/utils.keyvaluecache", "InMemoryLRUCache")
  @js.native
  open class InMemoryLRUCache[T] ()
    extends typings.apolloUtilsKeyvaluecache.distInMemoryLRUCacheMod.InMemoryLRUCache[T] {
    def this(lruCacheOpts: Options[String, T]) = this()
  }
  /* static members */
  object InMemoryLRUCache {
    
    @JSImport("@apollo/utils.keyvaluecache", "InMemoryLRUCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sizeCalculation[T](item: T): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeCalculation")(item.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("@apollo/utils.keyvaluecache", "PrefixingKeyValueCache")
  @js.native
  open class PrefixingKeyValueCache[V] protected ()
    extends typings.apolloUtilsKeyvaluecache.distPrefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
}
