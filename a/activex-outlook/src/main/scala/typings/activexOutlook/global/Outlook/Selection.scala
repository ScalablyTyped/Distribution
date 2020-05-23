package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlSelectionContents
import typings.activexOutlook.Outlook.OlSelectionLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Selection")
@js.native
class Selection protected ()
  extends typings.activexOutlook.Outlook.Selection {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Location: OlSelectionLocation = js.native
  /* CompleteClass */
  @JSName("Outlook.Selection_typekey")
  override var OutlookDotSelection_typekey: typings.activexOutlook.Outlook.Selection = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetSelection(SelectionContents: OlSelectionContents): typings.activexOutlook.Outlook.Selection = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): js.Any = js.native
}

