package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingParametersResponse extends StObject {
  
  var ScalingParameters: ScalingParametersStatus
}
object DescribeScalingParametersResponse {
  
  inline def apply(ScalingParameters: ScalingParametersStatus): DescribeScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingParametersResponse]
  }
  
  extension [Self <: DescribeScalingParametersResponse](x: Self) {
    
    inline def setScalingParameters(value: ScalingParametersStatus): Self = StObject.set(x, "ScalingParameters", value.asInstanceOf[js.Any])
  }
}
