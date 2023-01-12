package typings.antDesignCssinjs.anon

import typings.antDesignCssinjs.mod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashId extends StObject {
  
  var hashId: js.UndefOr[String] = js.undefined
  
  var layer: js.UndefOr[String] = js.undefined
  
  var path: js.Array[String]
  
  var theme: Theme[Any, Any]
  
  var token: Any
}
object HashId {
  
  inline def apply(path: js.Array[String], theme: Theme[Any, Any], token: Any): HashId = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashId] (val x: Self) extends AnyVal {
    
    inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    inline def setHashIdUndefined: Self = StObject.set(x, "hashId", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setTheme(value: Theme[Any, Any]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
