package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlatformApplicationAttributesResponse extends js.Object {
  /**
    * Attributes include the following:    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications should be sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications should be sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications should be sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications should be sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.  
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
}

object GetPlatformApplicationAttributesResponse {
  @scala.inline
  def apply(Attributes: MapStringToString = null): GetPlatformApplicationAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlatformApplicationAttributesResponse]
  }
}

