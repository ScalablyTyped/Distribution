package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentRunAgent extends js.Object {
  /**
    * The current health state of the agent.
    */
  var agentHealth: AgentHealth
  /**
    * The detailed health state of the agent.
    */
  var agentHealthCode: AgentHealthCode
  /**
    * The description for the agent health code.
    */
  var agentHealthDetails: js.UndefOr[Message] = js.undefined
  /**
    * The AWS account of the EC2 instance where the agent is installed.
    */
  var agentId: AgentId
  /**
    * The ARN of the assessment run that is associated with the agent.
    */
  var assessmentRunArn: Arn
  /**
    * The Auto Scaling group of the EC2 instance that is specified by the agent ID.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.undefined
  /**
    * The Amazon Inspector application data metrics that are collected by the agent.
    */
  var telemetryMetadata: TelemetryMetadataList
}

object AssessmentRunAgent {
  @scala.inline
  def apply(
    agentHealth: AgentHealth,
    agentHealthCode: AgentHealthCode,
    agentId: AgentId,
    assessmentRunArn: Arn,
    telemetryMetadata: TelemetryMetadataList,
    agentHealthDetails: Message = null,
    autoScalingGroup: AutoScalingGroup = null
  ): AssessmentRunAgent = {
    val __obj = js.Dynamic.literal(agentHealth = agentHealth.asInstanceOf[js.Any], agentHealthCode = agentHealthCode.asInstanceOf[js.Any], agentId = agentId, assessmentRunArn = assessmentRunArn, telemetryMetadata = telemetryMetadata)
    if (agentHealthDetails != null) __obj.updateDynamic("agentHealthDetails")(agentHealthDetails)
    if (autoScalingGroup != null) __obj.updateDynamic("autoScalingGroup")(autoScalingGroup)
    __obj.asInstanceOf[AssessmentRunAgent]
  }
}

