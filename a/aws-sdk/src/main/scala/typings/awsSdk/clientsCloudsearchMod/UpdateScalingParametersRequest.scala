package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScalingParametersRequest extends StObject {
  
  var DomainName: typings.awsSdk.clientsCloudsearchMod.DomainName
  
  var ScalingParameters: typings.awsSdk.clientsCloudsearchMod.ScalingParameters
}
object UpdateScalingParametersRequest {
  
  inline def apply(DomainName: DomainName, ScalingParameters: ScalingParameters): UpdateScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScalingParametersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateScalingParametersRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setScalingParameters(value: ScalingParameters): Self = StObject.set(x, "ScalingParameters", value.asInstanceOf[js.Any])
  }
}
