package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutProvisionedConcurrencyConfigRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsDashSdk.clientsLambdaMod.FunctionName = js.native
  /**
    * The amount of provisioned concurrency to allocate for the version or alias.
    */
  var ProvisionedConcurrentExecutions: PositiveInteger = js.native
  /**
    * The version number or alias name.
    */
  var Qualifier: typings.awsDashSdk.clientsLambdaMod.Qualifier = js.native
}

object PutProvisionedConcurrencyConfigRequest {
  @scala.inline
  def apply(FunctionName: FunctionName, ProvisionedConcurrentExecutions: PositiveInteger, Qualifier: Qualifier): PutProvisionedConcurrencyConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], ProvisionedConcurrentExecutions = ProvisionedConcurrentExecutions.asInstanceOf[js.Any], Qualifier = Qualifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutProvisionedConcurrencyConfigRequest]
  }
}

