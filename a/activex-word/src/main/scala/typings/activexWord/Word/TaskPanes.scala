package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TaskPanes")
@js.native
class TaskPanes protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.TaskPanes_typekey")
  var WordDotTaskPanes_typekey: TaskPanes = js.native
  def Item(Index: WdTaskPanes): TaskPane = js.native
}

