package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFunctionDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
    */
  var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: __string
  /**
    * A list of Lambda functions in this function definition version.
    */
  var Functions: js.UndefOr[__listOfFunction] = js.undefined
}

object CreateFunctionDefinitionVersionRequest {
  @scala.inline
  def apply(
    FunctionDefinitionId: __string,
    AmznClientToken: __string = null,
    DefaultConfig: FunctionDefaultConfig = null,
    Functions: __listOfFunction = null
  ): CreateFunctionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (DefaultConfig != null) __obj.updateDynamic("DefaultConfig")(DefaultConfig)
    if (Functions != null) __obj.updateDynamic("Functions")(Functions)
    __obj.asInstanceOf[CreateFunctionDefinitionVersionRequest]
  }
}

