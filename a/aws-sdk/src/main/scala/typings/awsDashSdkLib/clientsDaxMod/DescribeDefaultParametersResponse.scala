package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDefaultParametersResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of parameters. Each element in the list represents one parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.undefined
}

object DescribeDefaultParametersResponse {
  @scala.inline
  def apply(NextToken: String = null, Parameters: ParameterList = null): DescribeDefaultParametersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[DescribeDefaultParametersResponse]
  }
}

