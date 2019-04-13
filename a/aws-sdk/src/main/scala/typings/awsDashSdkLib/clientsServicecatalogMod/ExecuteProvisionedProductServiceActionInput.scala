package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteProvisionedProductServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * An idempotency token that uniquely identifies the execute request.
    */
  var ExecuteToken: IdempotencyToken
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: Id
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: Id
}

object ExecuteProvisionedProductServiceActionInput {
  @scala.inline
  def apply(
    ExecuteToken: IdempotencyToken,
    ProvisionedProductId: Id,
    ServiceActionId: Id,
    AcceptLanguage: AcceptLanguage = null
  ): ExecuteProvisionedProductServiceActionInput = {
    val __obj = js.Dynamic.literal(ExecuteToken = ExecuteToken, ProvisionedProductId = ProvisionedProductId, ServiceActionId = ServiceActionId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[ExecuteProvisionedProductServiceActionInput]
  }
}

