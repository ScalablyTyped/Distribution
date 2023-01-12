package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVPCAssociationAuthorizationsRequest extends StObject {
  
  /**
    * The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
    */
  var HostedZoneId: ResourceId
  
  /**
    *  Optional: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to return. If you don't specify a value for MaxResults, Route 53 returns up to 50 VPCs per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53Mod.MaxResults] = js.undefined
  
  /**
    *  Optional: If a response includes a NextToken element, there are more VPCs that can be associated with the specified hosted zone. To get the next page of results, submit another request, and include the value of NextToken from the response in the nexttoken parameter in another ListVPCAssociationAuthorizations request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListVPCAssociationAuthorizationsRequest {
  
  inline def apply(HostedZoneId: ResourceId): ListVPCAssociationAuthorizationsRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVPCAssociationAuthorizationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVPCAssociationAuthorizationsRequest] (val x: Self) extends AnyVal {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
