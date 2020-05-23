package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCaptions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.AutoCaptions_typekey")
  var WordDotAutoCaptions_typekey: AutoCaptions
  def CancelAutoInsert(): Unit
  def Item(Index: js.Any): AutoCaption
}

object AutoCaptions {
  @scala.inline
  def apply(
    Application: Application,
    CancelAutoInsert: () => Unit,
    Count: Double,
    Creator: Double,
    Item: js.Any => AutoCaption,
    Parent: js.Any,
    WordDotAutoCaptions_typekey: AutoCaptions
  ): AutoCaptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CancelAutoInsert = js.Any.fromFunction0(CancelAutoInsert), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaptions_typekey")(WordDotAutoCaptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaptions]
  }
}

