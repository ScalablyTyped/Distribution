package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
}
object Role {
  
  inline def apply(): Role = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Role]
  }
  
  extension [Self <: Role](x: Self) {
    
    inline def setMaintainHistory(value: Boolean): Self = StObject.set(x, "maintainHistory", value.asInstanceOf[js.Any])
    
    inline def setMaintainHistoryUndefined: Self = StObject.set(x, "maintainHistory", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
