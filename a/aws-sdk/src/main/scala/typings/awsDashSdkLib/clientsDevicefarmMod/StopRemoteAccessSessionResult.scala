package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRemoteAccessSessionResult extends js.Object {
  /**
    * A container representing the metadata from the service about the remote access session you are stopping.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined
}

object StopRemoteAccessSessionResult {
  @scala.inline
  def apply(remoteAccessSession: RemoteAccessSession = null): StopRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    if (remoteAccessSession != null) __obj.updateDynamic("remoteAccessSession")(remoteAccessSession)
    __obj.asInstanceOf[StopRemoteAccessSessionResult]
  }
}

