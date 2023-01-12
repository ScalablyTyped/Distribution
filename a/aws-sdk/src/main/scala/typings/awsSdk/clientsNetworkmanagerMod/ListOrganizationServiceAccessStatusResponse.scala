package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationServiceAccessStatusResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * Displays the status of an Amazon Web Services Organization.
    */
  var OrganizationStatus: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.OrganizationStatus] = js.undefined
}
object ListOrganizationServiceAccessStatusResponse {
  
  inline def apply(): ListOrganizationServiceAccessStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationServiceAccessStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOrganizationServiceAccessStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationStatus(value: OrganizationStatus): Self = StObject.set(x, "OrganizationStatus", value.asInstanceOf[js.Any])
    
    inline def setOrganizationStatusUndefined: Self = StObject.set(x, "OrganizationStatus", js.undefined)
  }
}
