package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUseCasesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the integration association.
    */
  var IntegrationAssociationId: typings.awsSdk.clientsConnectMod.IntegrationAssociationId
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListUseCasesRequest {
  
  inline def apply(InstanceId: InstanceId, IntegrationAssociationId: IntegrationAssociationId): ListUseCasesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], IntegrationAssociationId = IntegrationAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUseCasesRequest]
  }
  
  extension [Self <: ListUseCasesRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationAssociationId(value: IntegrationAssociationId): Self = StObject.set(x, "IntegrationAssociationId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
