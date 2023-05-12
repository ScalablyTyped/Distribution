package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlywheelResponse extends StObject {
  
  /**
    * The flywheel properties.
    */
  var FlywheelProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.FlywheelProperties] = js.undefined
}
object UpdateFlywheelResponse {
  
  inline def apply(): UpdateFlywheelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlywheelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFlywheelResponse] (val x: Self) extends AnyVal {
    
    inline def setFlywheelProperties(value: FlywheelProperties): Self = StObject.set(x, "FlywheelProperties", value.asInstanceOf[js.Any])
    
    inline def setFlywheelPropertiesUndefined: Self = StObject.set(x, "FlywheelProperties", js.undefined)
  }
}
