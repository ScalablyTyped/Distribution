package typings.activexWord.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoCorrectEntry")
@js.native
class AutoCorrectEntry protected ()
  extends typings.activexWord.Word.AutoCorrectEntry {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val RichText: Boolean = js.native
  /* CompleteClass */
  override var Value: String = js.native
  /* CompleteClass */
  @JSName("Word.AutoCorrectEntry_typekey")
  override var WordDotAutoCorrectEntry_typekey: typings.activexWord.Word.AutoCorrectEntry = js.native
  /* CompleteClass */
  override def Apply(Range: typings.activexWord.Word.Range): Unit = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

