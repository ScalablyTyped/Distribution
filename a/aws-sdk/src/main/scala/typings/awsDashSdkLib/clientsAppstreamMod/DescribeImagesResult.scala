package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImagesResult extends js.Object {
  /**
    * Information about the images.
    */
  var Images: js.UndefOr[ImageList] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeImagesResult {
  @scala.inline
  def apply(Images: ImageList = null, NextToken: String = null): DescribeImagesResult = {
    val __obj = js.Dynamic.literal()
    if (Images != null) __obj.updateDynamic("Images")(Images)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeImagesResult]
  }
}

