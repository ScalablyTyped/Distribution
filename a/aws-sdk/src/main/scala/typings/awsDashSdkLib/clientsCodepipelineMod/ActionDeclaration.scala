package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDeclaration extends js.Object {
  /**
    * The configuration information for the action type.
    */
  var actionTypeId: ActionTypeId
  /**
    * The action declaration's configuration.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
  /**
    * The name or ID of the artifact consumed by the action, such as a test or build artifact.
    */
  var inputArtifacts: js.UndefOr[InputArtifactList] = js.undefined
  /**
    * The action declaration's name.
    */
  var name: ActionName
  /**
    * The name or ID of the result of the action declaration, such as a test or build artifact.
    */
  var outputArtifacts: js.UndefOr[OutputArtifactList] = js.undefined
  /**
    * The action declaration's AWS Region, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.undefined
  /**
    * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The order in which actions are run.
    */
  var runOrder: js.UndefOr[ActionRunOrder] = js.undefined
}

object ActionDeclaration {
  @scala.inline
  def apply(
    actionTypeId: ActionTypeId,
    name: ActionName,
    configuration: ActionConfigurationMap = null,
    inputArtifacts: InputArtifactList = null,
    outputArtifacts: OutputArtifactList = null,
    region: AWSRegionName = null,
    roleArn: RoleArn = null,
    runOrder: js.UndefOr[ActionRunOrder] = js.undefined
  ): ActionDeclaration = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId, name = name)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts)
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts)
    if (region != null) __obj.updateDynamic("region")(region)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (!js.isUndefined(runOrder)) __obj.updateDynamic("runOrder")(runOrder)
    __obj.asInstanceOf[ActionDeclaration]
  }
}

