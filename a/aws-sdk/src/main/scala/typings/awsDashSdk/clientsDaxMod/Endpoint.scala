package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * The DNS hostname of the endpoint.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * The port number that applications should use to connect to the endpoint.
    */
  var Port: js.UndefOr[Integer] = js.undefined
}

object Endpoint {
  @scala.inline
  def apply(Address: String = null, Port: Int | Double = null): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

