package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartnerEventSourcesResponse extends js.Object {
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.NextToken] = js.native
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSources: js.UndefOr[PartnerEventSourceList] = js.native
}

object ListPartnerEventSourcesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PartnerEventSources: PartnerEventSourceList = null): ListPartnerEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PartnerEventSources != null) __obj.updateDynamic("PartnerEventSources")(PartnerEventSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartnerEventSourcesResponse]
  }
}

