package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMaintenanceStartTimeInput extends StObject {
  
  /**
    * The day of the month start maintenance on a gateway. Valid values range from Sunday to Saturday.
    */
  var DayOfMonth: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.DayOfMonth] = js.undefined
  
  /**
    * The day of the week to start maintenance on a gateway.
    */
  var DayOfWeek: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.DayOfWeek] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the gateway, used to specify its maintenance start time.
    */
  var GatewayArn: typings.awsSdk.clientsBackupgatewayMod.GatewayArn
  
  /**
    * The hour of the day to start maintenance on a gateway.
    */
  var HourOfDay: typings.awsSdk.clientsBackupgatewayMod.HourOfDay
  
  /**
    * The minute of the hour to start maintenance on a gateway.
    */
  var MinuteOfHour: typings.awsSdk.clientsBackupgatewayMod.MinuteOfHour
}
object PutMaintenanceStartTimeInput {
  
  inline def apply(GatewayArn: GatewayArn, HourOfDay: HourOfDay, MinuteOfHour: MinuteOfHour): PutMaintenanceStartTimeInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any], HourOfDay = HourOfDay.asInstanceOf[js.Any], MinuteOfHour = MinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMaintenanceStartTimeInput]
  }
  
  extension [Self <: PutMaintenanceStartTimeInput](x: Self) {
    
    inline def setDayOfMonth(value: DayOfMonth): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "DayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: DayOfWeek): Self = StObject.set(x, "DayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "DayOfWeek", js.undefined)
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setHourOfDay(value: HourOfDay): Self = StObject.set(x, "HourOfDay", value.asInstanceOf[js.Any])
    
    inline def setMinuteOfHour(value: MinuteOfHour): Self = StObject.set(x, "MinuteOfHour", value.asInstanceOf[js.Any])
  }
}
