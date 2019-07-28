package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionDefinitionRequest extends js.Object {
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: __string
}

object GetFunctionDefinitionRequest {
  @scala.inline
  def apply(FunctionDefinitionId: __string): GetFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId)
  
    __obj.asInstanceOf[GetFunctionDefinitionRequest]
  }
}

