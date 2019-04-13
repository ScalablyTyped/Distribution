package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAliasRequest extends js.Object {
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: awsDashSdkLib.clientsLambdaMod.FunctionName
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: Version
  /**
    * The name of the alias.
    */
  var Name: Alias
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
}

object CreateAliasRequest {
  @scala.inline
  def apply(
    FunctionName: FunctionName,
    FunctionVersion: Version,
    Name: Alias,
    Description: Description = null,
    RoutingConfig: AliasRoutingConfiguration = null
  ): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName, FunctionVersion = FunctionVersion, Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (RoutingConfig != null) __obj.updateDynamic("RoutingConfig")(RoutingConfig)
    __obj.asInstanceOf[CreateAliasRequest]
  }
}

