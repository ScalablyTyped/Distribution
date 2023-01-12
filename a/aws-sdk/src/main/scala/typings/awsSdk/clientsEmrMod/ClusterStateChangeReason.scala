package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStateChangeReason extends StObject {
  
  /**
    * The programmatic code for the state change reason.
    */
  var Code: js.UndefOr[ClusterStateChangeReasonCode] = js.undefined
  
  /**
    * The descriptive message for the state change reason.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ClusterStateChangeReason {
  
  inline def apply(): ClusterStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStateChangeReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStateChangeReason] (val x: Self) extends AnyVal {
    
    inline def setCode(value: ClusterStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
