package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesForTagOptionOutput extends js.Object {
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the resources.
    */
  var ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined
}

object ListResourcesForTagOptionOutput {
  @scala.inline
  def apply(PageToken: PageToken = null, ResourceDetails: ResourceDetails = null): ListResourcesForTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (ResourceDetails != null) __obj.updateDynamic("ResourceDetails")(ResourceDetails)
    __obj.asInstanceOf[ListResourcesForTagOptionOutput]
  }
}

