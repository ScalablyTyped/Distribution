package typings.antDesignProProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clear extends StObject {
  
  var clear: String
  
  var confirm: String
  
  var itemUnit: String
  
  var more: String
}
object Clear {
  
  inline def apply(clear: String, confirm: String, itemUnit: String, more: String): Clear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], itemUnit = itemUnit.asInstanceOf[js.Any], more = more.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clear]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setConfirm(value: String): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setItemUnit(value: String): Self = StObject.set(x, "itemUnit", value.asInstanceOf[js.Any])
    
    inline def setMore(value: String): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
  }
}
