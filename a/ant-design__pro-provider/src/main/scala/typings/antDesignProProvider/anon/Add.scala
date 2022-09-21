package typings.antDesignProProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: String
  
  var cancel: String
  
  var delete: String
  
  var save: String
}
object Add {
  
  inline def apply(add: String, cancel: String, delete: String, save: String): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  extension [Self <: Add](x: Self) {
    
    inline def setAdd(value: String): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
  }
}
