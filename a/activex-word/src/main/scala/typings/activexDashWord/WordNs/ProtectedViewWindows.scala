package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ProtectedViewWindows")
@js.native
class ProtectedViewWindows protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var `Word.ProtectedViewWindows_typekey`: ProtectedViewWindows = js.native
  def Item(Index: js.Any): ProtectedViewWindow = js.native
  def Open(FileName: js.Any): ProtectedViewWindow = js.native
  def Open(FileName: js.Any, AddToRecentFiles: js.Any): ProtectedViewWindow = js.native
  def Open(FileName: js.Any, AddToRecentFiles: js.Any, PasswordDocument: js.Any): ProtectedViewWindow = js.native
  def Open(FileName: js.Any, AddToRecentFiles: js.Any, PasswordDocument: js.Any, Visible: js.Any): ProtectedViewWindow = js.native
  def Open(
    FileName: js.Any,
    AddToRecentFiles: js.Any,
    PasswordDocument: js.Any,
    Visible: js.Any,
    OpenAndRepair: js.Any
  ): ProtectedViewWindow = js.native
}

