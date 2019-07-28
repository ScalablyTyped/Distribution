package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionExecutionInput extends js.Object {
  var actionTypeId: js.UndefOr[ActionTypeId] = js.undefined
  /**
    * Configuration data for an action execution.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
  /**
    * Details of input artifacts of the action that correspond to the action execution.
    */
  var inputArtifacts: js.UndefOr[ArtifactDetailList] = js.undefined
  /**
    * The AWS Region for the action, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.undefined
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline. 
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object ActionExecutionInput {
  @scala.inline
  def apply(
    actionTypeId: ActionTypeId = null,
    configuration: ActionConfigurationMap = null,
    inputArtifacts: ArtifactDetailList = null,
    region: AWSRegionName = null,
    roleArn: RoleArn = null
  ): ActionExecutionInput = {
    val __obj = js.Dynamic.literal()
    if (actionTypeId != null) __obj.updateDynamic("actionTypeId")(actionTypeId)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts)
    if (region != null) __obj.updateDynamic("region")(region)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[ActionExecutionInput]
  }
}

