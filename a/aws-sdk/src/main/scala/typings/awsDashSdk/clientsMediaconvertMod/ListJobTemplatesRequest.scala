package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobTemplatesRequest extends js.Object {
  /**
    * Optionally, specify a job template category to limit responses to only job templates from that category.
    */
  var Category: js.UndefOr[__string] = js.undefined
  /**
    * Optional. When you request a list of job templates, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by name.
    */
  var ListBy: js.UndefOr[JobTemplateListBy] = js.undefined
  /**
    * Optional. Number of job templates, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of job templates.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Order] = js.undefined
}

object ListJobTemplatesRequest {
  @scala.inline
  def apply(
    Category: __string = null,
    ListBy: JobTemplateListBy = null,
    MaxResults: Int | Double = null,
    NextToken: __string = null,
    Order: Order = null
  ): ListJobTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (ListBy != null) __obj.updateDynamic("ListBy")(ListBy.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobTemplatesRequest]
  }
}

