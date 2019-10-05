package typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", "createClient")
@js.native
object createClient extends js.Object {
  /**
    * Creates a Client Object
    *
    * This method creates and returns a client object. You can only call this method once each call session.
    * @example `AgoraRTC.createClient(config)`
    * @param config Defines the property of the client, see {@link ClientConfig} for details.
    */
  def apply(config: ClientConfig): Client = js.native
}

