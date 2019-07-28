package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateProvisionedProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.IgnoreErrors] = js.undefined
  /**
    * The identifier of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.undefined
  /**
    * The name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
  /**
    * An idempotency token that uniquely identifies the termination request. This token is only valid during the termination process. After the provisioned product is terminated, subsequent requests to terminate the same provisioned product always return ResourceNotFound.
    */
  var TerminateToken: IdempotencyToken
}

object TerminateProvisionedProductInput {
  @scala.inline
  def apply(
    TerminateToken: IdempotencyToken,
    AcceptLanguage: AcceptLanguage = null,
    IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined,
    ProvisionedProductId: Id = null,
    ProvisionedProductName: ProvisionedProductNameOrArn = null
  ): TerminateProvisionedProductInput = {
    val __obj = js.Dynamic.literal(TerminateToken = TerminateToken)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (!js.isUndefined(IgnoreErrors)) __obj.updateDynamic("IgnoreErrors")(IgnoreErrors)
    if (ProvisionedProductId != null) __obj.updateDynamic("ProvisionedProductId")(ProvisionedProductId)
    if (ProvisionedProductName != null) __obj.updateDynamic("ProvisionedProductName")(ProvisionedProductName)
    __obj.asInstanceOf[TerminateProvisionedProductInput]
  }
}

