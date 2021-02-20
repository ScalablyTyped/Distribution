package typings.apolloServerCaching

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixingKeyValueCacheMod {
  
  @JSImport("apollo-server-caching/dist/PrefixingKeyValueCache", "PrefixingKeyValueCache")
  @js.native
  class PrefixingKeyValueCache[V] protected () extends KeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
    
    var prefix: js.Any = js.native
    
    var wrapped: js.Any = js.native
  }
}
