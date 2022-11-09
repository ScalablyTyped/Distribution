package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointsRequest extends StObject {
  
  /**
    * If your initial ListVpcEndpoints operation returns a nextToken, you can include the returned nextToken in subsequent ListVpcEndpoints operations, which returns results in the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object ListVpcEndpointsRequest {
  
  inline def apply(): ListVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVpcEndpointsRequest]
  }
  
  extension [Self <: ListVpcEndpointsRequest](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
