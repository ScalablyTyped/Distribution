package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailMergeFieldName extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.MailMergeFieldName_typekey")
  var WordDotMailMergeFieldName_typekey: MailMergeFieldName
}

object MailMergeFieldName {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: js.Any,
    WordDotMailMergeFieldName_typekey: MailMergeFieldName
  ): MailMergeFieldName = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeFieldName_typekey")(WordDotMailMergeFieldName_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeFieldName]
  }
}

