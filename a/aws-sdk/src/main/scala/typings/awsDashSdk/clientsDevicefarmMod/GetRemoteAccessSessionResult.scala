package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRemoteAccessSessionResult extends js.Object {
  /**
    * A container that lists detailed information about the remote access session.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined
}

object GetRemoteAccessSessionResult {
  @scala.inline
  def apply(remoteAccessSession: RemoteAccessSession = null): GetRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    if (remoteAccessSession != null) __obj.updateDynamic("remoteAccessSession")(remoteAccessSession)
    __obj.asInstanceOf[GetRemoteAccessSessionResult]
  }
}

