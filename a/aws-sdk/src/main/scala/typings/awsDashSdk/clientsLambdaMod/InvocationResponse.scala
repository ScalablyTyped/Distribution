package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvocationResponse extends js.Object {
  /**
    * The version of the function that executed. When you invoke a function with an alias, this indicates which version the alias resolved to.
    */
  var ExecutedVersion: js.UndefOr[Version] = js.undefined
  /**
    * If present, indicates that an error occurred during function execution. Details about the error are included in the response payload.    Handled - The runtime caught an error thrown by the function and formatted it into a JSON document.    Unhandled - The runtime didn't handle the error. For example, the function ran out of memory or timed out.  
    */
  var FunctionError: js.UndefOr[String] = js.undefined
  /**
    * The last 4 KB of the execution log, which is base64 encoded.
    */
  var LogResult: js.UndefOr[String] = js.undefined
  /**
    * The response from the function, or an error object.
    */
  var Payload: js.UndefOr[_Blob] = js.undefined
  /**
    * The HTTP status code is in the 200 range for a successful request. For the RequestResponse invocation type, this status code is 200. For the Event invocation type, this status code is 202. For the DryRun invocation type, the status code is 204.
    */
  var StatusCode: js.UndefOr[Integer] = js.undefined
}

object InvocationResponse {
  @scala.inline
  def apply(
    ExecutedVersion: Version = null,
    FunctionError: String = null,
    LogResult: String = null,
    Payload: _Blob = null,
    StatusCode: js.UndefOr[Integer] = js.undefined
  ): InvocationResponse = {
    val __obj = js.Dynamic.literal()
    if (ExecutedVersion != null) __obj.updateDynamic("ExecutedVersion")(ExecutedVersion)
    if (FunctionError != null) __obj.updateDynamic("FunctionError")(FunctionError)
    if (LogResult != null) __obj.updateDynamic("LogResult")(LogResult)
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode)
    __obj.asInstanceOf[InvocationResponse]
  }
}

