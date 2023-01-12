package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotFleetRequestsResponse extends StObject {
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the configuration of your Spot Fleet.
    */
  var SpotFleetRequestConfigs: js.UndefOr[SpotFleetRequestConfigSet] = js.undefined
}
object DescribeSpotFleetRequestsResponse {
  
  inline def apply(): DescribeSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotFleetRequestsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSpotFleetRequestsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpotFleetRequestConfigs(value: SpotFleetRequestConfigSet): Self = StObject.set(x, "SpotFleetRequestConfigs", value.asInstanceOf[js.Any])
    
    inline def setSpotFleetRequestConfigsUndefined: Self = StObject.set(x, "SpotFleetRequestConfigs", js.undefined)
    
    inline def setSpotFleetRequestConfigsVarargs(value: SpotFleetRequestConfig*): Self = StObject.set(x, "SpotFleetRequestConfigs", js.Array(value*))
  }
}
