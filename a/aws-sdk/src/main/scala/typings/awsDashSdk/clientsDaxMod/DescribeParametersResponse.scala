package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeParametersResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of parameters within a parameter group. Each element in the list represents one parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.undefined
}

object DescribeParametersResponse {
  @scala.inline
  def apply(NextToken: String = null, Parameters: ParameterList = null): DescribeParametersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[DescribeParametersResponse]
  }
}

