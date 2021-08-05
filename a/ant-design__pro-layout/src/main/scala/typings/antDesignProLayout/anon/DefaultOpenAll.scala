package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOpenAll extends StObject {
  
  var defaultOpenAll: js.UndefOr[Boolean] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[Boolean] = js.undefined
}
object DefaultOpenAll {
  
  inline def apply(): DefaultOpenAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOpenAll]
  }
  
  extension [Self <: DefaultOpenAll](x: Self) {
    
    inline def setDefaultOpenAll(value: Boolean): Self = StObject.set(x, "defaultOpenAll", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenAllUndefined: Self = StObject.set(x, "defaultOpenAll", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLocale(value: Boolean): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
