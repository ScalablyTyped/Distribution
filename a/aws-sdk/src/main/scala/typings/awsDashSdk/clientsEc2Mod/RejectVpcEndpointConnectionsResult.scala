package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectVpcEndpointConnectionsResult extends js.Object {
  /**
    * Information about the endpoints that were not rejected, if applicable.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}

object RejectVpcEndpointConnectionsResult {
  @scala.inline
  def apply(Unsuccessful: UnsuccessfulItemSet = null): RejectVpcEndpointConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful)
    __obj.asInstanceOf[RejectVpcEndpointConnectionsResult]
  }
}

