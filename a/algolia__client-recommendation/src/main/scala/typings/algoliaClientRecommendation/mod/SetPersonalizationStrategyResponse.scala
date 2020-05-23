package typings.algoliaClientRecommendation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPersonalizationStrategyResponse extends js.Object {
  /**
    * The message.
    */
  var message: String
  /**
    * The status code.
    */
  var status: js.UndefOr[Double] = js.undefined
}

object SetPersonalizationStrategyResponse {
  @scala.inline
  def apply(message: String, status: js.UndefOr[Double] = js.undefined): SetPersonalizationStrategyResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPersonalizationStrategyResponse]
  }
}

