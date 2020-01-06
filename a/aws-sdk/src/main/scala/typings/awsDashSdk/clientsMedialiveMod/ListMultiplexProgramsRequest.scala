package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultiplexProgramsRequest extends js.Object {
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MaxResults] = js.native
  /**
    * The ID of the multiplex that the programs belong to.
    */
  var MultiplexId: __string = js.native
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListMultiplexProgramsRequest {
  @scala.inline
  def apply(MultiplexId: __string, MaxResults: Int | Double = null, NextToken: __string = null): ListMultiplexProgramsRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultiplexProgramsRequest]
  }
}

