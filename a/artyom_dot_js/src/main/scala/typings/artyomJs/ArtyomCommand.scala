package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtyomCommand extends StObject {
  
  var action: js.Function
  
  var description: js.UndefOr[String] = js.undefined
  
  var indexes: js.Array[js.Any]
  
  var smart: js.UndefOr[Boolean] = js.undefined
}
object ArtyomCommand {
  
  inline def apply(action: js.Function, indexes: js.Array[js.Any]): ArtyomCommand = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomCommand]
  }
  
  extension [Self <: ArtyomCommand](x: Self) {
    
    inline def setAction(value: js.Function): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIndexes(value: js.Array[js.Any]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesVarargs(value: js.Any*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    inline def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
    
    inline def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
  }
}
