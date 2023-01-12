package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduleGroupInput extends StObject {
  
  /**
    *  Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a client token, EventBridge Scheduler uses a randomly generated token for the request to ensure idempotency. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsSchedulerMod.ClientToken] = js.undefined
  
  /**
    * The name of the schedule group that you are creating.
    */
  var Name: ScheduleGroupName
  
  /**
    * The list of tags to associate with the schedule group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateScheduleGroupInput {
  
  inline def apply(Name: ScheduleGroupName): CreateScheduleGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduleGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateScheduleGroupInput] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setName(value: ScheduleGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
