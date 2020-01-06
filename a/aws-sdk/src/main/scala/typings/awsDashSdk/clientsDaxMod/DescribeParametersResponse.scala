package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeParametersResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of parameters within a parameter group. Each element in the list represents one parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.native
}

object DescribeParametersResponse {
  @scala.inline
  def apply(NextToken: String = null, Parameters: ParameterList = null): DescribeParametersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeParametersResponse]
  }
}

