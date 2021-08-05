package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultMessageId extends StObject {
  
  var defaultMessage: js.UndefOr[String] = js.undefined
  
  var id: String
}
object DefaultMessageId {
  
  inline def apply(id: String): DefaultMessageId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMessageId]
  }
  
  extension [Self <: DefaultMessageId](x: Self) {
    
    inline def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
