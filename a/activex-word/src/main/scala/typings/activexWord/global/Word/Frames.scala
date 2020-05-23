package typings.activexWord.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Frames")
@js.native
class Frames protected ()
  extends typings.activexWord.Word.Frames {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.Frames_typekey")
  override var WordDotFrames_typekey: typings.activexWord.Word.Frames = js.native
  /* CompleteClass */
  override def Add(Range: typings.activexWord.Word.Range): typings.activexWord.Word.Frame = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Item(Index: Double): typings.activexWord.Word.Frame = js.native
}

