package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecentCaseCommunications extends js.Object {
  /**
    * The five most recent communications associated with the case.
    */
  var communications: js.UndefOr[CommunicationList] = js.undefined
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object RecentCaseCommunications {
  @scala.inline
  def apply(communications: CommunicationList = null, nextToken: NextToken = null): RecentCaseCommunications = {
    val __obj = js.Dynamic.literal()
    if (communications != null) __obj.updateDynamic("communications")(communications)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[RecentCaseCommunications]
  }
}

