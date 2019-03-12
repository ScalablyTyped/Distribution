package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NavigationFolders")
@js.native
class NavigationFolders protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.NavigationFolders_typekey`: NavigationFolders = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Folder: Folder): NavigationFolder = js.native
  def Item(Index: js.Any): NavigationFolder = js.native
  def Remove(RemovableFolder: NavigationFolder): scala.Unit = js.native
}

