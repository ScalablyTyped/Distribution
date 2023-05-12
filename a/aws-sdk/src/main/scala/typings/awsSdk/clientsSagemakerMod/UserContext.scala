package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserContext extends StObject {
  
  /**
    * The domain associated with the user.
    */
  var DomainId: js.UndefOr[String] = js.undefined
  
  /**
    * The IAM Identity details associated with the user. These details are associated with model package groups, model packages, and project entities only.
    */
  var IamIdentity: js.UndefOr[typings.awsSdk.clientsSagemakerMod.IamIdentity] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user's profile.
    */
  var UserProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user's profile.
    */
  var UserProfileName: js.UndefOr[String] = js.undefined
}
object UserContext {
  
  inline def apply(): UserContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserContext] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: String): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setIamIdentity(value: IamIdentity): Self = StObject.set(x, "IamIdentity", value.asInstanceOf[js.Any])
    
    inline def setIamIdentityUndefined: Self = StObject.set(x, "IamIdentity", js.undefined)
    
    inline def setUserProfileArn(value: String): Self = StObject.set(x, "UserProfileArn", value.asInstanceOf[js.Any])
    
    inline def setUserProfileArnUndefined: Self = StObject.set(x, "UserProfileArn", js.undefined)
    
    inline def setUserProfileName(value: String): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}
