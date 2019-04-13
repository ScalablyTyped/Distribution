package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSessionsResponse extends js.Object {
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of sessions meeting the request parameters.
    */
  var Sessions: js.UndefOr[SessionList] = js.undefined
}

object DescribeSessionsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Sessions: SessionList = null): DescribeSessionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Sessions != null) __obj.updateDynamic("Sessions")(Sessions)
    __obj.asInstanceOf[DescribeSessionsResponse]
  }
}

