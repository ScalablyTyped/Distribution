package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationalUnitsForParentResponse extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
  
  /**
    * A list of the OUs in the specified root or parent OU.
    */
  var OrganizationalUnits: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.OrganizationalUnits] = js.undefined
}
object ListOrganizationalUnitsForParentResponse {
  
  inline def apply(): ListOrganizationalUnitsForParentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationalUnitsForParentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOrganizationalUnitsForParentResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationalUnits(value: OrganizationalUnits): Self = StObject.set(x, "OrganizationalUnits", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitsUndefined: Self = StObject.set(x, "OrganizationalUnits", js.undefined)
    
    inline def setOrganizationalUnitsVarargs(value: OrganizationalUnit*): Self = StObject.set(x, "OrganizationalUnits", js.Array(value*))
  }
}
