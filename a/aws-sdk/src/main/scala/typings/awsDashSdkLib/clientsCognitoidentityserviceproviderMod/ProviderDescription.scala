package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderDescription extends js.Object {
  /**
    * The date the provider was added to the user pool.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The date the provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
}

object ProviderDescription {
  @scala.inline
  def apply(
    CreationDate: DateType = null,
    LastModifiedDate: DateType = null,
    ProviderName: ProviderNameType = null,
    ProviderType: IdentityProviderTypeType = null
  ): ProviderDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderDescription]
  }
}

