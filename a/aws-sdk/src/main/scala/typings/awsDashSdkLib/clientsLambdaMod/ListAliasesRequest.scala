package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAliasesRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: awsDashSdkLib.clientsLambdaMod.FunctionName
  /**
    * Specify a function version to only list aliases that invoke that version.
    */
  var FunctionVersion: js.UndefOr[Version] = js.undefined
  /**
    * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * Limit the number of aliases returned.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.undefined
}

object ListAliasesRequest {
  @scala.inline
  def apply(
    FunctionName: FunctionName,
    FunctionVersion: Version = null,
    Marker: String = null,
    MaxItems: js.UndefOr[MaxListItems] = js.undefined
  ): ListAliasesRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName)
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListAliasesRequest]
  }
}

