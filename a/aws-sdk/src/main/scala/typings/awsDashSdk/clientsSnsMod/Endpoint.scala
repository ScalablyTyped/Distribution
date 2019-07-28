package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * Attributes for endpoint.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.undefined
  /**
    * EndpointArn for mobile app and device.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
}

object Endpoint {
  @scala.inline
  def apply(Attributes: MapStringToString = null, EndpointArn: String = null): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn)
    __obj.asInstanceOf[Endpoint]
  }
}

