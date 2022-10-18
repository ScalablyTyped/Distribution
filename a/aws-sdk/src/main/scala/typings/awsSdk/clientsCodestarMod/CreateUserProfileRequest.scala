package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserProfileRequest extends StObject {
  
  /**
    * The name that will be displayed as the friendly name for the user in AWS CodeStar. 
    */
  var displayName: UserProfileDisplayName
  
  /**
    * The email address that will be displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: Email
  
  /**
    * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn
}
object CreateUserProfileRequest {
  
  inline def apply(displayName: UserProfileDisplayName, emailAddress: Email, userArn: UserArn): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
  
  extension [Self <: CreateUserProfileRequest](x: Self) {
    
    inline def setDisplayName(value: UserProfileDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: Email): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKey(value: SshPublicKey): Self = StObject.set(x, "sshPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyUndefined: Self = StObject.set(x, "sshPublicKey", js.undefined)
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
