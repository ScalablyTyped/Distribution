package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PtrUpdateStatus extends StObject {
  
  /**
    * The reason for the PTR record update.
    */
  var Reason: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the PTR record update.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the PTR record update.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object PtrUpdateStatus {
  
  inline def apply(): PtrUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PtrUpdateStatus]
  }
  
  extension [Self <: PtrUpdateStatus](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
