package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainNameRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: string = js.native
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DomainNameConfigurations] = js.native
}

object UpdateDomainNameRequest {
  @scala.inline
  def apply(DomainName: string, DomainNameConfigurations: DomainNameConfigurations = null): UpdateDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameRequest]
  }
}

