package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Conflicts")
@js.native
class Conflicts protected ()
  extends typings.activexOutlook.Outlook.Conflicts {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.Conflicts_typekey")
  override var OutlookDotConflicts_typekey: typings.activexOutlook.Outlook.Conflicts = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
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
}

