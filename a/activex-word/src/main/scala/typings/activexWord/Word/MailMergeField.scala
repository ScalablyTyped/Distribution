package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailMergeField extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Code: Range
  val Creator: Double
  var Locked: Boolean
  val Next: MailMergeField
  val Parent: js.Any
  val Previous: MailMergeField
  val Type: WdFieldType
  @JSName("Word.MailMergeField_typekey")
  var WordDotMailMergeField_typekey: MailMergeField
  def Copy(): Unit
  def Cut(): Unit
  def Delete(): Unit
  def Select(): Unit
}

object MailMergeField {
  @scala.inline
  def apply(
    Application: Application,
    Code: Range,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Locked: Boolean,
    Next: MailMergeField,
    Parent: js.Any,
    Previous: MailMergeField,
    Select: () => Unit,
    Type: WdFieldType,
    WordDotMailMergeField_typekey: MailMergeField
  ): MailMergeField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Locked = Locked.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeField_typekey")(WordDotMailMergeField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeField]
  }
}

