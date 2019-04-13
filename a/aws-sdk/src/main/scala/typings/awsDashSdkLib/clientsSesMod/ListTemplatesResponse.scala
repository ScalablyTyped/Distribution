package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTemplatesResponse extends js.Object {
  /**
    * A token indicating that there are additional email templates available to be listed. Pass this token to a subsequent call to ListTemplates to retrieve the next 50 email templates.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var TemplatesMetadata: js.UndefOr[TemplateMetadataList] = js.undefined
}

object ListTemplatesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TemplatesMetadata: TemplateMetadataList = null): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TemplatesMetadata != null) __obj.updateDynamic("TemplatesMetadata")(TemplatesMetadata)
    __obj.asInstanceOf[ListTemplatesResponse]
  }
}

