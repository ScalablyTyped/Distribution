package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetABTestsResponse extends js.Object {
  /**
    * The list of ab tests.
    */
  val abtests: js.Array[GetABTestResponse] | Null
  /**
    * The number of ab tests within this response.
    */
  val count: Double
  /**
    * The total of ab tests.
    */
  val total: Double
}

object GetABTestsResponse {
  @scala.inline
  def apply(count: Double, total: Double, abtests: js.Array[GetABTestResponse] = null): GetABTestsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (abtests != null) __obj.updateDynamic("abtests")(abtests.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetABTestsResponse]
  }
}

