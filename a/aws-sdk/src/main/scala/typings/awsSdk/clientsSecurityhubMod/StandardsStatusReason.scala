package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardsStatusReason extends StObject {
  
  /**
    * The reason code that represents the reason for the current status of a standard subscription.
    */
  var StatusReasonCode: typings.awsSdk.clientsSecurityhubMod.StatusReasonCode
}
object StandardsStatusReason {
  
  inline def apply(StatusReasonCode: StatusReasonCode): StandardsStatusReason = {
    val __obj = js.Dynamic.literal(StatusReasonCode = StatusReasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsStatusReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardsStatusReason] (val x: Self) extends AnyVal {
    
    inline def setStatusReasonCode(value: StatusReasonCode): Self = StObject.set(x, "StatusReasonCode", value.asInstanceOf[js.Any])
  }
}
