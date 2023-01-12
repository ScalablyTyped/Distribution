package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotInstanceRequestsResult extends StObject {
  
  /**
    * The token to use to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined
}
object DescribeSpotInstanceRequestsResult {
  
  inline def apply(): DescribeSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotInstanceRequestsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSpotInstanceRequestsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpotInstanceRequests(value: SpotInstanceRequestList): Self = StObject.set(x, "SpotInstanceRequests", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceRequestsUndefined: Self = StObject.set(x, "SpotInstanceRequests", js.undefined)
    
    inline def setSpotInstanceRequestsVarargs(value: SpotInstanceRequest*): Self = StObject.set(x, "SpotInstanceRequests", js.Array(value*))
  }
}
