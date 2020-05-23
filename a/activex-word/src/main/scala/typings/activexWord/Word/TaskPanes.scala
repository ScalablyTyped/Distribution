package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskPanes extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.TaskPanes_typekey")
  var WordDotTaskPanes_typekey: TaskPanes
  def Item(Index: WdTaskPanes): TaskPane
}

object TaskPanes {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdTaskPanes => TaskPane,
    Parent: js.Any,
    WordDotTaskPanes_typekey: TaskPanes
  ): TaskPanes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TaskPanes_typekey")(WordDotTaskPanes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPanes]
  }
}

