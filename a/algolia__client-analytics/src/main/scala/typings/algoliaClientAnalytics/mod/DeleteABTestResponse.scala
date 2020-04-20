package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteABTestResponse extends js.Object {
  /**
    * The ab test unique identifier.
    */
  val abTestID: Double
  /**
    * The index name where the ab test was attached to.
    */
  val index: String
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
}

object DeleteABTestResponse {
  @scala.inline
  def apply(abTestID: Double, index: String, taskID: Double): DeleteABTestResponse = {
    val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteABTestResponse]
  }
}

