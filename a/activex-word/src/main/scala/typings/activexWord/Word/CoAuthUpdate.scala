package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoAuthUpdate extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  @JSName("Word.CoAuthUpdate_typekey")
  var WordDotCoAuthUpdate_typekey: CoAuthUpdate
}

object CoAuthUpdate {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Range: Range,
    WordDotCoAuthUpdate_typekey: CoAuthUpdate
  ): CoAuthUpdate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthUpdate_typekey")(WordDotCoAuthUpdate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthUpdate]
  }
}

