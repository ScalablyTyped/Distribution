package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOrganizationalUnitRequest extends StObject {
  
  /**
    * The new name that you want to assign to the OU. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[OrganizationalUnitName] = js.undefined
  
  /**
    * The unique identifier (ID) of the OU that you want to rename. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that contains the OU). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
    */
  var OrganizationalUnitId: typings.awsSdk.clientsOrganizationsMod.OrganizationalUnitId
}
object UpdateOrganizationalUnitRequest {
  
  inline def apply(OrganizationalUnitId: OrganizationalUnitId): UpdateOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(OrganizationalUnitId = OrganizationalUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOrganizationalUnitRequest]
  }
  
  extension [Self <: UpdateOrganizationalUnitRequest](x: Self) {
    
    inline def setName(value: OrganizationalUnitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOrganizationalUnitId(value: OrganizationalUnitId): Self = StObject.set(x, "OrganizationalUnitId", value.asInstanceOf[js.Any])
  }
}
