package typings.apolloUtilsKeyvaluecache

import typings.apolloUtilsKeyvaluecache.anon.Ttl
import typings.apolloUtilsKeyvaluecache.keyValueCacheMod.KeyValueCache
import typings.apolloUtilsLogger.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsAreMissesCacheMod {
  
  @JSImport("@apollo/utils.keyvaluecache/dist/ErrorsAreMissesCache", "ErrorsAreMissesCache")
  @js.native
  open class ErrorsAreMissesCache[V] protected ()
    extends StObject
       with KeyValueCache[V] {
    def this(cache: KeyValueCache[V]) = this()
    def this(cache: KeyValueCache[V], logger: Logger) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    def set(key: String, value: V, opts: Ttl): js.Promise[Unit] = js.native
  }
}
