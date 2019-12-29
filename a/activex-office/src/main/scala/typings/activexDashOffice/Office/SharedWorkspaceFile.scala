package typings.activexDashOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceFile")
@js.native
class SharedWorkspaceFile protected () extends js.Object {
  val Application: js.Any = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  val ModifiedBy: String = js.native
  val ModifiedDate: VarDate = js.native
  @JSName("Office.SharedWorkspaceFile_typekey")
  var OfficeDotSharedWorkspaceFile_typekey: SharedWorkspaceFile = js.native
  val Parent: js.Any = js.native
  val URL: String = js.native
  def Delete(): Unit = js.native
}

