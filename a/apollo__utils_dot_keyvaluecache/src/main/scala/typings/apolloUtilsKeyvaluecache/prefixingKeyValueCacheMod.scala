package typings.apolloUtilsKeyvaluecache

import typings.apolloUtilsKeyvaluecache.keyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixingKeyValueCacheMod {
  
  @JSImport("@apollo/utils.keyvaluecache/dist/PrefixingKeyValueCache", "PrefixingKeyValueCache")
  @js.native
  open class PrefixingKeyValueCache[V] protected ()
    extends StObject
       with KeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
    
    /* private */ var prefix: Any = js.native
    
    /* private */ var wrapped: Any = js.native
  }
}
