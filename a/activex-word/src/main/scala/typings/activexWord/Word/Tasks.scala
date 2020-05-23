package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Tasks_typekey")
  var WordDotTasks_typekey: Tasks
  def Exists(Name: String): Boolean
  def ExitWindows(): Unit
  def Item(Index: js.Any): Task
}

object Tasks {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Exists: String => Boolean,
    ExitWindows: () => Unit,
    Item: js.Any => Task,
    Parent: js.Any,
    WordDotTasks_typekey: Tasks
  ): Tasks = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = js.Any.fromFunction1(Exists), ExitWindows = js.Any.fromFunction0(ExitWindows), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Tasks_typekey")(WordDotTasks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks]
  }
}

