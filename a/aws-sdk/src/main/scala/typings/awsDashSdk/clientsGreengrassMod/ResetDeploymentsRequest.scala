package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetDeploymentsRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  /**
    * If true, performs a best-effort only core reset.
    */
  var Force: js.UndefOr[__boolean] = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string = js.native
}

object ResetDeploymentsRequest {
  @scala.inline
  def apply(GroupId: __string, AmznClientToken: __string = null, Force: js.UndefOr[Boolean] = js.undefined): ResetDeploymentsRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetDeploymentsRequest]
  }
}

