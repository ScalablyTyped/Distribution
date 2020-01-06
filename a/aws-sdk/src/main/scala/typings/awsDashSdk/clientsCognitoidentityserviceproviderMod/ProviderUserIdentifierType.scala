package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderUserIdentifierType extends js.Object {
  /**
    * The name of the provider attribute to link to, for example, NameID.
    */
  var ProviderAttributeName: js.UndefOr[StringType] = js.native
  /**
    * The value of the provider attribute to link to, for example, xxxxx_account.
    */
  var ProviderAttributeValue: js.UndefOr[StringType] = js.native
  /**
    * The name of the provider, for example, Facebook, Google, or Login with Amazon.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
}

object ProviderUserIdentifierType {
  @scala.inline
  def apply(
    ProviderAttributeName: StringType = null,
    ProviderAttributeValue: StringType = null,
    ProviderName: ProviderNameType = null
  ): ProviderUserIdentifierType = {
    val __obj = js.Dynamic.literal()
    if (ProviderAttributeName != null) __obj.updateDynamic("ProviderAttributeName")(ProviderAttributeName.asInstanceOf[js.Any])
    if (ProviderAttributeValue != null) __obj.updateDynamic("ProviderAttributeValue")(ProviderAttributeValue.asInstanceOf[js.Any])
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderUserIdentifierType]
  }
}

