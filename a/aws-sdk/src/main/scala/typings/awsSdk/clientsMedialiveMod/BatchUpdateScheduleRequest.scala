package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateScheduleRequest extends StObject {
  
  /**
    * Id of the channel whose schedule is being updated.
    */
  var ChannelId: string
  
  /**
    * Schedule actions to create in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateRequest] = js.undefined
  
  /**
    * Schedule actions to delete from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteRequest] = js.undefined
}
object BatchUpdateScheduleRequest {
  
  inline def apply(ChannelId: string): BatchUpdateScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    inline def setCreates(value: BatchScheduleActionCreateRequest): Self = StObject.set(x, "Creates", value.asInstanceOf[js.Any])
    
    inline def setCreatesUndefined: Self = StObject.set(x, "Creates", js.undefined)
    
    inline def setDeletes(value: BatchScheduleActionDeleteRequest): Self = StObject.set(x, "Deletes", value.asInstanceOf[js.Any])
    
    inline def setDeletesUndefined: Self = StObject.set(x, "Deletes", js.undefined)
  }
}
