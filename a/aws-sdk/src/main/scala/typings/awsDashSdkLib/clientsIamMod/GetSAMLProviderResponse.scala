package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSAMLProviderResponse extends js.Object {
  /**
    * The date and time when the SAML provider was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * The XML metadata document that includes information about an identity provider.
    */
  var SAMLMetadataDocument: js.UndefOr[SAMLMetadataDocumentType] = js.undefined
  /**
    * The expiration date and time for the SAML provider.
    */
  var ValidUntil: js.UndefOr[dateType] = js.undefined
}

object GetSAMLProviderResponse {
  @scala.inline
  def apply(
    CreateDate: dateType = null,
    SAMLMetadataDocument: SAMLMetadataDocumentType = null,
    ValidUntil: dateType = null
  ): GetSAMLProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (SAMLMetadataDocument != null) __obj.updateDynamic("SAMLMetadataDocument")(SAMLMetadataDocument)
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil)
    __obj.asInstanceOf[GetSAMLProviderResponse]
  }
}

