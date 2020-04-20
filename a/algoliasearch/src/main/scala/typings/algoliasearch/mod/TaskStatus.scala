package typings.algoliasearch.mod

import typings.algoliasearch.algoliasearchStrings.notPublished
import typings.algoliasearch.algoliasearchStrings.published
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskStatus extends js.Object {
  var pendingTask: Boolean
  var status: published | notPublished
}

object TaskStatus {
  @scala.inline
  def apply(pendingTask: Boolean, status: published | notPublished): TaskStatus = {
    val __obj = js.Dynamic.literal(pendingTask = pendingTask.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatus]
  }
}

