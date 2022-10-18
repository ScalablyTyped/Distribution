package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIntegrationAssociationsRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The integration type.
    */
  var IntegrationType: js.UndefOr[typings.awsSdk.clientsConnectMod.IntegrationType] = js.undefined
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListIntegrationAssociationsRequest {
  
  inline def apply(InstanceId: InstanceId): ListIntegrationAssociationsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIntegrationAssociationsRequest]
  }
  
  extension [Self <: ListIntegrationAssociationsRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setIntegrationType(value: IntegrationType): Self = StObject.set(x, "IntegrationType", value.asInstanceOf[js.Any])
    
    inline def setIntegrationTypeUndefined: Self = StObject.set(x, "IntegrationType", js.undefined)
    
    inline def setMaxResults(value: MaxResult100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
