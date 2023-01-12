package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProtectionGroupRequest extends StObject {
  
  /**
    * The name of the protection group. You use this to identify the protection group in lists and to manage the protection group, for example to update, delete, or describe it. 
    */
  var ProtectionGroupId: typings.awsSdk.clientsShieldMod.ProtectionGroupId
}
object DeleteProtectionGroupRequest {
  
  inline def apply(ProtectionGroupId: ProtectionGroupId): DeleteProtectionGroupRequest = {
    val __obj = js.Dynamic.literal(ProtectionGroupId = ProtectionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectionGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProtectionGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setProtectionGroupId(value: ProtectionGroupId): Self = StObject.set(x, "ProtectionGroupId", value.asInstanceOf[js.Any])
  }
}
