package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterateOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var probability: js.UndefOr[Double] = js.undefined
}

object IterateOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, probability: js.UndefOr[Double] = js.undefined): IterateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(probability)) __obj.updateDynamic("probability")(probability.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterateOptions]
  }
}

