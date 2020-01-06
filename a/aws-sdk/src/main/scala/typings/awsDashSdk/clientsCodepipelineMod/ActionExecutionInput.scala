package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionInput extends js.Object {
  var actionTypeId: js.UndefOr[ActionTypeId] = js.native
  /**
    * Configuration data for an action execution.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.native
  /**
    * Details of input artifacts of the action that correspond to the action execution.
    */
  var inputArtifacts: js.UndefOr[ArtifactDetailList] = js.native
  /**
    * The variable namespace associated with the action. All variables produced as output by this action fall under this namespace.
    */
  var namespace: js.UndefOr[ActionNamespace] = js.native
  /**
    * The AWS Region for the action, such as us-east-1.
    */
  var region: js.UndefOr[AWSRegionName] = js.native
  /**
    * Configuration data for an action execution with all variable references replaced with their real values for the execution.
    */
  var resolvedConfiguration: js.UndefOr[ResolvedActionConfigurationMap] = js.native
  /**
    * The ARN of the IAM service role that performs the declared action. This is assumed through the roleArn for the pipeline. 
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object ActionExecutionInput {
  @scala.inline
  def apply(
    actionTypeId: ActionTypeId = null,
    configuration: ActionConfigurationMap = null,
    inputArtifacts: ArtifactDetailList = null,
    namespace: ActionNamespace = null,
    region: AWSRegionName = null,
    resolvedConfiguration: ResolvedActionConfigurationMap = null,
    roleArn: RoleArn = null
  ): ActionExecutionInput = {
    val __obj = js.Dynamic.literal()
    if (actionTypeId != null) __obj.updateDynamic("actionTypeId")(actionTypeId.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (resolvedConfiguration != null) __obj.updateDynamic("resolvedConfiguration")(resolvedConfiguration.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionExecutionInput]
  }
}

