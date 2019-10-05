package typings.activexDashOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SharedWorkspaceLink")
@js.native
class SharedWorkspaceLink protected () extends js.Object {
  val Application: js.Any = js.native
  val CreatedBy: String = js.native
  val CreatedDate: VarDate = js.native
  val Creator: Double = js.native
  var Description: String = js.native
  val ModifiedBy: String = js.native
  val ModifiedDate: VarDate = js.native
  var Notes: String = js.native
  var `Office.SharedWorkspaceLink_typekey`: SharedWorkspaceLink = js.native
  val Parent: js.Any = js.native
  var URL: String = js.native
  def Delete(): Unit = js.native
  def Save(): Unit = js.native
}

