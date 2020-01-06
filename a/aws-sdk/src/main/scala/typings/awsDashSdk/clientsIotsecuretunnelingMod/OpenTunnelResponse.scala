package typings.awsDashSdk.clientsIotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTunnelResponse extends js.Object {
  /**
    * The access token the destination local proxy uses to connect to AWS IoT Secure Tunneling.
    */
  var destinationAccessToken: js.UndefOr[ClientAccessToken] = js.native
  /**
    * The access token the source local proxy uses to connect to AWS IoT Secure Tunneling.
    */
  var sourceAccessToken: js.UndefOr[ClientAccessToken] = js.native
  /**
    * The Amazon Resource Name for the tunnel. The tunnel ARN format is arn:aws:tunnel:&lt;region&gt;:&lt;account-id&gt;:tunnel/&lt;tunnel-id&gt; 
    */
  var tunnelArn: js.UndefOr[TunnelArn] = js.native
  /**
    * A unique alpha-numeric tunnel ID.
    */
  var tunnelId: js.UndefOr[TunnelId] = js.native
}

object OpenTunnelResponse {
  @scala.inline
  def apply(
    destinationAccessToken: ClientAccessToken = null,
    sourceAccessToken: ClientAccessToken = null,
    tunnelArn: TunnelArn = null,
    tunnelId: TunnelId = null
  ): OpenTunnelResponse = {
    val __obj = js.Dynamic.literal()
    if (destinationAccessToken != null) __obj.updateDynamic("destinationAccessToken")(destinationAccessToken.asInstanceOf[js.Any])
    if (sourceAccessToken != null) __obj.updateDynamic("sourceAccessToken")(sourceAccessToken.asInstanceOf[js.Any])
    if (tunnelArn != null) __obj.updateDynamic("tunnelArn")(tunnelArn.asInstanceOf[js.Any])
    if (tunnelId != null) __obj.updateDynamic("tunnelId")(tunnelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenTunnelResponse]
  }
}

