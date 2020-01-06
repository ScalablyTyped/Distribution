package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPercentilesResponse extends js.Object {
  /**
    * The percentile values of the aggregated fields.
    */
  var percentiles: js.UndefOr[Percentiles] = js.native
}

object GetPercentilesResponse {
  @scala.inline
  def apply(percentiles: Percentiles = null): GetPercentilesResponse = {
    val __obj = js.Dynamic.literal()
    if (percentiles != null) __obj.updateDynamic("percentiles")(percentiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPercentilesResponse]
  }
}

