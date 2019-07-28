package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointConfiguration extends js.Object {
  /**
    * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName). For an edge-optimized API and its custom domain name, the endpoint type is "EDGE". For a regional API and its custom domain name, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
    */
  var types: js.UndefOr[ListOfEndpointType] = js.undefined
}

object EndpointConfiguration {
  @scala.inline
  def apply(types: ListOfEndpointType = null): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[EndpointConfiguration]
  }
}

