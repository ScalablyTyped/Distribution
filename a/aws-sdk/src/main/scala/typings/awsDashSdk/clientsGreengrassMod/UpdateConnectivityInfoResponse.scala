package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConnectivityInfoResponse extends js.Object {
  /**
    * A message about the connectivity info update request.
    */
  var Message: js.UndefOr[__string] = js.undefined
  /**
    * The new version of the connectivity info.
    */
  var Version: js.UndefOr[__string] = js.undefined
}

object UpdateConnectivityInfoResponse {
  @scala.inline
  def apply(Message: __string = null, Version: __string = null): UpdateConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[UpdateConnectivityInfoResponse]
  }
}

