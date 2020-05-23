package typings.activexWord.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Subdocument")
@js.native
class Subdocument protected ()
  extends typings.activexWord.Word.Subdocument {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val HasFile: Boolean = js.native
  /* CompleteClass */
  override val Level: Double = js.native
  /* CompleteClass */
  override var Locked: Boolean = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Path: String = js.native
  /* CompleteClass */
  override val Range: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  @JSName("Word.Subdocument_typekey")
  override var WordDotSubdocument_typekey: typings.activexWord.Word.Subdocument = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Open(): typings.activexWord.Word.Document = js.native
  /* CompleteClass */
  override def Split(Range: typings.activexWord.Word.Range): Unit = js.native
}

