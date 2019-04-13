package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputDestination extends js.Object {
  /**
    * The system-generated static IP address of endpoint.
  It remains fixed for the lifetime of the input.
    */
  var Ip: js.UndefOr[__string] = js.undefined
  /**
    * The port number for the input.
    */
  var Port: js.UndefOr[__string] = js.undefined
  /**
    * This represents the endpoint that the customer stream will be
  pushed to.
    */
  var Url: js.UndefOr[__string] = js.undefined
  var Vpc: js.UndefOr[InputDestinationVpc] = js.undefined
}

object InputDestination {
  @scala.inline
  def apply(Ip: __string = null, Port: __string = null, Url: __string = null, Vpc: InputDestinationVpc = null): InputDestination = {
    val __obj = js.Dynamic.literal()
    if (Ip != null) __obj.updateDynamic("Ip")(Ip)
    if (Port != null) __obj.updateDynamic("Port")(Port)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (Vpc != null) __obj.updateDynamic("Vpc")(Vpc)
    __obj.asInstanceOf[InputDestination]
  }
}

