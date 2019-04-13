package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThreatIntelSetsResponse extends js.Object {
  var NextToken: js.UndefOr[NextToken] = js.undefined
  var ThreatIntelSetIds: js.UndefOr[ThreatIntelSetIds] = js.undefined
}

object ListThreatIntelSetsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, ThreatIntelSetIds: ThreatIntelSetIds = null): ListThreatIntelSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ThreatIntelSetIds != null) __obj.updateDynamic("ThreatIntelSetIds")(ThreatIntelSetIds)
    __obj.asInstanceOf[ListThreatIntelSetsResponse]
  }
}

