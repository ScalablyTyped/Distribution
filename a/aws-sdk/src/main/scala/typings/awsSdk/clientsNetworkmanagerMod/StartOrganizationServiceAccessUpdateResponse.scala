package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOrganizationServiceAccessUpdateResponse extends StObject {
  
  /**
    * The status of the service access update request for an Amazon Web Services Organization.
    */
  var OrganizationStatus: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.OrganizationStatus] = js.undefined
}
object StartOrganizationServiceAccessUpdateResponse {
  
  inline def apply(): StartOrganizationServiceAccessUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOrganizationServiceAccessUpdateResponse]
  }
  
  extension [Self <: StartOrganizationServiceAccessUpdateResponse](x: Self) {
    
    inline def setOrganizationStatus(value: OrganizationStatus): Self = StObject.set(x, "OrganizationStatus", value.asInstanceOf[js.Any])
    
    inline def setOrganizationStatusUndefined: Self = StObject.set(x, "OrganizationStatus", js.undefined)
  }
}
