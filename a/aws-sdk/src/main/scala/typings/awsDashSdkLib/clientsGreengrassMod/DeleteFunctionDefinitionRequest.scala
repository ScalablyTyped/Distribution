package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFunctionDefinitionRequest extends js.Object {
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: __string
}

object DeleteFunctionDefinitionRequest {
  @scala.inline
  def apply(FunctionDefinitionId: __string): DeleteFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId)
  
    __obj.asInstanceOf[DeleteFunctionDefinitionRequest]
  }
}

