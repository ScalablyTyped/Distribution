package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProvisionedProductPlanInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.native
  /**
    * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.IgnoreErrors] = js.native
  /**
    * The plan identifier.
    */
  var PlanId: Id = js.native
}

object DeleteProvisionedProductPlanInput {
  @scala.inline
  def apply(
    PlanId: Id,
    AcceptLanguage: AcceptLanguage = null,
    IgnoreErrors: js.UndefOr[Boolean] = js.undefined
  ): DeleteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(PlanId = PlanId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(IgnoreErrors)) __obj.updateDynamic("IgnoreErrors")(IgnoreErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisionedProductPlanInput]
  }
}

