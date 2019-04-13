package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: __string
  /**
    * The ID of the function definition version.
    */
  var FunctionDefinitionVersionId: __string
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object GetFunctionDefinitionVersionRequest {
  @scala.inline
  def apply(FunctionDefinitionId: __string, FunctionDefinitionVersionId: __string, NextToken: __string = null): GetFunctionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId, FunctionDefinitionVersionId = FunctionDefinitionVersionId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetFunctionDefinitionVersionRequest]
  }
}

