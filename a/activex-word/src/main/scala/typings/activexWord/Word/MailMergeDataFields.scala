package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailMergeDataFields extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.MailMergeDataFields_typekey")
  var WordDotMailMergeDataFields_typekey: MailMergeDataFields
  def Item(Index: js.Any): MailMergeDataField
}

object MailMergeDataFields {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => MailMergeDataField,
    Parent: js.Any,
    WordDotMailMergeDataFields_typekey: MailMergeDataFields
  ): MailMergeDataFields = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeDataFields_typekey")(WordDotMailMergeDataFields_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeDataFields]
  }
}

