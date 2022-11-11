package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScheduleOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schedule.
    */
  var Arn: js.UndefOr[ScheduleArn] = js.undefined
  
  /**
    * The time at which the schedule was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the schedule.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsSchedulerMod.Description] = js.undefined
  
  /**
    * The date, in UTC, before which the schedule can invoke its target. Depending on the schedule's recurrence expression, invocations might stop on, or before, the EndDate you specify. EventBridge Scheduler ignores EndDate for one-time schedules.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
    */
  var FlexibleTimeWindow: js.UndefOr[typings.awsSdk.clientsSchedulerMod.FlexibleTimeWindow] = js.undefined
  
  /**
    * The name of the schedule group associated with this schedule.
    */
  var GroupName: js.UndefOr[ScheduleGroupName] = js.undefined
  
  /**
    * The ARN for a customer managed KMS Key that is be used to encrypt and decrypt your data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsSchedulerMod.KmsKeyArn] = js.undefined
  
  /**
    * The time at which the schedule was last modified.
    */
  var LastModificationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the schedule.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsSchedulerMod.Name] = js.undefined
  
  /**
    *  The expression that defines when the schedule runs. The following formats are supported.     at expression - at(yyyy-mm-ddThh:mm:ss)     rate expression - rate(unit value)     cron expression - cron(fields)     You can use at expressions to create one-time schedules that invoke a target once, at the time and in the time zone, that you specify. You can use rate and cron expressions to create recurring schedules. Rate-based schedules are useful when you want to invoke a target at regular intervals, such as every 15 minutes or every five days. Cron-based schedules are useful when you want to invoke a target periodically at a specific time, such as at 8:00 am (UTC+0) every 1st day of the month.   A cron expression consists of six fields separated by white spaces: (minutes hours day_of_month month day_of_week year).   A rate expression consists of a value as a positive integer, and a unit with the following options: minute | minutes | hour | hours | day | days   For more information and examples, see Schedule types on EventBridge Scheduler in the EventBridge Scheduler User Guide. 
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.clientsSchedulerMod.ScheduleExpression] = js.undefined
  
  /**
    * The timezone in which the scheduling expression is evaluated.
    */
  var ScheduleExpressionTimezone: js.UndefOr[typings.awsSdk.clientsSchedulerMod.ScheduleExpressionTimezone] = js.undefined
  
  /**
    * The date, in UTC, after which the schedule can begin invoking its target. Depending on the schedule's recurrence expression, invocations might occur on, or after, the StartDate you specify. EventBridge Scheduler ignores StartDate for one-time schedules.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the schedule is enabled or disabled.
    */
  var State: js.UndefOr[ScheduleState] = js.undefined
  
  /**
    * The schedule target.
    */
  var Target: js.UndefOr[typings.awsSdk.clientsSchedulerMod.Target] = js.undefined
}
object GetScheduleOutput {
  
  inline def apply(): GetScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetScheduleOutput]
  }
  
  extension [Self <: GetScheduleOutput](x: Self) {
    
    inline def setArn(value: ScheduleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setFlexibleTimeWindow(value: FlexibleTimeWindow): Self = StObject.set(x, "FlexibleTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setFlexibleTimeWindowUndefined: Self = StObject.set(x, "FlexibleTimeWindow", js.undefined)
    
    inline def setGroupName(value: ScheduleGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setLastModificationDate(value: js.Date): Self = StObject.set(x, "LastModificationDate", value.asInstanceOf[js.Any])
    
    inline def setLastModificationDateUndefined: Self = StObject.set(x, "LastModificationDate", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionTimezone(value: ScheduleExpressionTimezone): Self = StObject.set(x, "ScheduleExpressionTimezone", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionTimezoneUndefined: Self = StObject.set(x, "ScheduleExpressionTimezone", js.undefined)
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setState(value: ScheduleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
