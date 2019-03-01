package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pendingTask")(pendingTask)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatus]
  }
}

