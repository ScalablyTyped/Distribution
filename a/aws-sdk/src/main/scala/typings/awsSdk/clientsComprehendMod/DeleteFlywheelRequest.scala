package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFlywheelRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel to delete.
    */
  var FlywheelArn: ComprehendFlywheelArn
}
object DeleteFlywheelRequest {
  
  inline def apply(FlywheelArn: ComprehendFlywheelArn): DeleteFlywheelRequest = {
    val __obj = js.Dynamic.literal(FlywheelArn = FlywheelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlywheelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFlywheelRequest] (val x: Self) extends AnyVal {
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
  }
}
