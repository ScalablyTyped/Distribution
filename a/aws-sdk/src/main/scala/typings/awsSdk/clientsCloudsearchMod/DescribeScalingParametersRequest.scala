package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingParametersRequest extends StObject {
  
  var DomainName: typings.awsSdk.clientsCloudsearchMod.DomainName
}
object DescribeScalingParametersRequest {
  
  inline def apply(DomainName: DomainName): DescribeScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingParametersRequest]
  }
  
  extension [Self <: DescribeScalingParametersRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
