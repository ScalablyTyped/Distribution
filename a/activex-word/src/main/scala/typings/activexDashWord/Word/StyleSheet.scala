package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.StyleSheet")
@js.native
class StyleSheet protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  val FullName: String = js.native
  val Index: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  var Title: String = js.native
  var Type: WdStyleSheetLinkType = js.native
  @JSName("Word.StyleSheet_typekey")
  var WordDotStyleSheet_typekey: StyleSheet = js.native
  def Delete(): Unit = js.native
  def Move(Precedence: WdStyleSheetPrecedence): Unit = js.native
}

