package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateScheduleResponse extends StObject {
  
  /**
    * Schedule actions created in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.undefined
  
  /**
    * Schedule actions deleted from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.undefined
}
object BatchUpdateScheduleResponse {
  
  inline def apply(): BatchUpdateScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateScheduleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateScheduleResponse] (val x: Self) extends AnyVal {
    
    inline def setCreates(value: BatchScheduleActionCreateResult): Self = StObject.set(x, "Creates", value.asInstanceOf[js.Any])
    
    inline def setCreatesUndefined: Self = StObject.set(x, "Creates", js.undefined)
    
    inline def setDeletes(value: BatchScheduleActionDeleteResult): Self = StObject.set(x, "Deletes", value.asInstanceOf[js.Any])
    
    inline def setDeletesUndefined: Self = StObject.set(x, "Deletes", js.undefined)
  }
}
