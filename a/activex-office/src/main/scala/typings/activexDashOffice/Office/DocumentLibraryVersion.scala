package typings.activexDashOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DocumentLibraryVersion")
@js.native
class DocumentLibraryVersion protected () extends js.Object {
  val Application: js.Any = js.native
  val Comments: String = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val Modified: VarDate = js.native
  val ModifiedBy: String = js.native
  var `Office.DocumentLibraryVersion_typekey`: DocumentLibraryVersion = js.native
  val Parent: js.Any = js.native
  def Delete(): Unit = js.native
  def Open(): js.Any = js.native
  def Restore(): js.Any = js.native
}

