package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointResponse extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the endpoint being created.
    */
  var EndpointArn: js.UndefOr[ComprehendEndpointArn] = js.native
}

object CreateEndpointResponse {
  @scala.inline
  def apply(EndpointArn: ComprehendEndpointArn = null): CreateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointResponse]
  }
}

