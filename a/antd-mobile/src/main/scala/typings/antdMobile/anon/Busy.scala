package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Busy extends StObject {
  
  var default: Description
  
  var busy: Description
  
  var disconnected: Description
  
  var empty: Description
}
object Busy {
  
  inline def apply(busy: Description, default: Description, disconnected: Description, empty: Description): Busy = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Busy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Busy] (val x: Self) extends AnyVal {
    
    inline def setBusy(value: Description): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Description): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDisconnected(value: Description): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: Description): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
  }
}
