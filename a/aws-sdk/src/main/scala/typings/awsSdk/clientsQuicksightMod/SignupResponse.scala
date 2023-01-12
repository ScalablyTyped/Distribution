package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignupResponse extends StObject {
  
  /**
    * A Boolean that is TRUE if the Amazon QuickSight uses IAM as an authentication method.
    */
  var IAMUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of your Amazon QuickSight account.
    */
  var accountName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of Active Directory that is being used to authenticate the Amazon QuickSight account. Valid values are SIMPLE_AD, AD_CONNECTOR, and MICROSOFT_AD.
    */
  var directoryType: js.UndefOr[String] = js.undefined
  
  /**
    * The user login name for your Amazon QuickSight account.
    */
  var userLoginName: js.UndefOr[String] = js.undefined
}
object SignupResponse {
  
  inline def apply(): SignupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignupResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setDirectoryType(value: String): Self = StObject.set(x, "directoryType", value.asInstanceOf[js.Any])
    
    inline def setDirectoryTypeUndefined: Self = StObject.set(x, "directoryType", js.undefined)
    
    inline def setIAMUser(value: Boolean): Self = StObject.set(x, "IAMUser", value.asInstanceOf[js.Any])
    
    inline def setIAMUserUndefined: Self = StObject.set(x, "IAMUser", js.undefined)
    
    inline def setUserLoginName(value: String): Self = StObject.set(x, "userLoginName", value.asInstanceOf[js.Any])
    
    inline def setUserLoginNameUndefined: Self = StObject.set(x, "userLoginName", js.undefined)
  }
}
