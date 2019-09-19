package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIPSetsResponse extends js.Object {
  /**
    * An array of IPSetSummary objects.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.undefined
  /**
    * To list more IPSet objects, submit another ListIPSets request, and in the next request use the NextMarker response value as the NextMarker value.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.undefined
}

object ListIPSetsResponse {
  @scala.inline
  def apply(IPSets: IPSetSummaries = null, NextMarker: NextMarker = null): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (IPSets != null) __obj.updateDynamic("IPSets")(IPSets)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListIPSetsResponse]
  }
}

