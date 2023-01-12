package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingFormat extends StObject {
  
  /**
    * 
    */
  var json: js.UndefOr[JsonFormat] = js.undefined
  
  /**
    * 
    */
  var text: js.UndefOr[TextFormat] = js.undefined
}
object LoggingFormat {
  
  inline def apply(): LoggingFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggingFormat] (val x: Self) extends AnyVal {
    
    inline def setJson(value: JsonFormat): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setJsonVarargs(value: JsonFormatRef*): Self = StObject.set(x, "json", js.Array(value*))
    
    inline def setText(value: TextFormat): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
