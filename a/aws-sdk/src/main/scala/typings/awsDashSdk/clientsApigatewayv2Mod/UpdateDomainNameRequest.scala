package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainNameRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: __string
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.DomainNameConfigurations] = js.undefined
}

object UpdateDomainNameRequest {
  @scala.inline
  def apply(DomainName: __string, DomainNameConfigurations: DomainNameConfigurations = null): UpdateDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations)
    __obj.asInstanceOf[UpdateDomainNameRequest]
  }
}

