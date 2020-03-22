package typings.algoliaClientRecommendation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPersonalizationStrategyResponse extends js.Object {
  /**
    * The message.
    */
  val message: String
  /**
    * The status code.
    */
  val status: js.UndefOr[Double] = js.undefined
}

object SetPersonalizationStrategyResponse {
  @scala.inline
  def apply(message: String, status: Int | Double = null): SetPersonalizationStrategyResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPersonalizationStrategyResponse]
  }
}

