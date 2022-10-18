package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRouteCalculatorRequest extends StObject {
  
  /**
    * The name of the route calculator resource.
    */
  var CalculatorName: ResourceName
}
object DescribeRouteCalculatorRequest {
  
  inline def apply(CalculatorName: ResourceName): DescribeRouteCalculatorRequest = {
    val __obj = js.Dynamic.literal(CalculatorName = CalculatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRouteCalculatorRequest]
  }
  
  extension [Self <: DescribeRouteCalculatorRequest](x: Self) {
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
  }
}
