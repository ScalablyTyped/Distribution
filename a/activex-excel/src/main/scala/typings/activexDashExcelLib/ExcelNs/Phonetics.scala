package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phonetics extends js.Object {
  var Alignment: scala.Double = js.native
  val Application: Application = js.native
  var CharacterType: scala.Double = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Font: Font = js.native
  val Length: scala.Double = js.native
  val Parent: js.Any = js.native
  val Start: scala.Double = js.native
  var Text: java.lang.String = js.native
  var Visible: scala.Boolean = js.native
  def apply(Index: scala.Double): Phonetic = js.native
  def Add(Start: scala.Double, Length: scala.Double, Text: java.lang.String): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Item(Index: scala.Double): Phonetic = js.native
  def _Default(Index: scala.Double): js.Any = js.native
}

