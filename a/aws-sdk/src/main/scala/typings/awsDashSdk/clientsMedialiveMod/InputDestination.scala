package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDestination extends js.Object {
  /**
    * The system-generated static IP address of endpoint.
  It remains fixed for the lifetime of the input.
    */
  var Ip: js.UndefOr[__string] = js.native
  /**
    * The port number for the input.
    */
  var Port: js.UndefOr[__string] = js.native
  /**
    * This represents the endpoint that the customer stream will be
  pushed to.
    */
  var Url: js.UndefOr[__string] = js.native
  var Vpc: js.UndefOr[InputDestinationVpc] = js.native
}

object InputDestination {
  @scala.inline
  def apply(Ip: __string = null, Port: __string = null, Url: __string = null, Vpc: InputDestinationVpc = null): InputDestination = {
    val __obj = js.Dynamic.literal()
    if (Ip != null) __obj.updateDynamic("Ip")(Ip.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (Vpc != null) __obj.updateDynamic("Vpc")(Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDestination]
  }
}

