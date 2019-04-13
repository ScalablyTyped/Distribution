package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIdentityProviderRequest extends js.Object {
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
  /**
    * The identity provider details, such as MetadataURL and MetadataFile.
    */
  var ProviderDetails: ProviderDetailsType
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameTypeV1
  /**
    * The identity provider type.
    */
  var ProviderType: IdentityProviderTypeType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object CreateIdentityProviderRequest {
  @scala.inline
  def apply(
    ProviderDetails: ProviderDetailsType,
    ProviderName: ProviderNameTypeV1,
    ProviderType: IdentityProviderTypeType,
    UserPoolId: UserPoolIdType,
    AttributeMapping: AttributeMappingType = null,
    IdpIdentifiers: IdpIdentifiersListType = null
  ): CreateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderDetails = ProviderDetails, ProviderName = ProviderName, ProviderType = ProviderType.asInstanceOf[js.Any], UserPoolId = UserPoolId)
    if (AttributeMapping != null) __obj.updateDynamic("AttributeMapping")(AttributeMapping)
    if (IdpIdentifiers != null) __obj.updateDynamic("IdpIdentifiers")(IdpIdentifiers)
    __obj.asInstanceOf[CreateIdentityProviderRequest]
  }
}

