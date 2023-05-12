package typings.apolloUtilsKeyvaluecache

import typings.apolloUtilsKeyvaluecache.distKeyValueCacheMod.KeyValueCache
import typings.apolloUtilsLogger.mod.Logger
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
  open class InMemoryLRUCache[V /* <: js.Object */] ()
    extends typings.apolloUtilsKeyvaluecache.distInMemoryLRUCacheMod.InMemoryLRUCache[V] {
    def this(lruCacheOpts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LRUCache.Options<string, V, any> */ Any) = this()
  }
  /* static members */
  object InMemoryLRUCache {
    
    @JSImport("@apollo/utils.keyvaluecache", "InMemoryLRUCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sizeCalculation[V /* <: js.Object */](item: V): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeCalculation")(item.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("@apollo/utils.keyvaluecache", "PrefixingKeyValueCache")
  @js.native
  open class PrefixingKeyValueCache[V] protected ()
    extends typings.apolloUtilsKeyvaluecache.distPrefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
  /* static members */
  object PrefixingKeyValueCache {
    
    @JSImport("@apollo/utils.keyvaluecache", "PrefixingKeyValueCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cacheDangerouslyDoesNotNeedPrefixesForIsolation[V](c: KeyValueCache[V]): KeyValueCache[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheDangerouslyDoesNotNeedPrefixesForIsolation")(c.asInstanceOf[js.Any]).asInstanceOf[KeyValueCache[V]]
    
    inline def prefixesAreUnnecessaryForIsolation[V](c: KeyValueCache[V]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixesAreUnnecessaryForIsolation")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
