package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointResponse extends js.Object {
  /**
    * EndpointArn returned from CreateEndpoint action.
    */
  var EndpointArn: js.UndefOr[String] = js.native
}

object CreateEndpointResponse {
  @scala.inline
  def apply(EndpointArn: String = null): CreateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointResponse]
  }
}

