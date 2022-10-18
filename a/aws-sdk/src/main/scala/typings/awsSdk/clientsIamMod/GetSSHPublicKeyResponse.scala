package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSSHPublicKeyResponse extends StObject {
  
  /**
    * A structure containing details about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[typings.awsSdk.clientsIamMod.SSHPublicKey] = js.undefined
}
object GetSSHPublicKeyResponse {
  
  inline def apply(): GetSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSSHPublicKeyResponse]
  }
  
  extension [Self <: GetSSHPublicKeyResponse](x: Self) {
    
    inline def setSSHPublicKey(value: SSHPublicKey): Self = StObject.set(x, "SSHPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSSHPublicKeyUndefined: Self = StObject.set(x, "SSHPublicKey", js.undefined)
  }
}
