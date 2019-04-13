package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskStatus extends js.Object {
  var pendingTask: scala.Boolean
  var status: algoliasearchLib.algoliasearchLibStrings.published | algoliasearchLib.algoliasearchLibStrings.notPublished
}

object TaskStatus {
  @scala.inline
  def apply(
    pendingTask: scala.Boolean,
    status: algoliasearchLib.algoliasearchLibStrings.published | algoliasearchLib.algoliasearchLibStrings.notPublished
  ): TaskStatus = {
    val __obj = js.Dynamic.literal(pendingTask = pendingTask, status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskStatus]
  }
}

