package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderUserIdentifierType extends js.Object {
  /**
    * The name of the provider attribute to link to, for example, NameID.
    */
  var ProviderAttributeName: js.UndefOr[StringType] = js.undefined
  /**
    * The value of the provider attribute to link to, for example, xxxxx_account.
    */
  var ProviderAttributeValue: js.UndefOr[StringType] = js.undefined
  /**
    * The name of the provider, for example, Facebook, Google, or Login with Amazon.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
}

object ProviderUserIdentifierType {
  @scala.inline
  def apply(
    ProviderAttributeName: StringType = null,
    ProviderAttributeValue: StringType = null,
    ProviderName: ProviderNameType = null
  ): ProviderUserIdentifierType = {
    val __obj = js.Dynamic.literal()
    if (ProviderAttributeName != null) __obj.updateDynamic("ProviderAttributeName")(ProviderAttributeName)
    if (ProviderAttributeValue != null) __obj.updateDynamic("ProviderAttributeValue")(ProviderAttributeValue)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    __obj.asInstanceOf[ProviderUserIdentifierType]
  }
}

