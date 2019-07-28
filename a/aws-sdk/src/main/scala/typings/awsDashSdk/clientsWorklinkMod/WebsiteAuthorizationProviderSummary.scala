package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsiteAuthorizationProviderSummary extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.undefined
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: typings.awsDashSdk.clientsWorklinkMod.AuthorizationProviderType
  /**
    * The time of creation.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DomainName] = js.undefined
}

object WebsiteAuthorizationProviderSummary {
  @scala.inline
  def apply(
    AuthorizationProviderType: AuthorizationProviderType,
    AuthorizationProviderId: Id = null,
    CreatedTime: DateTime = null,
    DomainName: DomainName = null
  ): WebsiteAuthorizationProviderSummary = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any])
    if (AuthorizationProviderId != null) __obj.updateDynamic("AuthorizationProviderId")(AuthorizationProviderId)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    __obj.asInstanceOf[WebsiteAuthorizationProviderSummary]
  }
}

