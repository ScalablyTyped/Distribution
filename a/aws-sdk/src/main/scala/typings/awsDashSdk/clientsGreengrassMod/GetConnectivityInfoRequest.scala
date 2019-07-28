package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectivityInfoRequest extends js.Object {
  /**
    * The thing name.
    */
  var ThingName: __string
}

object GetConnectivityInfoRequest {
  @scala.inline
  def apply(ThingName: __string): GetConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName)
  
    __obj.asInstanceOf[GetConnectivityInfoRequest]
  }
}

