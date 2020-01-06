package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainConfigurationResponse extends js.Object {
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.native
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.native
  /**
    * A Boolean value that specifies the current state of the domain configuration.
    */
  var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.native
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * The type of the domain.
    */
  var domainType: js.UndefOr[DomainType] = js.native
  /**
    * A list containing summary information about the server certificate included in the domain configuration.
    */
  var serverCertificates: js.UndefOr[ServerCertificates] = js.native
  /**
    * The type of service delivered by the endpoint.
    */
  var serviceType: js.UndefOr[ServiceType] = js.native
}

object DescribeDomainConfigurationResponse {
  @scala.inline
  def apply(
    authorizerConfig: AuthorizerConfig = null,
    domainConfigurationArn: DomainConfigurationArn = null,
    domainConfigurationName: ReservedDomainConfigurationName = null,
    domainConfigurationStatus: DomainConfigurationStatus = null,
    domainName: DomainName = null,
    domainType: DomainType = null,
    serverCertificates: ServerCertificates = null,
    serviceType: ServiceType = null
  ): DescribeDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizerConfig != null) __obj.updateDynamic("authorizerConfig")(authorizerConfig.asInstanceOf[js.Any])
    if (domainConfigurationArn != null) __obj.updateDynamic("domainConfigurationArn")(domainConfigurationArn.asInstanceOf[js.Any])
    if (domainConfigurationName != null) __obj.updateDynamic("domainConfigurationName")(domainConfigurationName.asInstanceOf[js.Any])
    if (domainConfigurationStatus != null) __obj.updateDynamic("domainConfigurationStatus")(domainConfigurationStatus.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (domainType != null) __obj.updateDynamic("domainType")(domainType.asInstanceOf[js.Any])
    if (serverCertificates != null) __obj.updateDynamic("serverCertificates")(serverCertificates.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainConfigurationResponse]
  }
}

