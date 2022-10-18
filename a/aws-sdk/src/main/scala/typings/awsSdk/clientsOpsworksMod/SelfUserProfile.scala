package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfUserProfile extends StObject {
  
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
  
  /**
    * The user's name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.undefined
  
  /**
    * The user's SSH user name.
    */
  var SshUsername: js.UndefOr[String] = js.undefined
}
object SelfUserProfile {
  
  inline def apply(): SelfUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfUserProfile]
  }
  
  extension [Self <: SelfUserProfile](x: Self) {
    
    inline def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    inline def setIamUserArnUndefined: Self = StObject.set(x, "IamUserArn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSshPublicKey(value: String): Self = StObject.set(x, "SshPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyUndefined: Self = StObject.set(x, "SshPublicKey", js.undefined)
    
    inline def setSshUsername(value: String): Self = StObject.set(x, "SshUsername", value.asInstanceOf[js.Any])
    
    inline def setSshUsernameUndefined: Self = StObject.set(x, "SshUsername", js.undefined)
  }
}
