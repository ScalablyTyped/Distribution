package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFlywheelIterationResponse extends StObject {
  
  /**
    * 
    */
  var FlywheelArn: js.UndefOr[ComprehendFlywheelArn] = js.undefined
  
  /**
    * 
    */
  var FlywheelIterationId: js.UndefOr[typings.awsSdk.clientsComprehendMod.FlywheelIterationId] = js.undefined
}
object StartFlywheelIterationResponse {
  
  inline def apply(): StartFlywheelIterationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFlywheelIterationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartFlywheelIterationResponse] (val x: Self) extends AnyVal {
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setFlywheelArnUndefined: Self = StObject.set(x, "FlywheelArn", js.undefined)
    
    inline def setFlywheelIterationId(value: FlywheelIterationId): Self = StObject.set(x, "FlywheelIterationId", value.asInstanceOf[js.Any])
    
    inline def setFlywheelIterationIdUndefined: Self = StObject.set(x, "FlywheelIterationId", js.undefined)
  }
}
