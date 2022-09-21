package typings.antDesignCssinjs

import typings.antDesignCssinjs.interfaceMod.DerivativeFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeCacheMod {
  
  @JSImport("@ant-design/cssinjs/es/theme/ThemeCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/cssinjs/es/theme/ThemeCache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ThemeCache {
    
    /* private */ /* CompleteClass */
    override val cache: Any = js.native
    
    /* private */ /* CompleteClass */
    var cacheCallTimes: Any = js.native
    
    /* CompleteClass */
    override def delete(derivativeOption: DerivativeOptions): js.UndefOr[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]] = js.native
    
    /* private */ /* CompleteClass */
    var deleteByPath: Any = js.native
    
    /* CompleteClass */
    override def get(derivativeOption: DerivativeOptions): js.UndefOr[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]] = js.native
    
    /* CompleteClass */
    override def has(derivativeOption: DerivativeOptions): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var internalGet: Any = js.native
    
    /* private */ /* CompleteClass */
    var keys: Any = js.native
    
    /* CompleteClass */
    override def set(
      derivativeOption: DerivativeOptions,
      value: typings.antDesignCssinjs.themeThemeMod.default[Any, Any]
    ): Unit = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/cssinjs/es/theme/ThemeCache", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/cssinjs/es/theme/ThemeCache", "default.MAX_CACHE_OFFSET")
    @js.native
    def MAX_CACHE_OFFSET: Double = js.native
    inline def MAX_CACHE_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_CACHE_OFFSET")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/cssinjs/es/theme/ThemeCache", "default.MAX_CACHE_SIZE")
    @js.native
    def MAX_CACHE_SIZE: Double = js.native
    inline def MAX_CACHE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_CACHE_SIZE")(x.asInstanceOf[js.Any])
  }
  
  inline def sameDerivativeOption(left: DerivativeOptions, right: DerivativeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sameDerivativeOption")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type DerivativeOptions = js.Array[DerivativeFunc[Any, Any]]
  
  trait ThemeCache extends StObject {
    
    /* private */ val cache: Any
    
    /* private */ var cacheCallTimes: Any
    
    def delete(derivativeOption: DerivativeOptions): js.UndefOr[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]]
    
    /* private */ var deleteByPath: Any
    
    def get(derivativeOption: DerivativeOptions): js.UndefOr[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]]
    
    def has(derivativeOption: DerivativeOptions): Boolean
    
    /* private */ var internalGet: Any
    
    /* private */ var keys: Any
    
    def set(
      derivativeOption: DerivativeOptions,
      value: typings.antDesignCssinjs.themeThemeMod.default[Any, Any]
    ): Unit
    
    def size(): Double
  }
  object ThemeCache {
    
    inline def apply(
      cache: Any,
      cacheCallTimes: Any,
      delete: DerivativeOptions => js.UndefOr[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]],
      deleteByPath: Any,
      get: DerivativeOptions => js.UndefOr[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]],
      has: DerivativeOptions => Boolean,
      internalGet: Any,
      keys: Any,
      set: (DerivativeOptions, typings.antDesignCssinjs.themeThemeMod.default[Any, Any]) => Unit,
      size: () => Double
    ): ThemeCache = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], cacheCallTimes = cacheCallTimes.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), deleteByPath = deleteByPath.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), internalGet = internalGet.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[ThemeCache]
    }
    
    extension [Self <: ThemeCache](x: Self) {
      
      inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheCallTimes(value: Any): Self = StObject.set(x, "cacheCallTimes", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: DerivativeOptions => js.UndefOr[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setDeleteByPath(value: Any): Self = StObject.set(x, "deleteByPath", value.asInstanceOf[js.Any])
      
      inline def setGet(value: DerivativeOptions => js.UndefOr[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: DerivativeOptions => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setInternalGet(value: Any): Self = StObject.set(x, "internalGet", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (DerivativeOptions, typings.antDesignCssinjs.themeThemeMod.default[Any, Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
}
