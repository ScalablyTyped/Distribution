package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRouteCalculatorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated route calculator resource. Used to specify a resource across AWS.   Format example: arn:aws:geo:region:account-id:route- calculator/ExampleCalculator   
    */
  var CalculatorArn: Arn
  
  /**
    * The name of the updated route calculator resource.
    */
  var CalculatorName: ResourceName
  
  /**
    * The timestamp for when the route calculator was last updated in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object UpdateRouteCalculatorResponse {
  
  inline def apply(CalculatorArn: Arn, CalculatorName: ResourceName, UpdateTime: js.Date): UpdateRouteCalculatorResponse = {
    val __obj = js.Dynamic.literal(CalculatorArn = CalculatorArn.asInstanceOf[js.Any], CalculatorName = CalculatorName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRouteCalculatorResponse]
  }
  
  extension [Self <: UpdateRouteCalculatorResponse](x: Self) {
    
    inline def setCalculatorArn(value: Arn): Self = StObject.set(x, "CalculatorArn", value.asInstanceOf[js.Any])
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
