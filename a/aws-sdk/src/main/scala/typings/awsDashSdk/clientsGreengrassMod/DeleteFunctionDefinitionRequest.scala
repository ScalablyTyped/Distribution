package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFunctionDefinitionRequest extends js.Object {
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: __string = js.native
}

object DeleteFunctionDefinitionRequest {
  @scala.inline
  def apply(FunctionDefinitionId: __string): DeleteFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFunctionDefinitionRequest]
  }
}

