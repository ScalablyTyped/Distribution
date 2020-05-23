package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sources extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Sources_typekey")
  var WordDotSources_typekey: Sources
  def Add(Data: String): Unit
  def Item(Index: Double): Source
}

object Sources {
  @scala.inline
  def apply(
    Add: String => Unit,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Source,
    Parent: js.Any,
    WordDotSources_typekey: Sources
  ): Sources = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Sources_typekey")(WordDotSources_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sources]
  }
}

