package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplateAliasesResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * A structure containing the list of the template's aliases.
    */
  var TemplateAliasList: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.TemplateAliasList] = js.native
}

object ListTemplateAliasesResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    RequestId: String = null,
    Status: Int | scala.Double = null,
    TemplateAliasList: TemplateAliasList = null
  ): ListTemplateAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateAliasList != null) __obj.updateDynamic("TemplateAliasList")(TemplateAliasList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateAliasesResponse]
  }
}

