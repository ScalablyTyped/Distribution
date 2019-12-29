package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoTextEntry")
@js.native
class AutoTextEntry protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  val StyleName: String = js.native
  var Value: String = js.native
  @JSName("Word.AutoTextEntry_typekey")
  var WordDotAutoTextEntry_typekey: AutoTextEntry = js.native
  def Delete(): Unit = js.native
  def Insert(Where: Range): Range = js.native
  def Insert(Where: Range, RichText: js.Any): Range = js.native
}

