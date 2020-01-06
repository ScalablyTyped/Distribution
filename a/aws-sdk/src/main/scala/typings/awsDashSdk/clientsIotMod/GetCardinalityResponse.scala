package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCardinalityResponse extends js.Object {
  /**
    * The approximate count of unique values that match the query.
    */
  var cardinality: js.UndefOr[Count] = js.native
}

object GetCardinalityResponse {
  @scala.inline
  def apply(cardinality: Int | Double = null): GetCardinalityResponse = {
    val __obj = js.Dynamic.literal()
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCardinalityResponse]
  }
}

