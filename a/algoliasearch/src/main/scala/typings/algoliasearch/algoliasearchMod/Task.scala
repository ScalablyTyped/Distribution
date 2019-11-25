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
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    if (objectID != null) __obj.updateDynamic("objectID")(objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

