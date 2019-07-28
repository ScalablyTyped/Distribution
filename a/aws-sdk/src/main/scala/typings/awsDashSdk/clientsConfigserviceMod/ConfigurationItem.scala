package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationItem extends js.Object {
  /**
    * The 12-digit AWS account ID associated with the resource.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  /**
    * accoun
    */
  var arn: js.UndefOr[ARN] = js.undefined
  /**
    * The Availability Zone associated with the resource.
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
  /**
    * The region where the resource resides.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.undefined
  /**
    * The description of the resource configuration.
    */
  var configuration: js.UndefOr[Configuration] = js.undefined
  /**
    * The time when the configuration recording was initiated.
    */
  var configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.undefined
  /**
    * Unique MD5 hash that represents the configuration item's state. You can use MD5 hash to compare the states of two or more configuration items that are associated with the same resource.
    */
  var configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash] = js.undefined
  /**
    * The configuration item status.
    */
  var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined
  /**
    * An identifier that indicates the ordering of the configuration items of a resource.
    */
  var configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined
  /**
    * A list of CloudTrail event IDs. A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail log. For more information about CloudTrail, see What Is AWS CloudTrail. An empty field indicates that the current configuration was not initiated by any event.
    */
  var relatedEvents: js.UndefOr[RelatedEventList] = js.undefined
  /**
    * A list of related AWS resources.
    */
  var relationships: js.UndefOr[RelationshipList] = js.undefined
  /**
    * The time stamp when the resource was created.
    */
  var resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.undefined
  /**
    * The ID of the resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The custom name of the resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The type of AWS resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * Configuration attributes that AWS Config returns for certain resource types to supplement the information returned for the configuration parameter.
    */
  var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.undefined
  /**
    * A mapping of key value tags associated with the resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The version number of the resource configuration.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object ConfigurationItem {
  @scala.inline
  def apply(
    accountId: AccountId = null,
    arn: ARN = null,
    availabilityZone: AvailabilityZone = null,
    awsRegion: AwsRegion = null,
    configuration: Configuration = null,
    configurationItemCaptureTime: ConfigurationItemCaptureTime = null,
    configurationItemMD5Hash: ConfigurationItemMD5Hash = null,
    configurationItemStatus: ConfigurationItemStatus = null,
    configurationStateId: ConfigurationStateId = null,
    relatedEvents: RelatedEventList = null,
    relationships: RelationshipList = null,
    resourceCreationTime: ResourceCreationTime = null,
    resourceId: ResourceId = null,
    resourceName: ResourceName = null,
    resourceType: ResourceType = null,
    supplementaryConfiguration: SupplementaryConfiguration = null,
    tags: Tags = null,
    version: Version = null
  ): ConfigurationItem = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (configurationItemCaptureTime != null) __obj.updateDynamic("configurationItemCaptureTime")(configurationItemCaptureTime)
    if (configurationItemMD5Hash != null) __obj.updateDynamic("configurationItemMD5Hash")(configurationItemMD5Hash)
    if (configurationItemStatus != null) __obj.updateDynamic("configurationItemStatus")(configurationItemStatus.asInstanceOf[js.Any])
    if (configurationStateId != null) __obj.updateDynamic("configurationStateId")(configurationStateId)
    if (relatedEvents != null) __obj.updateDynamic("relatedEvents")(relatedEvents)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    if (resourceCreationTime != null) __obj.updateDynamic("resourceCreationTime")(resourceCreationTime)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supplementaryConfiguration != null) __obj.updateDynamic("supplementaryConfiguration")(supplementaryConfiguration)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ConfigurationItem]
  }
}

