package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phonetics extends js.Object {
  var Alignment: Double = js.native
  val Application: typings.activexDashExcel.Excel.Application = js.native
  var CharacterType: Double = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Font: typings.activexDashExcel.Excel.Font = js.native
  val Length: Double = js.native
  val Parent: js.Any = js.native
  val Start: Double = js.native
  var Text: String = js.native
  var Visible: Boolean = js.native
  def apply(Index: Double): Phonetic = js.native
  def Add(Start: Double, Length: Double, Text: String): Unit = js.native
  def Delete(): Unit = js.native
  def Item(Index: Double): Phonetic = js.native
  def _Default(Index: Double): js.Any = js.native
}

