package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editors extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Editors_typekey")
  var WordDotEditors_typekey: Editors
  def Add(EditorID: js.Any): Editor
  def Item(Index: js.Any): Editor
}

object Editors {
  @scala.inline
  def apply(
    Add: js.Any => Editor,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => Editor,
    Parent: js.Any,
    WordDotEditors_typekey: Editors
  ): Editors = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Editors_typekey")(WordDotEditors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editors]
  }
}

