package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRecordInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The record identifier of the provisioned product. This identifier is returned by the request operation.
    */
  var Id: typings.awsDashSdk.clientsServicecatalogMod.Id
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.undefined
}

object DescribeRecordInput {
  @scala.inline
  def apply(
    Id: Id,
    AcceptLanguage: AcceptLanguage = null,
    PageSize: js.UndefOr[PageSize] = js.undefined,
    PageToken: PageToken = null
  ): DescribeRecordInput = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    __obj.asInstanceOf[DescribeRecordInput]
  }
}

