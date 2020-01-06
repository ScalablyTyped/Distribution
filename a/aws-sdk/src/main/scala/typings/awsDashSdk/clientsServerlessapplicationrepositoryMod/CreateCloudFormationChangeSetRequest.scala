package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFormationChangeSetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: __string = js.native
  /**
    * A list of values that you must specify before you can deploy certain applications.
    Some applications might include resources that can affect permissions in your AWS
    account, for example, by creating new AWS Identity and Access Management (IAM) users.
    For those applications, you must explicitly acknowledge their capabilities by
    specifying this parameter.The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM,
    CAPABILITY_RESOURCE_POLICY, and CAPABILITY_AUTO_EXPAND.The following resources require you to specify CAPABILITY_IAM or
    CAPABILITY_NAMED_IAM:
    AWS::IAM::Group,
    AWS::IAM::InstanceProfile,
    AWS::IAM::Policy, and
    AWS::IAM::Role.
    If the application contains IAM resources, you can specify either CAPABILITY_IAM
    or CAPABILITY_NAMED_IAM. If the application contains IAM resources
    with custom names, you must specify CAPABILITY_NAMED_IAM.The following resources require you to specify CAPABILITY_RESOURCE_POLICY:
    AWS::Lambda::Permission,
    AWS::IAM:Policy,
    AWS::ApplicationAutoScaling::ScalingPolicy,
    AWS::S3::BucketPolicy,
    AWS::SQS::QueuePolicy, and
    AWS::SNS:TopicPolicy.Applications that contain one or more nested applications require you to specify
    CAPABILITY_AUTO_EXPAND.If your application template contains any of the above resources, we recommend that you review
    all permissions associated with the application before deploying. If you don't specify
    this parameter for an application that requires capabilities, the call will fail.
    */
  var Capabilities: js.UndefOr[__listOf__string] = js.native
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ChangeSetName: js.UndefOr[__string] = js.native
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ClientToken: js.UndefOr[__string] = js.native
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var Description: js.UndefOr[__string] = js.native
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var NotificationArns: js.UndefOr[__listOf__string] = js.native
  /**
    * A list of parameter values for the parameters of the application.
    */
  var ParameterOverrides: js.UndefOr[__listOfParameterValue] = js.native
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var ResourceTypes: js.UndefOr[__listOf__string] = js.native
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var RollbackConfiguration: js.UndefOr[
    typings.awsDashSdk.clientsServerlessapplicationrepositoryMod.RollbackConfiguration
  ] = js.native
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[__string] = js.native
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var StackName: __string = js.native
  /**
    * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet
    API.
    */
  var Tags: js.UndefOr[__listOfTag] = js.native
  /**
    * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
    */
  var TemplateId: js.UndefOr[__string] = js.native
}

object CreateCloudFormationChangeSetRequest {
  @scala.inline
  def apply(
    ApplicationId: __string,
    StackName: __string,
    Capabilities: __listOf__string = null,
    ChangeSetName: __string = null,
    ClientToken: __string = null,
    Description: __string = null,
    NotificationArns: __listOf__string = null,
    ParameterOverrides: __listOfParameterValue = null,
    ResourceTypes: __listOf__string = null,
    RollbackConfiguration: RollbackConfiguration = null,
    SemanticVersion: __string = null,
    Tags: __listOfTag = null,
    TemplateId: __string = null
  ): CreateCloudFormationChangeSetRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities.asInstanceOf[js.Any])
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (NotificationArns != null) __obj.updateDynamic("NotificationArns")(NotificationArns.asInstanceOf[js.Any])
    if (ParameterOverrides != null) __obj.updateDynamic("ParameterOverrides")(ParameterOverrides.asInstanceOf[js.Any])
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes.asInstanceOf[js.Any])
    if (RollbackConfiguration != null) __obj.updateDynamic("RollbackConfiguration")(RollbackConfiguration.asInstanceOf[js.Any])
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationChangeSetRequest]
  }
}

