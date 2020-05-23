package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetABTestsResponse extends js.Object {
  /**
    * The list of ab tests.
    */
  var abtests: js.Array[GetABTestResponse] | Null
  /**
    * The number of ab tests within this response.
    */
  var count: Double
  /**
    * The total of ab tests.
    */
  var total: Double
}

object GetABTestsResponse {
  @scala.inline
  def apply(count: Double, total: Double, abtests: js.Array[GetABTestResponse] = null): GetABTestsResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], abtests = abtests.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetABTestsResponse]
  }
}

