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
  def apply(limit: Int | Double = null, offset: Int | Double = null): GetABTestsOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetABTestsOptions]
  }
}

