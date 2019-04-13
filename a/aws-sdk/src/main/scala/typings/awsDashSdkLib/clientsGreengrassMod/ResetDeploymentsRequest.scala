package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetDeploymentsRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * If true, performs a best-effort only core reset.
    */
  var Force: js.UndefOr[__boolean] = js.undefined
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object ResetDeploymentsRequest {
  @scala.inline
  def apply(GroupId: __string, AmznClientToken: __string = null, Force: js.UndefOr[__boolean] = js.undefined): ResetDeploymentsRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    __obj.asInstanceOf[ResetDeploymentsRequest]
  }
}

