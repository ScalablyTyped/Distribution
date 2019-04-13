package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainNameRequest extends js.Object {
  /**
    * The domain name.
    */
  var DomainName: StringWithLengthBetween1And512
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
}

object CreateDomainNameRequest {
  @scala.inline
  def apply(
    DomainName: StringWithLengthBetween1And512,
    DomainNameConfigurations: DomainNameConfigurations = null
  ): CreateDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations)
    __obj.asInstanceOf[CreateDomainNameRequest]
  }
}

