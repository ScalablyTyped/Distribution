package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowEditRange extends js.Object {
  @JSName("Excel.AllowEditRange_typekey")
  var ExcelDotAllowEditRange_typekey: AllowEditRange = js.native
  @JSName("Range")
  var Range_Original: Range = js.native
  var Title: String = js.native
  @JSName("Users")
  val Users_Original: UserAccessList = js.native
  def ChangePassword(Password: String): Unit = js.native
  def Delete(): Unit = js.native
  def Range(Address: String): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range = js.native
  def Unprotect(): Unit = js.native
  def Unprotect(Password: String): Unit = js.native
  def Users(Index: String): UserAccess = js.native
  def Users(Index: Double): UserAccess = js.native
}

