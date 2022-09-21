package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCredential extends StObject {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var device_id: js.UndefOr[String] = js.undefined
  
  var device_name: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var last_used: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var user_id: js.UndefOr[String] = js.undefined
}
object DeviceCredential {
  
  inline def apply(): DeviceCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceCredential]
  }
  
  extension [Self <: DeviceCredential](x: Self) {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    inline def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
    
    inline def setDevice_name(value: String): Self = StObject.set(x, "device_name", value.asInstanceOf[js.Any])
    
    inline def setDevice_nameUndefined: Self = StObject.set(x, "device_name", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast_used(value: String): Self = StObject.set(x, "last_used", value.asInstanceOf[js.Any])
    
    inline def setLast_usedUndefined: Self = StObject.set(x, "last_used", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
