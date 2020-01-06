package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainConfigurationResponse extends js.Object {
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[DomainConfigurationName] = js.native
}

object CreateDomainConfigurationResponse {
  @scala.inline
  def apply(
    domainConfigurationArn: DomainConfigurationArn = null,
    domainConfigurationName: DomainConfigurationName = null
  ): CreateDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (domainConfigurationArn != null) __obj.updateDynamic("domainConfigurationArn")(domainConfigurationArn.asInstanceOf[js.Any])
    if (domainConfigurationName != null) __obj.updateDynamic("domainConfigurationName")(domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainConfigurationResponse]
  }
}

