package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSSHPublicKeyResponse extends StObject {
  
  /**
    * Contains information about the SSH public key.
    */
  var SSHPublicKey: js.UndefOr[typings.awsSdk.clientsIamMod.SSHPublicKey] = js.undefined
}
object UploadSSHPublicKeyResponse {
  
  inline def apply(): UploadSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSSHPublicKeyResponse]
  }
  
  extension [Self <: UploadSSHPublicKeyResponse](x: Self) {
    
    inline def setSSHPublicKey(value: SSHPublicKey): Self = StObject.set(x, "SSHPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSSHPublicKeyUndefined: Self = StObject.set(x, "SSHPublicKey", js.undefined)
  }
}
