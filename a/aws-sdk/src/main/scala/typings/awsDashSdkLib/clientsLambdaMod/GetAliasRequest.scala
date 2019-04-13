package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAliasRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: awsDashSdkLib.clientsLambdaMod.FunctionName
  /**
    * The name of the alias.
    */
  var Name: Alias
}

object GetAliasRequest {
  @scala.inline
  def apply(FunctionName: FunctionName, Name: Alias): GetAliasRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName, Name = Name)
  
    __obj.asInstanceOf[GetAliasRequest]
  }
}

