package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSessionsResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the streaming sessions.
    */
  var Sessions: js.UndefOr[SessionList] = js.undefined
}

object DescribeSessionsResult {
  @scala.inline
  def apply(NextToken: String = null, Sessions: SessionList = null): DescribeSessionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Sessions != null) __obj.updateDynamic("Sessions")(Sessions)
    __obj.asInstanceOf[DescribeSessionsResult]
  }
}

