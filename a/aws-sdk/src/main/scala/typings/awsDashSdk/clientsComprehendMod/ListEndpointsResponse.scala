package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsResponse extends js.Object {
  /**
    * Displays a list of endpoint properties being retrieved by the service in response to the request.
    */
  var EndpointPropertiesList: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.EndpointPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEndpointsResponse {
  @scala.inline
  def apply(EndpointPropertiesList: EndpointPropertiesList = null, NextToken: String = null): ListEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointPropertiesList != null) __obj.updateDynamic("EndpointPropertiesList")(EndpointPropertiesList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsResponse]
  }
}

