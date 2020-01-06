package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvocationRequest extends js.Object {
  /**
    * Up to 3583 bytes of base64-encoded data about the invoking client to pass to the function in the context object.
    */
  var ClientContext: js.UndefOr[String] = js.native
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName = js.native
  /**
    * Choose from the following options.    RequestResponse (default) - Invoke the function synchronously. Keep the connection open until the function returns a response or times out. The API response includes the function response and additional data.    Event - Invoke the function asynchronously. Send events that fail multiple times to the function's dead-letter queue (if it's configured). The API response only includes a status code.    DryRun - Validate parameter values and verify that the user or role has permission to invoke the function.  
    */
  var InvocationType: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.InvocationType] = js.native
  /**
    * Set to Tail to include the execution log in the response.
    */
  var LogType: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.LogType] = js.native
  /**
    * The JSON that you want to provide to your Lambda function as input.
    */
  var Payload: js.UndefOr[_Blob] = js.native
  /**
    * Specify a version or alias to invoke a published version of the function.
    */
  var Qualifier: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Qualifier] = js.native
}

object InvocationRequest {
  @scala.inline
  def apply(
    FunctionName: NamespacedFunctionName,
    ClientContext: String = null,
    InvocationType: InvocationType = null,
    LogType: LogType = null,
    Payload: _Blob = null,
    Qualifier: Qualifier = null
  ): InvocationRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    if (ClientContext != null) __obj.updateDynamic("ClientContext")(ClientContext.asInstanceOf[js.Any])
    if (InvocationType != null) __obj.updateDynamic("InvocationType")(InvocationType.asInstanceOf[js.Any])
    if (LogType != null) __obj.updateDynamic("LogType")(LogType.asInstanceOf[js.Any])
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    if (Qualifier != null) __obj.updateDynamic("Qualifier")(Qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvocationRequest]
  }
}

