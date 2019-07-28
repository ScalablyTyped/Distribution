package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteProvisionedProductPlanInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsDashSdk.clientsServicecatalogMod.IdempotencyToken
  /**
    * The plan identifier.
    */
  var PlanId: Id
}

object ExecuteProvisionedProductPlanInput {
  @scala.inline
  def apply(IdempotencyToken: IdempotencyToken, PlanId: Id, AcceptLanguage: AcceptLanguage = null): ExecuteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken, PlanId = PlanId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[ExecuteProvisionedProductPlanInput]
  }
}

