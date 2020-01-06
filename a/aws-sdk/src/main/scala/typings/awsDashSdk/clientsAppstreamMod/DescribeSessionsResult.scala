package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSessionsResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the streaming sessions.
    */
  var Sessions: js.UndefOr[SessionList] = js.native
}

object DescribeSessionsResult {
  @scala.inline
  def apply(NextToken: String = null, Sessions: SessionList = null): DescribeSessionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Sessions != null) __obj.updateDynamic("Sessions")(Sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSessionsResult]
  }
}

