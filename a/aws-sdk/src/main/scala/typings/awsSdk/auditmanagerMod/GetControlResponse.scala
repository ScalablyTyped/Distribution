package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetControlResponse extends StObject {
  
  /**
    *  The name of the control that the GetControl API returned. 
    */
  var control: js.UndefOr[Control] = js.undefined
}
object GetControlResponse {
  
  inline def apply(): GetControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetControlResponse]
  }
  
  extension [Self <: GetControlResponse](x: Self) {
    
    inline def setControl(value: Control): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
  }
}
