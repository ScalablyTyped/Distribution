package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImageBuildersRequest extends js.Object {
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The names of the image builders to describe.
    */
  var Names: js.UndefOr[StringList] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeImageBuildersRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, Names: StringList = null, NextToken: String = null): DescribeImageBuildersRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeImageBuildersRequest]
  }
}

