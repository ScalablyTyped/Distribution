package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Reminders")
@js.native
class Reminders protected ()
  extends StObject
     with typings.activexOutlook.Outlook.Reminders {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Reminder = js.native
  
  /* CompleteClass */
  @JSName("Outlook.Reminders_typekey")
  var OutlookDotReminders_typekey: typings.activexOutlook.Outlook.Reminders = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: js.Any): Unit = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
