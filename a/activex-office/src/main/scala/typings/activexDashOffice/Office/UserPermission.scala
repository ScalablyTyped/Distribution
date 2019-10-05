package typings.activexDashOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.UserPermission")
@js.native
class UserPermission protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var ExpirationDate: VarDate = js.native
  var `Office.UserPermission_typekey`: UserPermission = js.native
  val Parent: js.Any = js.native
  var Permission: Double = js.native
  val UserId: String = js.native
  def Remove(): Unit = js.native
}

