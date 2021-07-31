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
  
  @scala.inline
  def apply(): ModuleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleUrl]
  }
  
  @scala.inline
  implicit class ModuleUrlMutableBuilder[Self <: ModuleUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModuleUrl(value: String): Self = StObject.set(x, "moduleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUrlUndefined: Self = StObject.set(x, "moduleUrl", js.undefined)
    
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUrlsUndefined: Self = StObject.set(x, "styleUrls", js.undefined)
    
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
