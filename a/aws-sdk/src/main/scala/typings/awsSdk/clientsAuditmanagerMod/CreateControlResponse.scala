package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateControlResponse extends StObject {
  
  /**
    *  The new control that the CreateControl API returned. 
    */
  var control: js.UndefOr[Control] = js.undefined
}
object CreateControlResponse {
  
  inline def apply(): CreateControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateControlResponse]
  }
  
  extension [Self <: CreateControlResponse](x: Self) {
    
    inline def setControl(value: Control): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
  }
}
