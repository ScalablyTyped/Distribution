package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowEditRanges extends js.Object {
  val Count: scala.Double = js.native
  def apply(Index: java.lang.String): AllowEditRange = js.native
  def apply(Index: scala.Double): AllowEditRange = js.native
  def Add(Title: java.lang.String, Range: Range): AllowEditRange = js.native
  def Add(Title: java.lang.String, Range: Range, Password: java.lang.String): AllowEditRange = js.native
  def Item(Index: java.lang.String): AllowEditRange = js.native
  def Item(Index: scala.Double): AllowEditRange = js.native
  def _Default(Index: java.lang.String): AllowEditRange = js.native
  def _Default(Index: scala.Double): AllowEditRange = js.native
}

