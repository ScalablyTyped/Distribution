package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTemplatesRequest extends js.Object {
  /**
    * The NextToken string that specifies which page of results to return in a paginated response. This parameter is currently not supported by the Application Metrics and Campaign Metrics resources.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is currently not supported by the Application Metrics and Campaign Metrics resources.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
  /**
    * The substring to match in the names of the message templates to include in the results. If you specify this value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify.
    */
  var Prefix: js.UndefOr[__string] = js.undefined
  /**
    * The type of message template to include in the results. Valid values are: EMAIL, SMS, and PUSH. To include all types of templates in the results, don't include this parameter in your request.
    */
  var TemplateType: js.UndefOr[__string] = js.undefined
}

object ListTemplatesRequest {
  @scala.inline
  def apply(
    NextToken: __string = null,
    PageSize: __string = null,
    Prefix: __string = null,
    TemplateType: __string = null
  ): ListTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (TemplateType != null) __obj.updateDynamic("TemplateType")(TemplateType)
    __obj.asInstanceOf[ListTemplatesRequest]
  }
}

