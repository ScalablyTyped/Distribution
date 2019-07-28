package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConnectivityInfoRequest extends js.Object {
  /**
    * A list of connectivity info.
    */
  var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo] = js.undefined
  /**
    * The thing name.
    */
  var ThingName: __string
}

object UpdateConnectivityInfoRequest {
  @scala.inline
  def apply(ThingName: __string, ConnectivityInfo: __listOfConnectivityInfo = null): UpdateConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName)
    if (ConnectivityInfo != null) __obj.updateDynamic("ConnectivityInfo")(ConnectivityInfo)
    __obj.asInstanceOf[UpdateConnectivityInfoRequest]
  }
}

