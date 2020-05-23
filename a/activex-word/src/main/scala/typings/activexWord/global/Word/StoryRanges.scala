package typings.activexWord.global.Word

import typings.activexWord.Word.WdStoryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.StoryRanges")
@js.native
class StoryRanges protected ()
  extends typings.activexWord.Word.StoryRanges {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.StoryRanges_typekey")
  override var WordDotStoryRanges_typekey: typings.activexWord.Word.StoryRanges = js.native
  /* CompleteClass */
  override def Item(Index: WdStoryType): typings.activexWord.Word.Range = js.native
}

