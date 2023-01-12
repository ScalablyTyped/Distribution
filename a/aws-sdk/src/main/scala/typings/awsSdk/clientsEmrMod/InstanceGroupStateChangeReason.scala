package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupStateChangeReason extends StObject {
  
  /**
    * The programmable code for the state change reason.
    */
  var Code: js.UndefOr[InstanceGroupStateChangeReasonCode] = js.undefined
  
  /**
    * The status change reason description.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object InstanceGroupStateChangeReason {
  
  inline def apply(): InstanceGroupStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupStateChangeReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupStateChangeReason] (val x: Self) extends AnyVal {
    
    inline def setCode(value: InstanceGroupStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
