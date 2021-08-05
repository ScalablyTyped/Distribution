package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlDaysOfWeek
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRecurrenceType
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.RecurrencePattern")
@js.native
/* private */ class RecurrencePattern ()
  extends StObject
     with typings.activexOutlook.Outlook.RecurrencePattern {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var DayOfMonth: Double = js.native
  
  /* CompleteClass */
  var DayOfWeekMask: OlDaysOfWeek = js.native
  
  /* CompleteClass */
  var Duration: Double = js.native
  
  /* CompleteClass */
  var EndTime: VarDate = js.native
  
  /* CompleteClass */
  override val Exceptions: typings.activexOutlook.Outlook.Exceptions = js.native
  
  /* CompleteClass */
  override def GetOccurrence(StartDate: VarDate): typings.activexOutlook.Outlook.AppointmentItem = js.native
  
  /* CompleteClass */
  var Instance: Double = js.native
  
  /* CompleteClass */
  var Interval: Double = js.native
  
  /* CompleteClass */
  var MonthOfYear: Double = js.native
  
  /* CompleteClass */
  var NoEndDate: Boolean = js.native
  
  /* CompleteClass */
  var Occurrences: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.RecurrencePattern_typekey")
  var OutlookDotRecurrencePattern_typekey: typings.activexOutlook.Outlook.RecurrencePattern = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var PatternEndDate: VarDate = js.native
  
  /* CompleteClass */
  var PatternStartDate: VarDate = js.native
  
  /* CompleteClass */
  var RecurrenceType: OlRecurrenceType = js.native
  
  /* CompleteClass */
  var Regenerate: Boolean = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var StartTime: VarDate = js.native
}
