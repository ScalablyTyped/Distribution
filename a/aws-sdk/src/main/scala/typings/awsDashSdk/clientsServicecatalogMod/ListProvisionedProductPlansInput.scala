package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProvisionedProductPlansInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The access level to use to obtain results. The default is User.
    */
  var AccessLevelFilter: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AccessLevelFilter] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.undefined
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.undefined
}

object ListProvisionedProductPlansInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    AccessLevelFilter: AccessLevelFilter = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null,
    ProvisionProductId: Id = null
  ): ListProvisionedProductPlansInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (AccessLevelFilter != null) __obj.updateDynamic("AccessLevelFilter")(AccessLevelFilter)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (ProvisionProductId != null) __obj.updateDynamic("ProvisionProductId")(ProvisionProductId)
    __obj.asInstanceOf[ListProvisionedProductPlansInput]
  }
}

