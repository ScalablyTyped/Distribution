package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsDecisionDetail extends StObject {
  
  /**
    * Specifies whether the simulated operation is allowed by the Organizations service control policies that impact the simulated user's account.
    */
  var AllowedByOrganizations: js.UndefOr[booleanType] = js.undefined
}
object OrganizationsDecisionDetail {
  
  inline def apply(): OrganizationsDecisionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationsDecisionDetail]
  }
  
  extension [Self <: OrganizationsDecisionDetail](x: Self) {
    
    inline def setAllowedByOrganizations(value: booleanType): Self = StObject.set(x, "AllowedByOrganizations", value.asInstanceOf[js.Any])
    
    inline def setAllowedByOrganizationsUndefined: Self = StObject.set(x, "AllowedByOrganizations", js.undefined)
  }
}
