package typings.algoliasearch.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var createdAt: String
  var objectID: js.UndefOr[String] = js.undefined
  var taskID: Double
}

object Task {
  @scala.inline
  def apply(createdAt: String, taskID: Double, objectID: String = null): Task = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, taskID = taskID)
    if (objectID != null) __obj.updateDynamic("objectID")(objectID)
    __obj.asInstanceOf[Task]
  }
}

