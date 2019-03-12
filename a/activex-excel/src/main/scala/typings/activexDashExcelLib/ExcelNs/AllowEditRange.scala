package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.AllowEditRange")
@js.native
class AllowEditRange protected () extends js.Object {
  var `Excel.AllowEditRange_typekey`: AllowEditRange = js.native
  @JSName("Range")
  var Range_Original: Range = js.native
  var Title: java.lang.String = js.native
  @JSName("Users")
  val Users_Original: UserAccessList = js.native
  def ChangePassword(Password: java.lang.String): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Range(Address: java.lang.String): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def Range(RowIndex: scala.Double, ColumnIndex: scala.Double): activexDashExcelLib.ExcelNs.Range = js.native
  def Unprotect(): scala.Unit = js.native
  def Unprotect(Password: java.lang.String): scala.Unit = js.native
  def Users(Index: java.lang.String): UserAccess = js.native
  def Users(Index: scala.Double): UserAccess = js.native
}

