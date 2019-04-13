package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameterHistoryResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of parameters returned by the request.
    */
  var Parameters: js.UndefOr[ParameterHistoryList] = js.undefined
}

object GetParameterHistoryResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Parameters: ParameterHistoryList = null): GetParameterHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[GetParameterHistoryResult]
  }
}

