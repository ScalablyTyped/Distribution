package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSHPublicKeyMetadata extends StObject {
  
  /**
    * The unique identifier for the SSH public key.
    */
  var SSHPublicKeyId: publicKeyIdType
  
  /**
    * The status of the SSH public key. Active means that the key can be used for authentication with an CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType
  
  /**
    * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
    */
  var UploadDate: js.Date
  
  /**
    * The name of the IAM user associated with the SSH public key.
    */
  var UserName: userNameType
}
object SSHPublicKeyMetadata {
  
  inline def apply(SSHPublicKeyId: publicKeyIdType, Status: statusType, UploadDate: js.Date, UserName: userNameType): SSHPublicKeyMetadata = {
    val __obj = js.Dynamic.literal(SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UploadDate = UploadDate.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHPublicKeyMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SSHPublicKeyMetadata] (val x: Self) extends AnyVal {
    
    inline def setSSHPublicKeyId(value: publicKeyIdType): Self = StObject.set(x, "SSHPublicKeyId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUploadDate(value: js.Date): Self = StObject.set(x, "UploadDate", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
