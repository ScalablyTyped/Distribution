package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagOptionsOutput extends js.Object {
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.PageToken] = js.native
  /**
    * Information about the TagOptions.
    */
  var TagOptionDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.TagOptionDetails] = js.native
}

object ListTagOptionsOutput {
  @scala.inline
  def apply(PageToken: PageToken = null, TagOptionDetails: TagOptionDetails = null): ListTagOptionsOutput = {
    val __obj = js.Dynamic.literal()
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    if (TagOptionDetails != null) __obj.updateDynamic("TagOptionDetails")(TagOptionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagOptionsOutput]
  }
}

