package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateControlResponse extends StObject {
  
  /**
    *  The name of the updated control set that the UpdateControl API returned. 
    */
  var control: js.UndefOr[Control] = js.undefined
}
object UpdateControlResponse {
  
  inline def apply(): UpdateControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateControlResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateControlResponse] (val x: Self) extends AnyVal {
    
    inline def setControl(value: Control): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
  }
}
