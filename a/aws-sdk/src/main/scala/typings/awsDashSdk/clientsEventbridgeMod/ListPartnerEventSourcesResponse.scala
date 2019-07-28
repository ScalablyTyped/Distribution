package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartnerEventSourcesResponse extends js.Object {
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.NextToken] = js.undefined
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSources: js.UndefOr[PartnerEventSourceList] = js.undefined
}

object ListPartnerEventSourcesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PartnerEventSources: PartnerEventSourceList = null): ListPartnerEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PartnerEventSources != null) __obj.updateDynamic("PartnerEventSources")(PartnerEventSources)
    __obj.asInstanceOf[ListPartnerEventSourcesResponse]
  }
}

