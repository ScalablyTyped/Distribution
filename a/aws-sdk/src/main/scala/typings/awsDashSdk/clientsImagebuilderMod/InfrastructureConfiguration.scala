package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfrastructureConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the infrastruction configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which the infrastructure configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The date on which the infrastructure configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  /**
    * The description of the infrastruction configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance profile of the infrastruction configuration.
    */
  var instanceProfileName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance types of the infrastruction configuration.
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.native
  /**
    * The EC2 key pair of the infrastruction configuration.
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.native
  /**
    * The logging configuration of the infrastruction configuration.
    */
  var logging: js.UndefOr[Logging] = js.native
  /**
    * The name of the infrastruction configuration.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The security group IDs of the infrastruction configuration.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * The SNS Topic Amazon Resource Name (ARN) of the infrastruction configuration.
    */
  var snsTopicArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The subnet ID of the infrastruction configuration.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The tags of the infrastruction configuration.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The terminate instance on failure configuration of the infrastruction configuration.
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.native
}

object InfrastructureConfiguration {
  @scala.inline
  def apply(
    arn: ImageBuilderArn = null,
    dateCreated: DateTime = null,
    dateUpdated: DateTime = null,
    description: NonEmptyString = null,
    instanceProfileName: NonEmptyString = null,
    instanceTypes: InstanceTypeList = null,
    keyPair: NonEmptyString = null,
    logging: Logging = null,
    name: ResourceName = null,
    securityGroupIds: SecurityGroupIds = null,
    snsTopicArn: NonEmptyString = null,
    subnetId: NonEmptyString = null,
    tags: TagMap = null,
    terminateInstanceOnFailure: js.UndefOr[Boolean] = js.undefined
  ): InfrastructureConfiguration = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated.asInstanceOf[js.Any])
    if (dateUpdated != null) __obj.updateDynamic("dateUpdated")(dateUpdated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (instanceProfileName != null) __obj.updateDynamic("instanceProfileName")(instanceProfileName.asInstanceOf[js.Any])
    if (instanceTypes != null) __obj.updateDynamic("instanceTypes")(instanceTypes.asInstanceOf[js.Any])
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (snsTopicArn != null) __obj.updateDynamic("snsTopicArn")(snsTopicArn.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(terminateInstanceOnFailure)) __obj.updateDynamic("terminateInstanceOnFailure")(terminateInstanceOnFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfrastructureConfiguration]
  }
}

