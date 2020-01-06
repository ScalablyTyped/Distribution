package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultiplexesResponse extends js.Object {
  /**
    * List of multiplexes.
    */
  var Multiplexes: js.UndefOr[__listOfMultiplexSummary] = js.native
  /**
    * Token for the next ListMultiplexes request.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListMultiplexesResponse {
  @scala.inline
  def apply(Multiplexes: __listOfMultiplexSummary = null, NextToken: __string = null): ListMultiplexesResponse = {
    val __obj = js.Dynamic.literal()
    if (Multiplexes != null) __obj.updateDynamic("Multiplexes")(Multiplexes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultiplexesResponse]
  }
}

