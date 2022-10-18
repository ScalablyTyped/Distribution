package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableSsoRequest extends StObject {
  
  /**
    * The identifier of the directory for which to disable single-sign on.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The password of an alternate account to use to disable single-sign on. This is only used for AD Connector directories. For more information, see the UserName parameter.
    */
  var Password: js.UndefOr[ConnectPassword] = js.undefined
  
  /**
    * The username of an alternate account to use to disable single-sign on. This is only used for AD Connector directories. This account must have privileges to remove a service principal name. If the AD Connector service account does not have privileges to remove a service principal name, you can specify an alternate account with the UserName and Password parameters. These credentials are only used to disable single sign-on and are not stored by the service. The AD Connector service account is not changed.
    */
  var UserName: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.UserName] = js.undefined
}
object DisableSsoRequest {
  
  inline def apply(DirectoryId: DirectoryId): DisableSsoRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableSsoRequest]
  }
  
  extension [Self <: DisableSsoRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: ConnectPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
