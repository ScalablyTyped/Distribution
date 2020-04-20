package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSettingsResponse extends js.Object {
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
  /**
    * When the settings got updated.
    */
  val updatedAt: Double
}

object SetSettingsResponse {
  @scala.inline
  def apply(taskID: Double, updatedAt: Double): SetSettingsResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSettingsResponse]
  }
}

