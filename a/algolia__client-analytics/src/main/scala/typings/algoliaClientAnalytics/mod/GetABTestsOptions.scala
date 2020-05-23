package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetABTestsOptions extends js.Object {
  /**
    *  The limit of the number of ab tests returned.
    */
  val limit: js.UndefOr[Double] = js.undefined
  /**
    * The number of ab tests to skip from the biginning of the list.
    */
  val offset: js.UndefOr[Double] = js.undefined
}

object GetABTestsOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined): GetABTestsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetABTestsOptions]
  }
}

