package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlywheelResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the active model version.
    */
  var ActiveModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel.
    */
  var FlywheelArn: js.UndefOr[ComprehendFlywheelArn] = js.undefined
}
object CreateFlywheelResponse {
  
  inline def apply(): CreateFlywheelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFlywheelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFlywheelResponse] (val x: Self) extends AnyVal {
    
    inline def setActiveModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ActiveModelArn", value.asInstanceOf[js.Any])
    
    inline def setActiveModelArnUndefined: Self = StObject.set(x, "ActiveModelArn", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setFlywheelArnUndefined: Self = StObject.set(x, "FlywheelArn", js.undefined)
  }
}
