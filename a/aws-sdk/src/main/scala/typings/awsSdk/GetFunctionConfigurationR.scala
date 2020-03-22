package typings.awsSdk

import typings.awsSdk.lambdaMod.NamespacedFunctionName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/lambda.GetFunctionConfigurationRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetFunctionConfigurationR extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName = js.native
  /**
    * Specify a version or alias to get details about a published version of the function.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.lambdaMod.Qualifier] = js.native
}

