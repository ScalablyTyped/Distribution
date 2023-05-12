package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlywheelRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel.
    */
  var FlywheelArn: ComprehendFlywheelArn
}
object DescribeFlywheelRequest {
  
  inline def apply(FlywheelArn: ComprehendFlywheelArn): DescribeFlywheelRequest = {
    val __obj = js.Dynamic.literal(FlywheelArn = FlywheelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlywheelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFlywheelRequest] (val x: Self) extends AnyVal {
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
  }
}
