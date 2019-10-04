package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDeclaration extends js.Object {
  /**
    * Specifies the action type and the provider of the action.
    */
  var actionTypeId: ActionTypeId
  /**
    * The action's configuration. These are key-value pairs that specify input values for an action. For more information, see Action Structure Requirements in CodePipeline. For the list of configuration properties for the AWS CloudFormation action type in CodePipeline, see Configuration Properties Reference in the AWS CloudFormation User Guide. For template snippets with examples, see Using Parameter Override Functions with CodePipeline Pipelines in the AWS CloudFormation User Guide. The values can be represented in either JSON or YAML format. For example, the JSON configuration item format is as follows:   JSON:   "Configuration" : { Key : Value }, 
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
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline.
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

