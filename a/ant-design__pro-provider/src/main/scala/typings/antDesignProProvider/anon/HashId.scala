package typings.antDesignProProvider.anon

import typings.antDesignCssinjs.mod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashId extends StObject {
  
  var hashId: String
  
  var theme: Theme[Any, Any]
  
  var token: Blue
}
object HashId {
  
  inline def apply(hashId: String, theme: Theme[Any, Any], token: Blue): HashId = {
    val __obj = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashId]
  }
  
  extension [Self <: HashId](x: Self) {
    
    inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Theme[Any, Any]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setToken(value: Blue): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
