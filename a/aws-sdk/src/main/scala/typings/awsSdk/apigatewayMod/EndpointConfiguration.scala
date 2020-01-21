package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfiguration extends js.Object {
  /**
    * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName). For an edge-optimized API and its custom domain name, the endpoint type is "EDGE". For a regional API and its custom domain name, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
    */
  var types: js.UndefOr[ListOfEndpointType] = js.native
  /**
    * A list of VpcEndpointIds of an API (RestApi) against which to create Route53 ALIASes. It is only supported for PRIVATE endpoint type.
    */
  var vpcEndpointIds: js.UndefOr[ListOfString] = js.native
}

object EndpointConfiguration {
  @scala.inline
  def apply(types: ListOfEndpointType = null, vpcEndpointIds: ListOfString = null): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (vpcEndpointIds != null) __obj.updateDynamic("vpcEndpointIds")(vpcEndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfiguration]
  }
}

