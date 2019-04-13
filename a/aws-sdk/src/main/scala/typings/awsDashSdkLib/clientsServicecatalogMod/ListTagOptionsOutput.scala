package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagOptionsOutput extends js.Object {
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the TagOptions.
    */
  var TagOptionDetails: js.UndefOr[TagOptionDetails] = js.undefined
}

object ListTagOptionsOutput {
  @scala.inline
  def apply(PageToken: PageToken = null, TagOptionDetails: TagOptionDetails = null): ListTagOptionsOutput = {
    val __obj = js.Dynamic.literal()
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (TagOptionDetails != null) __obj.updateDynamic("TagOptionDetails")(TagOptionDetails)
    __obj.asInstanceOf[ListTagOptionsOutput]
  }
}

