package typings.apolloUtilsKeyvaluecache

import typings.apolloUtilsKeyvaluecache.distKeyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInMemoryLRUCacheMod {
  
  @JSImport("@apollo/utils.keyvaluecache/dist/InMemoryLRUCache", "InMemoryLRUCache")
  @js.native
  open class InMemoryLRUCache[V /* <: js.Object */] ()
    extends StObject
       with KeyValueCache[V] {
    def this(lruCacheOpts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LRUCache.Options<string, V, any> */ Any) = this()
    
    /* private */ var cache: Any = js.native
    
    def clear(): Unit = js.native
    
    def keys(): js.Array[String] = js.native
  }
  /* static members */
  object InMemoryLRUCache {
    
    @JSImport("@apollo/utils.keyvaluecache/dist/InMemoryLRUCache", "InMemoryLRUCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sizeCalculation[V /* <: js.Object */](item: V): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeCalculation")(item.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
