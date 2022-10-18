package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledTriggerProperties extends StObject {
  
  /**
    * Specifies whether a scheduled flow has an incremental data transfer or a complete data transfer for each flow run.
    */
  var DataPullMode: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.DataPullMode] = js.undefined
  
  /**
    * Specifies the date range for the records to import from the connector in the first flow run.
    */
  var FirstExecutionFrom: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the scheduled end time for a scheduled-trigger flow.
    */
  var ScheduleEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The scheduling expression that determines the rate at which the schedule will run, for example rate (5 minutes).
    */
  var ScheduleExpression: typings.awsSdk.clientsCustomerprofilesMod.ScheduleExpression
  
  /**
    * Specifies the optional offset that is added to the time interval for a schedule-triggered flow.
    */
  var ScheduleOffset: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.ScheduleOffset] = js.undefined
  
  /**
    * Specifies the scheduled start time for a scheduled-trigger flow.
    */
  var ScheduleStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the time zone used when referring to the date and time of a scheduled-triggered flow, such as America/New_York.
    */
  var Timezone: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.Timezone] = js.undefined
}
object ScheduledTriggerProperties {
  
  inline def apply(ScheduleExpression: ScheduleExpression): ScheduledTriggerProperties = {
    val __obj = js.Dynamic.literal(ScheduleExpression = ScheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledTriggerProperties]
  }
  
  extension [Self <: ScheduledTriggerProperties](x: Self) {
    
    inline def setDataPullMode(value: DataPullMode): Self = StObject.set(x, "DataPullMode", value.asInstanceOf[js.Any])
    
    inline def setDataPullModeUndefined: Self = StObject.set(x, "DataPullMode", js.undefined)
    
    inline def setFirstExecutionFrom(value: js.Date): Self = StObject.set(x, "FirstExecutionFrom", value.asInstanceOf[js.Any])
    
    inline def setFirstExecutionFromUndefined: Self = StObject.set(x, "FirstExecutionFrom", js.undefined)
    
    inline def setScheduleEndTime(value: js.Date): Self = StObject.set(x, "ScheduleEndTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleEndTimeUndefined: Self = StObject.set(x, "ScheduleEndTime", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleOffset(value: ScheduleOffset): Self = StObject.set(x, "ScheduleOffset", value.asInstanceOf[js.Any])
    
    inline def setScheduleOffsetUndefined: Self = StObject.set(x, "ScheduleOffset", js.undefined)
    
    inline def setScheduleStartTime(value: js.Date): Self = StObject.set(x, "ScheduleStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartTimeUndefined: Self = StObject.set(x, "ScheduleStartTime", js.undefined)
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
