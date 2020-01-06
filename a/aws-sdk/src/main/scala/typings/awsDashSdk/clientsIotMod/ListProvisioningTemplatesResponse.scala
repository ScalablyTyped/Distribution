package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisioningTemplatesResponse extends js.Object {
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of fleet provisioning templates
    */
  var templates: js.UndefOr[ProvisioningTemplateListing] = js.native
}

object ListProvisioningTemplatesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, templates: ProvisioningTemplateListing = null): ListProvisioningTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisioningTemplatesResponse]
  }
}

