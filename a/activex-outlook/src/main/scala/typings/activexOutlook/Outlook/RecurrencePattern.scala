package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurrencePattern extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var DayOfMonth: Double = js.native
  
  var DayOfWeekMask: OlDaysOfWeek = js.native
  
  var Duration: Double = js.native
  
  var EndTime: VarDate = js.native
  
  val Exceptions: typings.activexOutlook.Outlook.Exceptions = js.native
  
  def GetOccurrence(StartDate: VarDate): AppointmentItem = js.native
  
  var Instance: Double = js.native
  
  var Interval: Double = js.native
  
  var MonthOfYear: Double = js.native
  
  var NoEndDate: Boolean = js.native
  
  var Occurrences: Double = js.native
  
  @JSName("Outlook.RecurrencePattern_typekey")
  var OutlookDotRecurrencePattern_typekey: RecurrencePattern = js.native
  
  val Parent: js.Any = js.native
  
  var PatternEndDate: VarDate = js.native
  
  var PatternStartDate: VarDate = js.native
  
  var RecurrenceType: OlRecurrenceType = js.native
  
  var Regenerate: Boolean = js.native
  
  val Session: NameSpace = js.native
  
  var StartTime: VarDate = js.native
}
object RecurrencePattern {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    DayOfMonth: Double,
    DayOfWeekMask: OlDaysOfWeek,
    Duration: Double,
    EndTime: VarDate,
    Exceptions: Exceptions,
    GetOccurrence: VarDate => AppointmentItem,
    Instance: Double,
    Interval: Double,
    MonthOfYear: Double,
    NoEndDate: Boolean,
    Occurrences: Double,
    OutlookDotRecurrencePattern_typekey: RecurrencePattern,
    Parent: js.Any,
    PatternEndDate: VarDate,
    PatternStartDate: VarDate,
    RecurrenceType: OlRecurrenceType,
    Regenerate: Boolean,
    Session: NameSpace,
    StartTime: VarDate
  ): RecurrencePattern = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DayOfMonth = DayOfMonth.asInstanceOf[js.Any], DayOfWeekMask = DayOfWeekMask.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], Exceptions = Exceptions.asInstanceOf[js.Any], GetOccurrence = js.Any.fromFunction1(GetOccurrence), Instance = Instance.asInstanceOf[js.Any], Interval = Interval.asInstanceOf[js.Any], MonthOfYear = MonthOfYear.asInstanceOf[js.Any], NoEndDate = NoEndDate.asInstanceOf[js.Any], Occurrences = Occurrences.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PatternEndDate = PatternEndDate.asInstanceOf[js.Any], PatternStartDate = PatternStartDate.asInstanceOf[js.Any], RecurrenceType = RecurrenceType.asInstanceOf[js.Any], Regenerate = Regenerate.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RecurrencePattern_typekey")(OutlookDotRecurrencePattern_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrencePattern]
  }
  
  @scala.inline
  implicit class RecurrencePatternMutableBuilder[Self <: RecurrencePattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfMonth(value: Double): Self = StObject.set(x, "DayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekMask(value: OlDaysOfWeek): Self = StObject.set(x, "DayOfWeekMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: VarDate): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptions(value: Exceptions): Self = StObject.set(x, "Exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOccurrence(value: VarDate => AppointmentItem): Self = StObject.set(x, "GetOccurrence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstance(value: Double): Self = StObject.set(x, "Instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthOfYear(value: Double): Self = StObject.set(x, "MonthOfYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEndDate(value: Boolean): Self = StObject.set(x, "NoEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrences(value: Double): Self = StObject.set(x, "Occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotRecurrencePattern_typekey(value: RecurrencePattern): Self = StObject.set(x, "Outlook.RecurrencePattern_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternEndDate(value: VarDate): Self = StObject.set(x, "PatternEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternStartDate(value: VarDate): Self = StObject.set(x, "PatternStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceType(value: OlRecurrenceType): Self = StObject.set(x, "RecurrenceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegenerate(value: Boolean): Self = StObject.set(x, "Regenerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: VarDate): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
