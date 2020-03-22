package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveSynonymsResponse extends js.Object {
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
  /**
    * When the given synonyms got saved.
    */
  val updatedAt: Double
}

object SaveSynonymsResponse {
  @scala.inline
  def apply(taskID: Double, updatedAt: Double): SaveSynonymsResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SaveSynonymsResponse]
  }
}

