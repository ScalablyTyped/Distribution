package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoCorrectEntries")
@js.native
class AutoCorrectEntries protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.AutoCorrectEntries_typekey")
  var WordDotAutoCorrectEntries_typekey: AutoCorrectEntries = js.native
  def Add(Name: String, Value: String): AutoCorrectEntry = js.native
  def AddRichText(Name: String, Range: Range): AutoCorrectEntry = js.native
  def Item(Index: js.Any): AutoCorrectEntry = js.native
}

