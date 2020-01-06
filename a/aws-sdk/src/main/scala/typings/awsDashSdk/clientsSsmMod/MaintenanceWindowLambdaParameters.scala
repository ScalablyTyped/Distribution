package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowLambdaParameters extends js.Object {
  /**
    * Pass client-specific information to the Lambda function that you are invoking. You can then process the client information in your Lambda function as you choose through the context variable.
    */
  var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.native
  /**
    * JSON to provide to your Lambda function as input.
    */
  var Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.native
  /**
    * (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the action uses the alias ARN to invoke the Lambda function version to which the alias points.
    */
  var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.native
}

object MaintenanceWindowLambdaParameters {
  @scala.inline
  def apply(
    ClientContext: MaintenanceWindowLambdaClientContext = null,
    Payload: MaintenanceWindowLambdaPayload = null,
    Qualifier: MaintenanceWindowLambdaQualifier = null
  ): MaintenanceWindowLambdaParameters = {
    val __obj = js.Dynamic.literal()
    if (ClientContext != null) __obj.updateDynamic("ClientContext")(ClientContext.asInstanceOf[js.Any])
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    if (Qualifier != null) __obj.updateDynamic("Qualifier")(Qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowLambdaParameters]
  }
}

