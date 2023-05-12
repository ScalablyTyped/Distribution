package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurrenceSettings extends StObject {
  
  /**
    * Information about on-call rotations that recur daily.
    */
  var DailySettings: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.DailySettings] = js.undefined
  
  /**
    * Information about on-call rotations that recur monthly.
    */
  var MonthlySettings: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.MonthlySettings] = js.undefined
  
  /**
    * The number of contacts, or shift team members designated to be on call concurrently during a shift. For example, in an on-call schedule containing ten contacts, a value of 2 designates that two of them are on call at any given time.
    */
  var NumberOfOnCalls: typings.awsSdk.clientsSsmcontactsMod.NumberOfOnCalls
  
  /**
    * The number of days, weeks, or months a single rotation lasts.
    */
  var RecurrenceMultiplier: typings.awsSdk.clientsSsmcontactsMod.RecurrenceMultiplier
  
  /**
    * Information about the days of the week included in on-call rotation coverage.
    */
  var ShiftCoverages: js.UndefOr[ShiftCoveragesMap] = js.undefined
  
  /**
    * Information about on-call rotations that recur weekly.
    */
  var WeeklySettings: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.WeeklySettings] = js.undefined
}
object RecurrenceSettings {
  
  inline def apply(NumberOfOnCalls: NumberOfOnCalls, RecurrenceMultiplier: RecurrenceMultiplier): RecurrenceSettings = {
    val __obj = js.Dynamic.literal(NumberOfOnCalls = NumberOfOnCalls.asInstanceOf[js.Any], RecurrenceMultiplier = RecurrenceMultiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecurrenceSettings] (val x: Self) extends AnyVal {
    
    inline def setDailySettings(value: DailySettings): Self = StObject.set(x, "DailySettings", value.asInstanceOf[js.Any])
    
    inline def setDailySettingsUndefined: Self = StObject.set(x, "DailySettings", js.undefined)
    
    inline def setDailySettingsVarargs(value: HandOffTime*): Self = StObject.set(x, "DailySettings", js.Array(value*))
    
    inline def setMonthlySettings(value: MonthlySettings): Self = StObject.set(x, "MonthlySettings", value.asInstanceOf[js.Any])
    
    inline def setMonthlySettingsUndefined: Self = StObject.set(x, "MonthlySettings", js.undefined)
    
    inline def setMonthlySettingsVarargs(value: MonthlySetting*): Self = StObject.set(x, "MonthlySettings", js.Array(value*))
    
    inline def setNumberOfOnCalls(value: NumberOfOnCalls): Self = StObject.set(x, "NumberOfOnCalls", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceMultiplier(value: RecurrenceMultiplier): Self = StObject.set(x, "RecurrenceMultiplier", value.asInstanceOf[js.Any])
    
    inline def setShiftCoverages(value: ShiftCoveragesMap): Self = StObject.set(x, "ShiftCoverages", value.asInstanceOf[js.Any])
    
    inline def setShiftCoveragesUndefined: Self = StObject.set(x, "ShiftCoverages", js.undefined)
    
    inline def setWeeklySettings(value: WeeklySettings): Self = StObject.set(x, "WeeklySettings", value.asInstanceOf[js.Any])
    
    inline def setWeeklySettingsUndefined: Self = StObject.set(x, "WeeklySettings", js.undefined)
    
    inline def setWeeklySettingsVarargs(value: WeeklySetting*): Self = StObject.set(x, "WeeklySettings", js.Array(value*))
  }
}
