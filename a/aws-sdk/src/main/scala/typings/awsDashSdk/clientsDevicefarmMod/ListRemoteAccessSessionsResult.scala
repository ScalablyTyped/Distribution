package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRemoteAccessSessionsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A container that represents the metadata from the service about each remote access session you are requesting.
    */
  var remoteAccessSessions: js.UndefOr[RemoteAccessSessions] = js.native
}

object ListRemoteAccessSessionsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, remoteAccessSessions: RemoteAccessSessions = null): ListRemoteAccessSessionsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (remoteAccessSessions != null) __obj.updateDynamic("remoteAccessSessions")(remoteAccessSessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRemoteAccessSessionsResult]
  }
}

