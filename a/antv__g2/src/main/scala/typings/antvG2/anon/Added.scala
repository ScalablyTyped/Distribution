package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Added extends StObject {
  
  var added: js.Array[Any]
  
  var removed: js.Array[Any]
  
  var updated: js.Array[Any]
}
object Added {
  
  inline def apply(added: js.Array[Any], removed: js.Array[Any], updated: js.Array[Any]): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  
  extension [Self <: Added](x: Self) {
    
    inline def setAdded(value: js.Array[Any]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: Any*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setRemoved(value: js.Array[Any]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: Any*): Self = StObject.set(x, "removed", js.Array(value*))
    
    inline def setUpdated(value: js.Array[Any]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedVarargs(value: Any*): Self = StObject.set(x, "updated", js.Array(value*))
  }
}
