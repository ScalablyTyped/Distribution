package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForTagOptionOutput extends js.Object {
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.native
  /**
    * Information about the resources.
    */
  var ResourceDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ResourceDetails] = js.native
}

object ListResourcesForTagOptionOutput {
  @scala.inline
  def apply(PageToken: PageToken = null, ResourceDetails: ResourceDetails = null): ListResourcesForTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    if (ResourceDetails != null) __obj.updateDynamic("ResourceDetails")(ResourceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForTagOptionOutput]
  }
}

