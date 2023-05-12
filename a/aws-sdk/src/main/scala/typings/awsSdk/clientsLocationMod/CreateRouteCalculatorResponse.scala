package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRouteCalculatorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the route calculator resource. Use the ARN when you specify a resource across all Amazon Web Services.   Format example: arn:aws:geo:region:account-id:route-calculator/ExampleCalculator   
    */
  var CalculatorArn: Arn
  
  /**
    * The name of the route calculator resource.    For example, ExampleRouteCalculator.  
    */
  var CalculatorName: ResourceName
  
  /**
    * The timestamp when the route calculator resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.    For example, 2020–07-2T12:15:20.000Z+01:00   
    */
  var CreateTime: js.Date
}
object CreateRouteCalculatorResponse {
  
  inline def apply(CalculatorArn: Arn, CalculatorName: ResourceName, CreateTime: js.Date): CreateRouteCalculatorResponse = {
    val __obj = js.Dynamic.literal(CalculatorArn = CalculatorArn.asInstanceOf[js.Any], CalculatorName = CalculatorName.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteCalculatorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRouteCalculatorResponse] (val x: Self) extends AnyVal {
    
    inline def setCalculatorArn(value: Arn): Self = StObject.set(x, "CalculatorArn", value.asInstanceOf[js.Any])
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
  }
}
