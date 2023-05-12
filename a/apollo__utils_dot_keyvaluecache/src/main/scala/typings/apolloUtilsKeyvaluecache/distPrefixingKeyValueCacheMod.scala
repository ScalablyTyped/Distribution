package typings.apolloUtilsKeyvaluecache

import typings.apolloUtilsKeyvaluecache.distKeyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPrefixingKeyValueCacheMod {
  
  @JSImport("@apollo/utils.keyvaluecache/dist/PrefixingKeyValueCache", "PrefixingKeyValueCache")
  @js.native
  open class PrefixingKeyValueCache[V] protected ()
    extends StObject
       with KeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
    
    /* private */ var prefix: Any = js.native
    
    /* private */ var wrapped: Any = js.native
  }
  /* static members */
  object PrefixingKeyValueCache {
    
    @JSImport("@apollo/utils.keyvaluecache/dist/PrefixingKeyValueCache", "PrefixingKeyValueCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cacheDangerouslyDoesNotNeedPrefixesForIsolation[V](c: KeyValueCache[V]): KeyValueCache[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheDangerouslyDoesNotNeedPrefixesForIsolation")(c.asInstanceOf[js.Any]).asInstanceOf[KeyValueCache[V]]
    
    inline def prefixesAreUnnecessaryForIsolation[V](c: KeyValueCache[V]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixesAreUnnecessaryForIsolation")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
