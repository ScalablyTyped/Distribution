package typings.activexExcel.anon

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends js.Object {
  
  var Cancel: Boolean = js.native
  
  val Sh: Worksheet = js.native
  
  def Target(Address: String): Range = js.native
  def Target(RowIndex: Double): Range = js.native
  def Target(RowIndex: Double, ColumnIndex: Double): Range = js.native
  @JSName("Target")
  val Target_Original: Range = js.native
}
