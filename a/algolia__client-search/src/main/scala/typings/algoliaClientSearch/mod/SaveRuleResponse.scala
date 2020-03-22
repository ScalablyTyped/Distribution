package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveRuleResponse extends js.Object {
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
  /**
    * When the given rules got saved.
    */
  val updatedAt: Double
}

object SaveRuleResponse {
  @scala.inline
  def apply(taskID: Double, updatedAt: Double): SaveRuleResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SaveRuleResponse]
  }
}

