package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationFolders")
@js.native
class NavigationFolders protected ()
  extends typings.activexOutlook.Outlook.NavigationFolders {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationFolders_typekey")
  override var OutlookDotNavigationFolders_typekey: typings.activexOutlook.Outlook.NavigationFolders = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def Add(Folder: typings.activexOutlook.Outlook.Folder): typings.activexOutlook.Outlook.NavigationFolder = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexOutlook.Outlook.NavigationFolder = js.native
  /* CompleteClass */
  override def Remove(RemovableFolder: typings.activexOutlook.Outlook.NavigationFolder): Unit = js.native
}

