package typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIceServerConfigResponse extends js.Object {
  /**
    * The list of ICE server information objects.
    */
  var IceServerList: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.IceServerList] = js.native
}

object GetIceServerConfigResponse {
  @scala.inline
  def apply(IceServerList: IceServerList = null): GetIceServerConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (IceServerList != null) __obj.updateDynamic("IceServerList")(IceServerList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIceServerConfigResponse]
  }
}

