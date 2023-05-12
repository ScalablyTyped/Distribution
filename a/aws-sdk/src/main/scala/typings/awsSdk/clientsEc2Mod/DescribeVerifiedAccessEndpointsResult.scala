package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVerifiedAccessEndpointsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the Verified Access endpoint.
    */
  var VerifiedAccessEndpoints: js.UndefOr[VerifiedAccessEndpointList] = js.undefined
}
object DescribeVerifiedAccessEndpointsResult {
  
  inline def apply(): DescribeVerifiedAccessEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVerifiedAccessEndpointsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVerifiedAccessEndpointsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVerifiedAccessEndpoints(value: VerifiedAccessEndpointList): Self = StObject.set(x, "VerifiedAccessEndpoints", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessEndpointsUndefined: Self = StObject.set(x, "VerifiedAccessEndpoints", js.undefined)
    
    inline def setVerifiedAccessEndpointsVarargs(value: VerifiedAccessEndpoint*): Self = StObject.set(x, "VerifiedAccessEndpoints", js.Array(value*))
  }
}
