package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduleInput extends StObject {
  
  /**
    *  Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsSchedulerMod.ClientToken] = js.undefined
  
  /**
    * The name of the schedule group associated with this schedule. If you omit this, the default schedule group is used.
    */
  var GroupName: js.UndefOr[ScheduleGroupName] = js.undefined
  
  /**
    * The name of the schedule to delete.
    */
  var Name: typings.awsSdk.clientsSchedulerMod.Name
}
object DeleteScheduleInput {
  
  inline def apply(Name: Name): DeleteScheduleInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteScheduleInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setGroupName(value: ScheduleGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
