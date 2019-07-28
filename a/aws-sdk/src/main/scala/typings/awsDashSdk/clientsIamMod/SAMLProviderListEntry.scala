package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAMLProviderListEntry extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider.
    */
  var Arn: js.UndefOr[arnType] = js.undefined
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[dateType] = js.undefined
}

object SAMLProviderListEntry {
  @scala.inline
  def apply(Arn: arnType = null, CreateDate: dateType = null, ValidUntil: dateType = null): SAMLProviderListEntry = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil)
    __obj.asInstanceOf[SAMLProviderListEntry]
  }
}

