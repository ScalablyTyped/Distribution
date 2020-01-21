package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImageBuildersResult extends js.Object {
  /**
    * Information about the image builders.
    */
  var ImageBuilders: js.UndefOr[ImageBuilderList] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeImageBuildersResult {
  @scala.inline
  def apply(ImageBuilders: ImageBuilderList = null, NextToken: String = null): DescribeImageBuildersResult = {
    val __obj = js.Dynamic.literal()
    if (ImageBuilders != null) __obj.updateDynamic("ImageBuilders")(ImageBuilders.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageBuildersResult]
  }
}

