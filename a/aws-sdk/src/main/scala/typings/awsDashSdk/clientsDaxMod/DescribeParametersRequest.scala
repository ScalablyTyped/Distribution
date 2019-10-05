package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeParametersRequest extends js.Object {
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: String
  /**
    * How the parameter is defined. For example, system denotes a system-defined parameter.
    */
  var Source: js.UndefOr[String] = js.undefined
}

object DescribeParametersRequest {
  @scala.inline
  def apply(
    ParameterGroupName: String,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    Source: String = null
  ): DescribeParametersRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[DescribeParametersRequest]
  }
}

