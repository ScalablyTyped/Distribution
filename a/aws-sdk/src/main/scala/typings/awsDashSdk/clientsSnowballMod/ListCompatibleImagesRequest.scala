package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCompatibleImagesRequest extends js.Object {
  /**
    * The maximum number of results for the list of compatible images. Currently, a Snowball Edge device can store 10 AMIs.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of compatible images, you can specify a value for NextToken as the starting point for your list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListCompatibleImagesRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: String = null): ListCompatibleImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCompatibleImagesRequest]
  }
}

