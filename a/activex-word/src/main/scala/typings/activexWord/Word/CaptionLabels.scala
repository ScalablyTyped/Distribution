package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionLabels extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.CaptionLabels_typekey")
  var WordDotCaptionLabels_typekey: CaptionLabels
  def Add(Name: String): CaptionLabel
  def Item(Index: js.Any): CaptionLabel
}

object CaptionLabels {
  @scala.inline
  def apply(
    Add: String => CaptionLabel,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => CaptionLabel,
    Parent: js.Any,
    WordDotCaptionLabels_typekey: CaptionLabels
  ): CaptionLabels = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CaptionLabels_typekey")(WordDotCaptionLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLabels]
  }
}

