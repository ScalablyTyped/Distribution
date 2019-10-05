package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceActionsForProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.undefined
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: Id
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: Id
}

object ListServiceActionsForProvisioningArtifactInput {
  @scala.inline
  def apply(
    ProductId: Id,
    ProvisioningArtifactId: Id,
    AcceptLanguage: AcceptLanguage = null,
    PageSize: Int | Double = null,
    PageToken: PageToken = null
  ): ListServiceActionsForProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId, ProvisioningArtifactId = ProvisioningArtifactId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactInput]
  }
}

