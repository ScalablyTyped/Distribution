package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImageBuildersResult extends js.Object {
  /**
    * Information about the image builders.
    */
  var ImageBuilders: js.UndefOr[ImageBuilderList] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeImageBuildersResult {
  @scala.inline
  def apply(ImageBuilders: ImageBuilderList = null, NextToken: String = null): DescribeImageBuildersResult = {
    val __obj = js.Dynamic.literal()
    if (ImageBuilders != null) __obj.updateDynamic("ImageBuilders")(ImageBuilders)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeImageBuildersResult]
  }
}

