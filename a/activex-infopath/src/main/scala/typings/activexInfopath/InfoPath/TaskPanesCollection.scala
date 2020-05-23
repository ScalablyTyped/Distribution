package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskPanesCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.TaskPanesCollection_typekey")
  var InfoPathDotTaskPanesCollection_typekey: TaskPanesCollection
  def Item(varIndex: js.Any): TaskPaneObject
}

object TaskPanesCollection {
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotTaskPanesCollection_typekey: TaskPanesCollection,
    Item: js.Any => TaskPaneObject
  ): TaskPanesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.TaskPanesCollection_typekey")(InfoPathDotTaskPanesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPanesCollection]
  }
}

