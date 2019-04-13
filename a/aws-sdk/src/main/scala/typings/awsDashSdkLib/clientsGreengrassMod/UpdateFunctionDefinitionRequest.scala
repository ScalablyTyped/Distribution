package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFunctionDefinitionRequest extends js.Object {
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: __string
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object UpdateFunctionDefinitionRequest {
  @scala.inline
  def apply(FunctionDefinitionId: __string, Name: __string = null): UpdateFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateFunctionDefinitionRequest]
  }
}

