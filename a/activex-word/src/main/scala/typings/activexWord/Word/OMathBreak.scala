package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathBreak extends js.Object {
  var AlignAt: Double
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  @JSName("Word.OMathBreak_typekey")
  var WordDotOMathBreak_typekey: OMathBreak
  def Delete(): Unit
}

object OMathBreak {
  @scala.inline
  def apply(
    AlignAt: Double,
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Parent: js.Any,
    Range: Range,
    WordDotOMathBreak_typekey: OMathBreak
  ): OMathBreak = {
    val __obj = js.Dynamic.literal(AlignAt = AlignAt.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathBreak_typekey")(WordDotOMathBreak_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathBreak]
  }
}

