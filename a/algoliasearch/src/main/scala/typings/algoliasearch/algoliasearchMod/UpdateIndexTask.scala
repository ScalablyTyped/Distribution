package typings.algoliasearch.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  */
trait UpdateIndexTask extends js.Object {
  var taskID: Double
  var updatedAt: String
}

object UpdateIndexTask {
  @scala.inline
  def apply(taskID: Double, updatedAt: String): UpdateIndexTask = {
    val __obj = js.Dynamic.literal(taskID = taskID, updatedAt = updatedAt)
  
    __obj.asInstanceOf[UpdateIndexTask]
  }
}

