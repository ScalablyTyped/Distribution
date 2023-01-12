package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProtectionRequest extends StObject {
  
  /**
    * The unique identifier (ID) for the Protection object to be deleted.
    */
  var ProtectionId: typings.awsSdk.clientsShieldMod.ProtectionId
}
object DeleteProtectionRequest {
  
  inline def apply(ProtectionId: ProtectionId): DeleteProtectionRequest = {
    val __obj = js.Dynamic.literal(ProtectionId = ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteProtectionRequest] (val x: Self) extends AnyVal {
    
    inline def setProtectionId(value: ProtectionId): Self = StObject.set(x, "ProtectionId", value.asInstanceOf[js.Any])
  }
}
