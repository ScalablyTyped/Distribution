package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectivityInfoResponse extends js.Object {
  /**
    * Connectivity info list.
    */
  var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo] = js.undefined
  /**
    * A message about the connectivity info request.
    */
  var Message: js.UndefOr[__string] = js.undefined
}

object GetConnectivityInfoResponse {
  @scala.inline
  def apply(ConnectivityInfo: __listOfConnectivityInfo = null, Message: __string = null): GetConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (ConnectivityInfo != null) __obj.updateDynamic("ConnectivityInfo")(ConnectivityInfo)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[GetConnectivityInfoResponse]
  }
}

