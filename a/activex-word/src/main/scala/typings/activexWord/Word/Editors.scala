package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Editors")
@js.native
class Editors protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Editors_typekey")
  var WordDotEditors_typekey: Editors = js.native
  def Add(EditorID: js.Any): Editor = js.native
  def Item(Index: js.Any): Editor = js.native
}

