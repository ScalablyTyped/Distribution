package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchPermission extends StObject {
  
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[PermissionGroup] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an organization.
    */
  var OrganizationArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an organizational unit (OU).
    */
  var OrganizationalUnitArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account ID. Constraints: Up to 10 000 account IDs can be specified in a single request.
    */
  var UserId: js.UndefOr[String] = js.undefined
}
object LaunchPermission {
  
  inline def apply(): LaunchPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchPermission] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: PermissionGroup): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setOrganizationArn(value: String): Self = StObject.set(x, "OrganizationArn", value.asInstanceOf[js.Any])
    
    inline def setOrganizationArnUndefined: Self = StObject.set(x, "OrganizationArn", js.undefined)
    
    inline def setOrganizationalUnitArn(value: String): Self = StObject.set(x, "OrganizationalUnitArn", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitArnUndefined: Self = StObject.set(x, "OrganizationalUnitArn", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
