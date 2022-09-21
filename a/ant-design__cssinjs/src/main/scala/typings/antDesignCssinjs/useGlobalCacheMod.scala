package typings.antDesignCssinjs

import typings.antDesignCssinjs.cacheMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useGlobalCacheMod {
  
  @JSImport("@ant-design/cssinjs/es/hooks/useGlobalCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[CacheType](prefix: String, keyPath: js.Array[KeyType], cacheFn: js.Function0[CacheType]): CacheType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefix.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any], cacheFn.asInstanceOf[js.Any])).asInstanceOf[CacheType]
  inline def default[CacheType](
    prefix: String,
    keyPath: js.Array[KeyType],
    cacheFn: js.Function0[CacheType],
    onCacheRemove: js.Function2[/* cache */ CacheType, /* fromHMR */ Boolean, Unit]
  ): CacheType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefix.asInstanceOf[js.Any], keyPath.asInstanceOf[js.Any], cacheFn.asInstanceOf[js.Any], onCacheRemove.asInstanceOf[js.Any])).asInstanceOf[CacheType]
}
