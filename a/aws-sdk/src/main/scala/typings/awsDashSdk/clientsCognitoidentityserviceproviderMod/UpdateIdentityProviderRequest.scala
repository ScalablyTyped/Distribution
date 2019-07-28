package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateIdentityProviderRequest extends js.Object {
  /**
    * The identity provider attribute mapping to be changed.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
  /**
    * The identity provider details to be updated, such as MetadataURL and MetadataFile.
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object UpdateIdentityProviderRequest {
  @scala.inline
  def apply(
    ProviderName: ProviderNameType,
    UserPoolId: UserPoolIdType,
    AttributeMapping: AttributeMappingType = null,
    IdpIdentifiers: IdpIdentifiersListType = null,
    ProviderDetails: ProviderDetailsType = null
  ): UpdateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName, UserPoolId = UserPoolId)
    if (AttributeMapping != null) __obj.updateDynamic("AttributeMapping")(AttributeMapping)
    if (IdpIdentifiers != null) __obj.updateDynamic("IdpIdentifiers")(IdpIdentifiers)
    if (ProviderDetails != null) __obj.updateDynamic("ProviderDetails")(ProviderDetails)
    __obj.asInstanceOf[UpdateIdentityProviderRequest]
  }
}

