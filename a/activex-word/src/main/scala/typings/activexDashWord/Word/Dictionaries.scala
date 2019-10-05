package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Dictionaries")
@js.native
class Dictionaries protected () extends js.Object {
  var ActiveCustomDictionary: Dictionary = js.native
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Maximum: Double = js.native
  val Parent: js.Any = js.native
  var `Word.Dictionaries_typekey`: Dictionaries = js.native
  def Add(FileName: String): Dictionary = js.native
  def ClearAll(): Unit = js.native
  def Item(Index: js.Any): Dictionary = js.native
}

