package typings.antDesignProProvider.anon

import typings.antDesignProProvider.esTypingLayoutTokenMod.DeepPartial
import typings.antDesignProProvider.esUseStyleMod.ProAliasToken
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoClearCache extends StObject {
  
  var autoClearCache: js.UndefOr[Boolean] = js.undefined
  
  var children: ReactNode
  
  var needDeps: js.UndefOr[Boolean] = js.undefined
  
  var token: js.UndefOr[DeepPartial[ProAliasToken]] = js.undefined
}
object AutoClearCache {
  
  inline def apply(): AutoClearCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoClearCache]
  }
  
  extension [Self <: AutoClearCache](x: Self) {
    
    inline def setAutoClearCache(value: Boolean): Self = StObject.set(x, "autoClearCache", value.asInstanceOf[js.Any])
    
    inline def setAutoClearCacheUndefined: Self = StObject.set(x, "autoClearCache", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setNeedDeps(value: Boolean): Self = StObject.set(x, "needDeps", value.asInstanceOf[js.Any])
    
    inline def setNeedDepsUndefined: Self = StObject.set(x, "needDeps", js.undefined)
    
    inline def setToken(value: DeepPartial[ProAliasToken]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
