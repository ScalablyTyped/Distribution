package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScheduleRequest extends StObject {
  
  /**
    * The date or dates and time or times when the jobs are to be run. For more information, see Cron expressions in the Glue DataBrew Developer Guide.
    */
  var CronExpression: typings.awsSdk.clientsDatabrewMod.CronExpression
  
  /**
    * The name or names of one or more jobs to be run for this schedule.
    */
  var JobNames: js.UndefOr[JobNameList] = js.undefined
  
  /**
    * The name of the schedule to update.
    */
  var Name: ScheduleName
}
object UpdateScheduleRequest {
  
  inline def apply(CronExpression: CronExpression, Name: ScheduleName): UpdateScheduleRequest = {
    val __obj = js.Dynamic.literal(CronExpression = CronExpression.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScheduleRequest]
  }
  
  extension [Self <: UpdateScheduleRequest](x: Self) {
    
    inline def setCronExpression(value: CronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    inline def setJobNames(value: JobNameList): Self = StObject.set(x, "JobNames", value.asInstanceOf[js.Any])
    
    inline def setJobNamesUndefined: Self = StObject.set(x, "JobNames", js.undefined)
    
    inline def setJobNamesVarargs(value: JobName*): Self = StObject.set(x, "JobNames", js.Array(value*))
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
