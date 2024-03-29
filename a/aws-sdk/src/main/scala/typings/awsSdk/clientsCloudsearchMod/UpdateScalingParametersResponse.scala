package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScalingParametersResponse extends StObject {
  
  var ScalingParameters: ScalingParametersStatus
}
object UpdateScalingParametersResponse {
  
  inline def apply(ScalingParameters: ScalingParametersStatus): UpdateScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingParametersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateScalingParametersResponse] (val x: Self) extends AnyVal {
    
    inline def setScalingParameters(value: ScalingParametersStatus): Self = StObject.set(x, "ScalingParameters", value.asInstanceOf[js.Any])
  }
}
