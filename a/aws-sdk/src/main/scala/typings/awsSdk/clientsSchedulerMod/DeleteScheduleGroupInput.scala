package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduleGroupInput extends StObject {
  
  /**
    *  Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsSchedulerMod.ClientToken] = js.undefined
  
  /**
    * The name of the schedule group to delete.
    */
  var Name: ScheduleGroupName
}
object DeleteScheduleGroupInput {
  
  inline def apply(Name: ScheduleGroupName): DeleteScheduleGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduleGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteScheduleGroupInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setName(value: ScheduleGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
