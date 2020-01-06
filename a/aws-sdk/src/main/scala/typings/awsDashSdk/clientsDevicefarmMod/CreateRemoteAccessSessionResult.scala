package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRemoteAccessSessionResult extends js.Object {
  /**
    * A container that describes the remote access session when the request to create a remote access session is sent.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.native
}

object CreateRemoteAccessSessionResult {
  @scala.inline
  def apply(remoteAccessSession: RemoteAccessSession = null): CreateRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    if (remoteAccessSession != null) __obj.updateDynamic("remoteAccessSession")(remoteAccessSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRemoteAccessSessionResult]
  }
}

