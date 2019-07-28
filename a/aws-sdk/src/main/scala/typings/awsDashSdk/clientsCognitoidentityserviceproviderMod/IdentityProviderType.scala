package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityProviderType extends js.Object {
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
  /**
    * The date the identity provider was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
  /**
    * The date the identity provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The identity provider details, such as MetadataURL and MetadataFile.
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}

object IdentityProviderType {
  @scala.inline
  def apply(
    AttributeMapping: AttributeMappingType = null,
    CreationDate: DateType = null,
    IdpIdentifiers: IdpIdentifiersListType = null,
    LastModifiedDate: DateType = null,
    ProviderDetails: ProviderDetailsType = null,
    ProviderName: ProviderNameType = null,
    ProviderType: IdentityProviderTypeType = null,
    UserPoolId: UserPoolIdType = null
  ): IdentityProviderType = {
    val __obj = js.Dynamic.literal()
    if (AttributeMapping != null) __obj.updateDynamic("AttributeMapping")(AttributeMapping)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (IdpIdentifiers != null) __obj.updateDynamic("IdpIdentifiers")(IdpIdentifiers)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (ProviderDetails != null) __obj.updateDynamic("ProviderDetails")(ProviderDetails)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    __obj.asInstanceOf[IdentityProviderType]
  }
}

