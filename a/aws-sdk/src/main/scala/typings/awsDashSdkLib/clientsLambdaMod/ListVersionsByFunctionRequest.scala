package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVersionsByFunctionRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * Limit the number of versions that are returned.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.undefined
}

object ListVersionsByFunctionRequest {
  @scala.inline
  def apply(
    FunctionName: NamespacedFunctionName,
    Marker: String = null,
    MaxItems: js.UndefOr[MaxListItems] = js.undefined
  ): ListVersionsByFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListVersionsByFunctionRequest]
  }
}

