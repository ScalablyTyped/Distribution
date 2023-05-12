package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEngagementRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the engagement.
    */
  var EngagementId: SsmContactsArn
  
  /**
    * The reason that you're stopping the engagement.
    */
  var Reason: js.UndefOr[StopReason] = js.undefined
}
object StopEngagementRequest {
  
  inline def apply(EngagementId: SsmContactsArn): StopEngagementRequest = {
    val __obj = js.Dynamic.literal(EngagementId = EngagementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEngagementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopEngagementRequest] (val x: Self) extends AnyVal {
    
    inline def setEngagementId(value: SsmContactsArn): Self = StObject.set(x, "EngagementId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: StopReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
