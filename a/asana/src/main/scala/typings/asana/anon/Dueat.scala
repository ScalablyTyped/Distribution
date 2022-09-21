package typings.asana.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dueat extends StObject {
  
  var due_at: String | Null
  
  var due_on: String | Null
  
  var start_on: String | Null
}
object Dueat {
  
  inline def apply(): Dueat = {
    val __obj = js.Dynamic.literal(due_at = null, due_on = null, start_on = null)
    __obj.asInstanceOf[Dueat]
  }
  
  extension [Self <: Dueat](x: Self) {
    
    inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
    
    inline def setDue_atNull: Self = StObject.set(x, "due_at", null)
    
    inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    inline def setDue_onNull: Self = StObject.set(x, "due_on", null)
    
    inline def setStart_on(value: String): Self = StObject.set(x, "start_on", value.asInstanceOf[js.Any])
    
    inline def setStart_onNull: Self = StObject.set(x, "start_on", null)
  }
}
