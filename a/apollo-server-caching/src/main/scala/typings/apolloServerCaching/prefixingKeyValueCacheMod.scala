package typings.apolloServerCaching

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-caching/dist/PrefixingKeyValueCache", JSImport.Namespace)
@js.native
object prefixingKeyValueCacheMod extends js.Object {
  
  @js.native
  class PrefixingKeyValueCache[V] protected () extends KeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
    
    var prefix: js.Any = js.native
    
    var wrapped: js.Any = js.native
  }
}
