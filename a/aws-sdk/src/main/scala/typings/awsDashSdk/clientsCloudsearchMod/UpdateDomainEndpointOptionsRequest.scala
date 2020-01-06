package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainEndpointOptionsRequest extends js.Object {
  /**
    * Whether to require that all requests to the domain arrive over HTTPS. We recommend Policy-Min-TLS-1-2-2019-07 for TLSSecurityPolicy. For compatibility with older clients, the default is Policy-Min-TLS-1-0-2019-07. 
    */
  var DomainEndpointOptions: typings.awsDashSdk.clientsCloudsearchMod.DomainEndpointOptions = js.native
  /**
    * A string that represents the name of a domain.
    */
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
}

object UpdateDomainEndpointOptionsRequest {
  @scala.inline
  def apply(DomainEndpointOptions: DomainEndpointOptions, DomainName: DomainName): UpdateDomainEndpointOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainEndpointOptions = DomainEndpointOptions.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateDomainEndpointOptionsRequest]
  }
}

