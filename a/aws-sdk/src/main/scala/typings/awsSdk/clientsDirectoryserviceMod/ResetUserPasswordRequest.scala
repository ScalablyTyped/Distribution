package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetUserPasswordRequest extends StObject {
  
  /**
    * Identifier of the Managed Microsoft AD or Simple AD directory in which the user resides.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The new password that will be reset.
    */
  var NewPassword: UserPassword
  
  /**
    * The user name of the user whose password will be reset.
    */
  var UserName: CustomerUserName
}
object ResetUserPasswordRequest {
  
  inline def apply(DirectoryId: DirectoryId, NewPassword: UserPassword, UserName: CustomerUserName): ResetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], NewPassword = NewPassword.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetUserPasswordRequest]
  }
  
  extension [Self <: ResetUserPasswordRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setNewPassword(value: UserPassword): Self = StObject.set(x, "NewPassword", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: CustomerUserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
