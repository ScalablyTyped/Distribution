package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceEventStartTimeRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the event whose date and time you are modifying.
    */
  var InstanceEventId: String
  
  /**
    * The ID of the instance with the scheduled event.
    */
  var InstanceId: typings.awsSdk.clientsEc2Mod.InstanceId
  
  /**
    * The new date and time when the event will take place.
    */
  var NotBefore: js.Date
}
object ModifyInstanceEventStartTimeRequest {
  
  inline def apply(InstanceEventId: String, InstanceId: InstanceId, NotBefore: js.Date): ModifyInstanceEventStartTimeRequest = {
    val __obj = js.Dynamic.literal(InstanceEventId = InstanceEventId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], NotBefore = NotBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceEventStartTimeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyInstanceEventStartTimeRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceEventId(value: String): Self = StObject.set(x, "InstanceEventId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
  }
}
