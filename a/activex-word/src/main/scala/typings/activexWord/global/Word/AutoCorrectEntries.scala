package typings.activexWord.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoCorrectEntries")
@js.native
class AutoCorrectEntries protected ()
  extends typings.activexWord.Word.AutoCorrectEntries {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.AutoCorrectEntries_typekey")
  override var WordDotAutoCorrectEntries_typekey: typings.activexWord.Word.AutoCorrectEntries = js.native
  /* CompleteClass */
  override def Add(Name: String, Value: String): typings.activexWord.Word.AutoCorrectEntry = js.native
  /* CompleteClass */
  override def AddRichText(Name: String, Range: typings.activexWord.Word.Range): typings.activexWord.Word.AutoCorrectEntry = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.AutoCorrectEntry = js.native
}

