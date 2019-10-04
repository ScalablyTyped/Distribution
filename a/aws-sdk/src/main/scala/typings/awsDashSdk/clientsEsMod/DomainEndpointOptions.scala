package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainEndpointOptions extends js.Object {
  /**
    * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain.  It can be one of the following values:  Policy-Min-TLS-1-0-2019-07:  TLS security policy which supports TLSv1.0 and higher. Policy-Min-TLS-1-2-2019-07:  TLS security policy which supports only TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsDashSdk.clientsEsMod.TLSSecurityPolicy] = js.undefined
}

object DomainEndpointOptions {
  @scala.inline
  def apply(EnforceHTTPS: js.UndefOr[Boolean] = js.undefined, TLSSecurityPolicy: TLSSecurityPolicy = null): DomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnforceHTTPS)) __obj.updateDynamic("EnforceHTTPS")(EnforceHTTPS)
    if (TLSSecurityPolicy != null) __obj.updateDynamic("TLSSecurityPolicy")(TLSSecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEndpointOptions]
  }
}

