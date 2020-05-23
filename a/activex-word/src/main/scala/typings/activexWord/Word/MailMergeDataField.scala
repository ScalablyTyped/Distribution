package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailMergeDataField extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  val Value: String
  @JSName("Word.MailMergeDataField_typekey")
  var WordDotMailMergeDataField_typekey: MailMergeDataField
}

object MailMergeDataField {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    Value: String,
    WordDotMailMergeDataField_typekey: MailMergeDataField
  ): MailMergeDataField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeDataField_typekey")(WordDotMailMergeDataField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeDataField]
  }
}

