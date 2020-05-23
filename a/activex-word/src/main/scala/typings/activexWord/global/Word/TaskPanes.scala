package typings.activexWord.global.Word

import typings.activexWord.Word.WdTaskPanes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TaskPanes")
@js.native
class TaskPanes protected ()
  extends typings.activexWord.Word.TaskPanes {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.TaskPanes_typekey")
  override var WordDotTaskPanes_typekey: typings.activexWord.Word.TaskPanes = js.native
  /* CompleteClass */
  override def Item(Index: WdTaskPanes): typings.activexWord.Word.TaskPane = js.native
}

