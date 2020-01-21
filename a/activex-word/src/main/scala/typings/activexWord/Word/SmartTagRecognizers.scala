package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.SmartTagRecognizers")
@js.native
class SmartTagRecognizers protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.SmartTagRecognizers_typekey")
  var WordDotSmartTagRecognizers_typekey: SmartTagRecognizers = js.native
  def Item(Index: js.Any): SmartTagRecognizer = js.native
  def ReloadRecognizers(): Unit = js.native
}

