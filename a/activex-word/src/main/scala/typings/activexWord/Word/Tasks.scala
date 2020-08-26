package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tasks extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Tasks_typekey")
  var WordDotTasks_typekey: Tasks = js.native
  def Exists(Name: String): Boolean = js.native
  def ExitWindows(): Unit = js.native
  def Item(Index: js.Any): Task = js.native
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
  @scala.inline
  implicit class TasksOps[Self <: Tasks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setExists(value: String => Boolean): Self = this.set("Exists", js.Any.fromFunction1(value))
    @scala.inline
    def setExitWindows(value: () => Unit): Self = this.set("ExitWindows", js.Any.fromFunction0(value))
    @scala.inline
    def setItem(value: js.Any => Task): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotTasks_typekey(value: Tasks): Self = this.set("Word.Tasks_typekey", value.asInstanceOf[js.Any])
  }
  
}

