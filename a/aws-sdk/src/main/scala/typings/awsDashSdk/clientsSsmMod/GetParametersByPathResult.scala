package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParametersByPathResult extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
  /**
    * A list of parameters found in the specified hierarchy.
    */
  var Parameters: js.UndefOr[ParameterList] = js.native
}

object GetParametersByPathResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Parameters: ParameterList = null): GetParametersByPathResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersByPathResult]
  }
}

