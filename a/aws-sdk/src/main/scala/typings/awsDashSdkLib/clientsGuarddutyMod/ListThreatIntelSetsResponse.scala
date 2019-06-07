package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThreatIntelSetsResponse extends js.Object {
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the ThreatIntelSet resources.
    */
  var ThreatIntelSetIds: awsDashSdkLib.clientsGuarddutyMod.ThreatIntelSetIds
}

object ListThreatIntelSetsResponse {
  @scala.inline
  def apply(ThreatIntelSetIds: ThreatIntelSetIds, NextToken: String = null): ListThreatIntelSetsResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetIds = ThreatIntelSetIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListThreatIntelSetsResponse]
  }
}

