package typings.algoliaCacheCommon

import typings.algoliaCacheCommon.anon.ReadonlyPromiseany
import typings.algoliaCacheCommon.anon.ReadonlyPromisevoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/cache-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createFallbackableCache(options: FallbackableCacheOptions): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("createFallbackableCache")(options.asInstanceOf[js.Any]).asInstanceOf[Cache]
  
  @scala.inline
  def createNullCache(): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullCache")().asInstanceOf[Cache]
  
  @js.native
  trait Cache extends StObject {
    
    /**
      * Clears the cache.
      */
    def clear(): ReadonlyPromisevoid = js.native
    
    def delete(key: String): ReadonlyPromisevoid = js.native
    /**
      * Deletes the given `key`.
      */
    def delete(key: js.Object): ReadonlyPromisevoid = js.native
    
    def get[TValue](key: String, defaultValue: js.Function0[js.Promise[TValue]]): js.Promise[TValue] = js.native
    def get[TValue](key: String, defaultValue: js.Function0[js.Promise[TValue]], events: CacheEvents[TValue]): js.Promise[TValue] = js.native
    /**
      * Gets the value of the given `key`.
      */
    def get[TValue](key: js.Object, defaultValue: js.Function0[js.Promise[TValue]]): js.Promise[TValue] = js.native
    def get[TValue](key: js.Object, defaultValue: js.Function0[js.Promise[TValue]], events: CacheEvents[TValue]): js.Promise[TValue] = js.native
    
    def set[TValue](key: String, value: TValue): js.Promise[TValue] = js.native
    /**
      * Sets the given value with the given `key`.
      */
    def set[TValue](key: js.Object, value: TValue): js.Promise[TValue] = js.native
  }
  
  trait CacheEvents[TValue] extends StObject {
    
    /**
      * The callback when the given `key` is missing from the cache.
      */
    def miss(value: TValue): ReadonlyPromiseany
  }
  object CacheEvents {
    
    @scala.inline
    def apply[TValue](miss: TValue => ReadonlyPromiseany): CacheEvents[TValue] = {
      val __obj = js.Dynamic.literal(miss = js.Any.fromFunction1(miss))
      __obj.asInstanceOf[CacheEvents[TValue]]
    }
    
    @scala.inline
    implicit class CacheEventsMutableBuilder[Self <: CacheEvents[?], TValue] (val x: Self & CacheEvents[TValue]) extends AnyVal {
      
      @scala.inline
      def setMiss(value: TValue => ReadonlyPromiseany): Self = StObject.set(x, "miss", js.Any.fromFunction1(value))
    }
  }
  
  trait FallbackableCacheOptions extends StObject {
    
    /**
      * List of caches order by priority.
      */
    val caches: js.Array[Cache]
  }
  object FallbackableCacheOptions {
    
    @scala.inline
    def apply(caches: js.Array[Cache]): FallbackableCacheOptions = {
      val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any])
      __obj.asInstanceOf[FallbackableCacheOptions]
    }
    
    @scala.inline
    implicit class FallbackableCacheOptionsMutableBuilder[Self <: FallbackableCacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaches(value: js.Array[Cache]): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachesVarargs(value: Cache*): Self = StObject.set(x, "caches", js.Array(value :_*))
    }
  }
}
