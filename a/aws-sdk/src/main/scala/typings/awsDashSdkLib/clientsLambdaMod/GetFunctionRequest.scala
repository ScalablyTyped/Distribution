package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionRequest extends js.Object {
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName
  /**
    * Specify a version or alias to get details about a published version of the function.
    */
  var Qualifier: js.UndefOr[Qualifier] = js.undefined
}

object GetFunctionRequest {
  @scala.inline
  def apply(FunctionName: NamespacedFunctionName, Qualifier: Qualifier = null): GetFunctionRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName)
    if (Qualifier != null) __obj.updateDynamic("Qualifier")(Qualifier)
    __obj.asInstanceOf[GetFunctionRequest]
  }
}

