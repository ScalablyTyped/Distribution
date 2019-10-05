package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionInfo extends js.Object {
  /**
    *  The version of a Lambda function that production traffic points to. 
    */
  var currentVersion: js.UndefOr[Version] = js.undefined
  /**
    *  The alias of a Lambda function. For more information, see Introduction to AWS Lambda Aliases. 
    */
  var functionAlias: js.UndefOr[LambdaFunctionAlias] = js.undefined
  /**
    *  The name of a Lambda function. 
    */
  var functionName: js.UndefOr[LambdaFunctionName] = js.undefined
  /**
    *  The version of a Lambda function that production traffic points to after the Lambda function is deployed. 
    */
  var targetVersion: js.UndefOr[Version] = js.undefined
  /**
    *  The percentage of production traffic that the target version of a Lambda function receives. 
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.undefined
}

object LambdaFunctionInfo {
  @scala.inline
  def apply(
    currentVersion: Version = null,
    functionAlias: LambdaFunctionAlias = null,
    functionName: LambdaFunctionName = null,
    targetVersion: Version = null,
    targetVersionWeight: Int | Double = null
  ): LambdaFunctionInfo = {
    val __obj = js.Dynamic.literal()
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion)
    if (functionAlias != null) __obj.updateDynamic("functionAlias")(functionAlias)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (targetVersion != null) __obj.updateDynamic("targetVersion")(targetVersion)
    if (targetVersionWeight != null) __obj.updateDynamic("targetVersionWeight")(targetVersionWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionInfo]
  }
}

