package typings.apolloServerCaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKeyValueCacheMod {
  
  @js.native
  trait KeyValueCache[V] extends StObject {
    
    def delete(key: String): js.Promise[Boolean | Unit] = js.native
    
    def get(key: String): js.Promise[js.UndefOr[V]] = js.native
    
    def set(key: String, value: V): js.Promise[Unit] = js.native
    def set(key: String, value: V, options: KeyValueCacheSetOptions): js.Promise[Unit] = js.native
  }
  
  trait KeyValueCacheSetOptions extends StObject {
    
    var ttl: js.UndefOr[Double | Null] = js.undefined
  }
  object KeyValueCacheSetOptions {
    
    inline def apply(): KeyValueCacheSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyValueCacheSetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyValueCacheSetOptions] (val x: Self) extends AnyVal {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlNull: Self = StObject.set(x, "ttl", null)
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
