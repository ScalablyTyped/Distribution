package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.Range
import typings.activexDashExcel.ExcelNs.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ShTarget extends js.Object {
  val Sh: Worksheet = js.native
  @JSName("Target")
  val Target_Original: Range = js.native
  def Target(Address: String): Range = js.native
  def Target(RowIndex: Double): Range = js.native
  def Target(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

