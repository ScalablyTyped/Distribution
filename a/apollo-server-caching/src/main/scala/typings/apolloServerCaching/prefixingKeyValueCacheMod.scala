package typings.apolloServerCaching

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixingKeyValueCacheMod {
  
  @JSImport("apollo-server-caching/dist/PrefixingKeyValueCache", "PrefixingKeyValueCache")
  @js.native
  class PrefixingKeyValueCache[V] protected ()
    extends StObject
       with KeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
    
    /* private */ var prefix: js.Any = js.native
    
    /* private */ var wrapped: js.Any = js.native
  }
}
