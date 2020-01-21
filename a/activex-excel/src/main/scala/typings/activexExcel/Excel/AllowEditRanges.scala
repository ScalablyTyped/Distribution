package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowEditRanges extends js.Object {
  val Count: Double = js.native
  def apply(Index: String): AllowEditRange = js.native
  def apply(Index: Double): AllowEditRange = js.native
  def Add(Title: String, Range: Range): AllowEditRange = js.native
  def Add(Title: String, Range: Range, Password: String): AllowEditRange = js.native
  def Item(Index: String): AllowEditRange = js.native
  def Item(Index: Double): AllowEditRange = js.native
  def _Default(Index: String): AllowEditRange = js.native
  def _Default(Index: Double): AllowEditRange = js.native
}

