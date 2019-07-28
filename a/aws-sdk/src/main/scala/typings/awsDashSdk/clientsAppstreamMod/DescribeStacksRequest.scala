package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStacksRequest extends js.Object {
  /**
    * The names of the stacks to describe.
    */
  var Names: js.UndefOr[StringList] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeStacksRequest {
  @scala.inline
  def apply(Names: StringList = null, NextToken: String = null): DescribeStacksRequest = {
    val __obj = js.Dynamic.literal()
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeStacksRequest]
  }
}

