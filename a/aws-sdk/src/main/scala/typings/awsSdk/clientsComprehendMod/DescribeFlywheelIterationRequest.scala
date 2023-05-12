package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlywheelIterationRequest extends StObject {
  
  /**
    * 
    */
  var FlywheelArn: ComprehendFlywheelArn
  
  /**
    * 
    */
  var FlywheelIterationId: typings.awsSdk.clientsComprehendMod.FlywheelIterationId
}
object DescribeFlywheelIterationRequest {
  
  inline def apply(FlywheelArn: ComprehendFlywheelArn, FlywheelIterationId: FlywheelIterationId): DescribeFlywheelIterationRequest = {
    val __obj = js.Dynamic.literal(FlywheelArn = FlywheelArn.asInstanceOf[js.Any], FlywheelIterationId = FlywheelIterationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlywheelIterationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFlywheelIterationRequest] (val x: Self) extends AnyVal {
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setFlywheelIterationId(value: FlywheelIterationId): Self = StObject.set(x, "FlywheelIterationId", value.asInstanceOf[js.Any])
  }
}
