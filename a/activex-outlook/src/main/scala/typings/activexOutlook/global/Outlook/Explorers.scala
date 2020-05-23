package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlFolderDisplayMode
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Explorers")
@js.native
class Explorers protected ()
  extends typings.activexOutlook.Outlook.Explorers {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.Explorers_typekey")
  override var OutlookDotExplorers_typekey: typings.activexOutlook.Outlook.Explorers = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Folder: js.Any, DisplayMode: OlFolderDisplayMode): typings.activexOutlook.Outlook.Explorer = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.Explorer = js.native
}

