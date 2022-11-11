package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleGroupSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schedule group.
    */
  var Arn: js.UndefOr[ScheduleGroupArn] = js.undefined
  
  /**
    * The time at which the schedule group was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the schedule group was last modified.
    */
  var LastModificationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the schedule group.
    */
  var Name: js.UndefOr[ScheduleGroupName] = js.undefined
  
  /**
    * Specifies the state of the schedule group.
    */
  var State: js.UndefOr[ScheduleGroupState] = js.undefined
}
object ScheduleGroupSummary {
  
  inline def apply(): ScheduleGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleGroupSummary]
  }
  
  extension [Self <: ScheduleGroupSummary](x: Self) {
    
    inline def setArn(value: ScheduleGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setLastModificationDate(value: js.Date): Self = StObject.set(x, "LastModificationDate", value.asInstanceOf[js.Any])
    
    inline def setLastModificationDateUndefined: Self = StObject.set(x, "LastModificationDate", js.undefined)
    
    inline def setName(value: ScheduleGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: ScheduleGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
