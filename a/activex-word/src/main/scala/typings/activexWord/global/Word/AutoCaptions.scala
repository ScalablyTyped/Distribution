package typings.activexWord.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoCaptions")
@js.native
class AutoCaptions protected ()
  extends typings.activexWord.Word.AutoCaptions {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.AutoCaptions_typekey")
  override var WordDotAutoCaptions_typekey: typings.activexWord.Word.AutoCaptions = js.native
  /* CompleteClass */
  override def CancelAutoInsert(): Unit = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.AutoCaption = js.native
}

