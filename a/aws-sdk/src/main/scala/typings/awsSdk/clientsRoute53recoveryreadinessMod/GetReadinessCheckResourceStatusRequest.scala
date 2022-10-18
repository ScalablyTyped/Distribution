package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadinessCheckResourceStatusRequest extends StObject {
  
  /**
    * The number of objects that you want to return with this call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.MaxResults] = js.undefined
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Name of a readiness check.
    */
  var ReadinessCheckName: string
  
  /**
    * The resource identifier, which is the Amazon Resource Name (ARN) or the identifier generated for the resource by Application Recovery Controller (for example, for a DNS target resource).
    */
  var ResourceIdentifier: string
}
object GetReadinessCheckResourceStatusRequest {
  
  inline def apply(ReadinessCheckName: string, ResourceIdentifier: string): GetReadinessCheckResourceStatusRequest = {
    val __obj = js.Dynamic.literal(ReadinessCheckName = ReadinessCheckName.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReadinessCheckResourceStatusRequest]
  }
  
  extension [Self <: GetReadinessCheckResourceStatusRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReadinessCheckName(value: string): Self = StObject.set(x, "ReadinessCheckName", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifier(value: string): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
  }
}
