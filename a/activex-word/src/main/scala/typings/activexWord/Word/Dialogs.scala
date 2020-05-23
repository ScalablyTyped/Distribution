package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dialogs extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Dialogs_typekey")
  var WordDotDialogs_typekey: Dialogs
  def Item(Index: WdWordDialog): Dialog
}

object Dialogs {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdWordDialog => Dialog,
    Parent: js.Any,
    WordDotDialogs_typekey: Dialogs
  ): Dialogs = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Dialogs_typekey")(WordDotDialogs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialogs]
  }
}

