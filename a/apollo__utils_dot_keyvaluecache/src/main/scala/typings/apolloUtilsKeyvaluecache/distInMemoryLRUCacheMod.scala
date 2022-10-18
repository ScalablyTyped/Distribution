package typings.apolloUtilsKeyvaluecache

import typings.apolloUtilsKeyvaluecache.distKeyValueCacheMod.KeyValueCache
import typings.lruCache.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInMemoryLRUCacheMod {
  
  @JSImport("@apollo/utils.keyvaluecache/dist/InMemoryLRUCache", "InMemoryLRUCache")
  @js.native
  open class InMemoryLRUCache[T] ()
    extends StObject
       with KeyValueCache[T] {
    def this(lruCacheOpts: Options[String, T]) = this()
    
    /* private */ var cache: Any = js.native
    
    def clear(): Unit = js.native
    
    def keys(): js.Array[String] = js.native
  }
  /* static members */
  object InMemoryLRUCache {
    
    @JSImport("@apollo/utils.keyvaluecache/dist/InMemoryLRUCache", "InMemoryLRUCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sizeCalculation[T](item: T): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeCalculation")(item.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
