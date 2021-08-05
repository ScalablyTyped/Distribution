package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Conflicts")
@js.native
/* private */ class Conflicts ()
  extends StObject
     with typings.activexOutlook.Outlook.Conflicts {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetFirst(): typings.activexOutlook.Outlook.Conflict = js.native
  
  /* CompleteClass */
  override def GetLast(): typings.activexOutlook.Outlook.Conflict = js.native
  
  /* CompleteClass */
  override def GetNext(): typings.activexOutlook.Outlook.Conflict = js.native
  
  /* CompleteClass */
  override def GetPrevious(): typings.activexOutlook.Outlook.Conflict = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Conflict = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Conflicts_typekey")
  var OutlookDotConflicts_typekey: typings.activexOutlook.Outlook.Conflicts = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
