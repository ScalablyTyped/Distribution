package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMBLocalGroups extends StObject {
  
  /**
    * A list of Active Directory users and groups that have local Gateway Admin permissions. Acceptable formats include: DOMAIN\User1, user1, DOMAIN\group1, and group1. Gateway Admins can use the Shared Folders Microsoft Management Console snap-in to force-close files that are open and locked.
    */
  var GatewayAdmins: js.UndefOr[UserList] = js.undefined
}
object SMBLocalGroups {
  
  inline def apply(): SMBLocalGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMBLocalGroups]
  }
  
  extension [Self <: SMBLocalGroups](x: Self) {
    
    inline def setGatewayAdmins(value: UserList): Self = StObject.set(x, "GatewayAdmins", value.asInstanceOf[js.Any])
    
    inline def setGatewayAdminsUndefined: Self = StObject.set(x, "GatewayAdmins", js.undefined)
    
    inline def setGatewayAdminsVarargs(value: UserListUser*): Self = StObject.set(x, "GatewayAdmins", js.Array(value*))
  }
}
