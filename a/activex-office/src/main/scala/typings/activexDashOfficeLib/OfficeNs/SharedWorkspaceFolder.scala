package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceFolder")
@js.native
class SharedWorkspaceFolder protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  val FolderName: java.lang.String = js.native
  var `Office.SharedWorkspaceFolder_typekey`: SharedWorkspaceFolder = js.native
  val Parent: js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Delete(DeleteEventIfFolderContainsFiles: scala.Boolean): scala.Unit = js.native
}

