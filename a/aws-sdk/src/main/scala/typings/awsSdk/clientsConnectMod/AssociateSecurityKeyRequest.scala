package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSecurityKeyRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * A valid security key in PEM format.
    */
  var Key: PEM
}
object AssociateSecurityKeyRequest {
  
  inline def apply(InstanceId: InstanceId, Key: PEM): AssociateSecurityKeyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSecurityKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateSecurityKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setKey(value: PEM): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
