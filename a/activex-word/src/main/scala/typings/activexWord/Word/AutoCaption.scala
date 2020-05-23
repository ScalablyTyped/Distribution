package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCaption extends js.Object {
  val Application: typings.activexWord.Word.Application
  var AutoInsert: Boolean
  var CaptionLabel: js.Any
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.AutoCaption_typekey")
  var WordDotAutoCaption_typekey: AutoCaption
}

object AutoCaption {
  @scala.inline
  def apply(
    Application: Application,
    AutoInsert: Boolean,
    CaptionLabel: js.Any,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotAutoCaption_typekey: AutoCaption
  ): AutoCaption = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoInsert = AutoInsert.asInstanceOf[js.Any], CaptionLabel = CaptionLabel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.AutoCaption_typekey")(WordDotAutoCaption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCaption]
  }
}

