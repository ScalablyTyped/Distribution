package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddABTestResponse extends js.Object {
  /**
    * The ab test unique identifier.
    */
  val abTestID: Double
  /**
    * The index name where the ab test is attached to.
    */
  val index: String
  /**
    * The operation task id. May be used to perform a wait task.
    */
  val taskID: Double
}

object AddABTestResponse {
  @scala.inline
  def apply(abTestID: Double, index: String, taskID: Double): AddABTestResponse = {
    val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], taskID = taskID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddABTestResponse]
  }
}

