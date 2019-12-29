package typings.activexDashOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationFolder")
@js.native
class NavigationFolder protected () extends js.Object {
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val DisplayName: String = js.native
  val Folder: typings.activexDashOutlook.Outlook.Folder = js.native
  val IsRemovable: Boolean = js.native
  var IsSelected: Boolean = js.native
  var IsSideBySide: Boolean = js.native
  @JSName("Outlook.NavigationFolder_typekey")
  var OutlookDotNavigationFolder_typekey: NavigationFolder = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Session: NameSpace = js.native
}

