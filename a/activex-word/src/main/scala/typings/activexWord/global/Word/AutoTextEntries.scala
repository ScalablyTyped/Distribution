package typings.activexWord.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoTextEntries")
@js.native
class AutoTextEntries protected ()
  extends typings.activexWord.Word.AutoTextEntries {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.AutoTextEntries_typekey")
  override var WordDotAutoTextEntries_typekey: typings.activexWord.Word.AutoTextEntries = js.native
  /* CompleteClass */
  override def Add(Name: String, Range: typings.activexWord.Word.Range): typings.activexWord.Word.AutoTextEntry = js.native
  /* CompleteClass */
  override def AppendToSpike(Range: typings.activexWord.Word.Range): typings.activexWord.Word.AutoTextEntry = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.AutoTextEntry = js.native
}

