package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var createdAt: java.lang.String
  var objectID: js.UndefOr[java.lang.String] = js.undefined
  var taskID: scala.Double
}

object Task {
  @scala.inline
  def apply(createdAt: java.lang.String, taskID: scala.Double, objectID: java.lang.String = null): Task = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, taskID = taskID)
    if (objectID != null) __obj.updateDynamic("objectID")(objectID)
    __obj.asInstanceOf[Task]
  }
}

