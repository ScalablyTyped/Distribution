package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrganizationConformancePackDetailedStatusResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of OrganizationConformancePackDetailedStatus objects. 
    */
  var OrganizationConformancePackDetailedStatuses: js.UndefOr[
    typings.awsSdk.clientsConfigserviceMod.OrganizationConformancePackDetailedStatuses
  ] = js.undefined
}
object GetOrganizationConformancePackDetailedStatusResponse {
  
  inline def apply(): GetOrganizationConformancePackDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrganizationConformancePackDetailedStatusResponse]
  }
  
  extension [Self <: GetOrganizationConformancePackDetailedStatusResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationConformancePackDetailedStatuses(value: OrganizationConformancePackDetailedStatuses): Self = StObject.set(x, "OrganizationConformancePackDetailedStatuses", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConformancePackDetailedStatusesUndefined: Self = StObject.set(x, "OrganizationConformancePackDetailedStatuses", js.undefined)
    
    inline def setOrganizationConformancePackDetailedStatusesVarargs(value: OrganizationConformancePackDetailedStatus*): Self = StObject.set(x, "OrganizationConformancePackDetailedStatuses", js.Array(value*))
  }
}
