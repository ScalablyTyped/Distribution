package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterHistoryResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
  /**
    * A list of parameters returned by the request.
    */
  var Parameters: js.UndefOr[ParameterHistoryList] = js.native
}

object GetParameterHistoryResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Parameters: ParameterHistoryList = null): GetParameterHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterHistoryResult]
  }
}

