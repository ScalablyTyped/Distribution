package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationFolder")
@js.native
class NavigationFolder protected ()
  extends typings.activexOutlook.Outlook.NavigationFolder {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val DisplayName: String = js.native
  /* CompleteClass */
  override val Folder: typings.activexOutlook.Outlook.Folder = js.native
  /* CompleteClass */
  override val IsRemovable: Boolean = js.native
  /* CompleteClass */
  override var IsSelected: Boolean = js.native
  /* CompleteClass */
  override var IsSideBySide: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.NavigationFolder_typekey")
  override var OutlookDotNavigationFolder_typekey: typings.activexOutlook.Outlook.NavigationFolder = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Position: Double = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

