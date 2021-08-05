package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleUrl extends StObject {
  
  var moduleUrl: js.UndefOr[String] = js.undefined
  
  var styleUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  var styles: js.UndefOr[js.Array[String]] = js.undefined
}
object ModuleUrl {
  
  inline def apply(): ModuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleUrl]
  }
  
  extension [Self <: ModuleUrl](x: Self) {
    
    inline def setModuleUrl(value: String): Self = StObject.set(x, "moduleUrl", value.asInstanceOf[js.Any])
    
    inline def setModuleUrlUndefined: Self = StObject.set(x, "moduleUrl", js.undefined)
    
    inline def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlsUndefined: Self = StObject.set(x, "styleUrls", js.undefined)
    
    inline def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
