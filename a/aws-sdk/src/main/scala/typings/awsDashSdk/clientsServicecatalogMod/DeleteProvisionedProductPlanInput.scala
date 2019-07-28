package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProvisionedProductPlanInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.IgnoreErrors] = js.undefined
  /**
    * The plan identifier.
    */
  var PlanId: Id
}

object DeleteProvisionedProductPlanInput {
  @scala.inline
  def apply(
    PlanId: Id,
    AcceptLanguage: AcceptLanguage = null,
    IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined
  ): DeleteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(PlanId = PlanId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (!js.isUndefined(IgnoreErrors)) __obj.updateDynamic("IgnoreErrors")(IgnoreErrors)
    __obj.asInstanceOf[DeleteProvisionedProductPlanInput]
  }
}

