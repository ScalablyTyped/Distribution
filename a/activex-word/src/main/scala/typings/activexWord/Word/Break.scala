package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Break extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val PageIndex: Double
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  @JSName("Word.Break_typekey")
  var WordDotBreak_typekey: Break
}

object Break {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    PageIndex: Double,
    Parent: js.Any,
    Range: Range,
    WordDotBreak_typekey: Break
  ): Break = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], PageIndex = PageIndex.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Break_typekey")(WordDotBreak_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Break]
  }
}

