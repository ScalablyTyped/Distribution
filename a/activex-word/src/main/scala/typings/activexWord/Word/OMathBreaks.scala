package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathBreaks extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.OMathBreaks_typekey")
  var WordDotOMathBreaks_typekey: OMathBreaks
  def Add(Range: Range): OMathBreak
  def Item(Index: Double): OMathBreak
}

object OMathBreaks {
  @scala.inline
  def apply(
    Add: Range => OMathBreak,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => OMathBreak,
    Parent: js.Any,
    WordDotOMathBreaks_typekey: OMathBreaks
  ): OMathBreaks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBreaks_typekey")(WordDotOMathBreaks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBreaks]
  }
}

