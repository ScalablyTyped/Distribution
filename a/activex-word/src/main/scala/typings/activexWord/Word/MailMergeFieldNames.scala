package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailMergeFieldNames extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.MailMergeFieldNames_typekey")
  var WordDotMailMergeFieldNames_typekey: MailMergeFieldNames
  def Item(Index: js.Any): MailMergeFieldName
}

object MailMergeFieldNames {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => MailMergeFieldName,
    Parent: js.Any,
    WordDotMailMergeFieldNames_typekey: MailMergeFieldNames
  ): MailMergeFieldNames = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeFieldNames_typekey")(WordDotMailMergeFieldNames_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeFieldNames]
  }
}

