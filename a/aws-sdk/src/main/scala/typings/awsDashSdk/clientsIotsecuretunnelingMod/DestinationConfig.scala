package typings.awsDashSdk.clientsIotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationConfig extends js.Object {
  /**
    * A list of service names that identity the target application. Currently, you can only specify a single name. The AWS IoT client running on the destination device reads this value and uses it to look up a port or an IP address and a port. The AWS IoT client instantiates the local proxy which uses this information to connect to the destination application.
    */
  var services: ServiceList = js.native
  /**
    * The name of the IoT thing to which you want to connect.
    */
  var thingName: ThingName = js.native
}

object DestinationConfig {
  @scala.inline
  def apply(services: ServiceList, thingName: ThingName): DestinationConfig = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DestinationConfig]
  }
}

