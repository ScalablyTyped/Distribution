package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewayInstancesResponse extends StObject {
  
  /**
    * A list of instance summaries.
    */
  var Instances: js.UndefOr[listOfListedGatewayInstance] = js.undefined
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListInstances request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListInstances request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListGatewayInstancesResponse {
  
  inline def apply(): ListGatewayInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewayInstancesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGatewayInstancesResponse] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: listOfListedGatewayInstance): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: ListedGatewayInstance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
