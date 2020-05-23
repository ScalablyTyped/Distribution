package typings.activexExcel.anon

import typings.activexExcel.Excel.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetRange extends js.Object {
  @JSName("Target")
  val Target_Original: Range = js.native
  def Target(Address: String): Range = js.native
  def Target(RowIndex: Double): Range = js.native
  def Target(RowIndex: Double, ColumnIndex: Double): Range = js.native
}

