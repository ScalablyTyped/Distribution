package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOrganizationPortfolioAccessOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Displays information about the organization nodes.
    */
  var OrganizationNodes: js.UndefOr[OrganizationNodes] = js.undefined
}

object ListOrganizationPortfolioAccessOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, OrganizationNodes: OrganizationNodes = null): ListOrganizationPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (OrganizationNodes != null) __obj.updateDynamic("OrganizationNodes")(OrganizationNodes)
    __obj.asInstanceOf[ListOrganizationPortfolioAccessOutput]
  }
}

