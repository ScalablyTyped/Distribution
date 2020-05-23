package typings.activexWord.global.Word

import typings.activexWord.Word.WdFieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.MailMergeField")
@js.native
class MailMergeField protected ()
  extends typings.activexWord.Word.MailMergeField {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var Code: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Locked: Boolean = js.native
  /* CompleteClass */
  override val Next: typings.activexWord.Word.MailMergeField = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Previous: typings.activexWord.Word.MailMergeField = js.native
  /* CompleteClass */
  override val Type: WdFieldType = js.native
  /* CompleteClass */
  @JSName("Word.MailMergeField_typekey")
  override var WordDotMailMergeField_typekey: typings.activexWord.Word.MailMergeField = js.native
  /* CompleteClass */
  override def Copy(): Unit = js.native
  /* CompleteClass */
  override def Cut(): Unit = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Select(): Unit = js.native
}

