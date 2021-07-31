package typings.algoliaCacheInMemory

import typings.algoliaCacheCommon.mod.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/cache-in-memory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createInMemoryCache(): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemoryCache")().asInstanceOf[Cache]
  @scala.inline
  def createInMemoryCache(options: InMemoryCacheOptions): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemoryCache")(options.asInstanceOf[js.Any]).asInstanceOf[Cache]
  
  trait InMemoryCacheOptions extends StObject {
    
    /**
      * If keys and values should be serialized using `JSON.stringify`.
      */
    val serializable: js.UndefOr[Boolean] = js.undefined
  }
  object InMemoryCacheOptions {
    
    @scala.inline
    def apply(): InMemoryCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InMemoryCacheOptions]
    }
    
    @scala.inline
    implicit class InMemoryCacheOptionsMutableBuilder[Self <: InMemoryCacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSerializable(value: Boolean): Self = StObject.set(x, "serializable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializableUndefined: Self = StObject.set(x, "serializable", js.undefined)
    }
  }
}
