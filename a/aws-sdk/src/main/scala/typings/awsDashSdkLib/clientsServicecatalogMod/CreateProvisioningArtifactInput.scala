package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: awsDashSdkLib.clientsServicecatalogMod.IdempotencyToken
  /**
    * The configuration for the provisioning artifact.
    */
  var Parameters: ProvisioningArtifactProperties
  /**
    * The product identifier.
    */
  var ProductId: Id
}

object CreateProvisioningArtifactInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Parameters: ProvisioningArtifactProperties,
    ProductId: Id,
    AcceptLanguage: AcceptLanguage = null
  ): CreateProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken, Parameters = Parameters, ProductId = ProductId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[CreateProvisioningArtifactInput]
  }
}

