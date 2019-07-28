package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGatewayInformationOutput extends js.Object {
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Ec2InstanceId] = js.undefined
  /**
    * The AWS Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Ec2InstanceRegion] = js.undefined
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayId] = js.undefined
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[String] = js.undefined
  /**
    * A NetworkInterface array that contains descriptions of the gateway network interfaces.
    */
  var GatewayNetworkInterfaces: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayNetworkInterfaces] = js.undefined
  /**
    * A value that indicates the operating state of the gateway.
    */
  var GatewayState: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayState] = js.undefined
  /**
    * A value that indicates the time zone configured for the gateway.
    */
  var GatewayTimezone: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayTimezone] = js.undefined
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayType] = js.undefined
  /**
    * The date on which the last software update was applied to the gateway. If the gateway has never been updated, this field does not return a value in the response.
    */
  var LastSoftwareUpdate: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.LastSoftwareUpdate] = js.undefined
  /**
    * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the gateway is not available for an update this field is not returned in the response.
    */
  var NextUpdateAvailabilityDate: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.NextUpdateAvailabilityDate] = js.undefined
  /**
    * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Tags] = js.undefined
  /**
    * The configuration settings for the virtual private cloud (VPC) endpoint for your gateway. 
    */
  var VPCEndpoint: js.UndefOr[String] = js.undefined
}

object DescribeGatewayInformationOutput {
  @scala.inline
  def apply(
    Ec2InstanceId: Ec2InstanceId = null,
    Ec2InstanceRegion: Ec2InstanceRegion = null,
    GatewayARN: GatewayARN = null,
    GatewayId: GatewayId = null,
    GatewayName: String = null,
    GatewayNetworkInterfaces: GatewayNetworkInterfaces = null,
    GatewayState: GatewayState = null,
    GatewayTimezone: GatewayTimezone = null,
    GatewayType: GatewayType = null,
    LastSoftwareUpdate: LastSoftwareUpdate = null,
    NextUpdateAvailabilityDate: NextUpdateAvailabilityDate = null,
    Tags: Tags = null,
    VPCEndpoint: String = null
  ): DescribeGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId)
    if (Ec2InstanceRegion != null) __obj.updateDynamic("Ec2InstanceRegion")(Ec2InstanceRegion)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId)
    if (GatewayName != null) __obj.updateDynamic("GatewayName")(GatewayName)
    if (GatewayNetworkInterfaces != null) __obj.updateDynamic("GatewayNetworkInterfaces")(GatewayNetworkInterfaces)
    if (GatewayState != null) __obj.updateDynamic("GatewayState")(GatewayState)
    if (GatewayTimezone != null) __obj.updateDynamic("GatewayTimezone")(GatewayTimezone)
    if (GatewayType != null) __obj.updateDynamic("GatewayType")(GatewayType)
    if (LastSoftwareUpdate != null) __obj.updateDynamic("LastSoftwareUpdate")(LastSoftwareUpdate)
    if (NextUpdateAvailabilityDate != null) __obj.updateDynamic("NextUpdateAvailabilityDate")(NextUpdateAvailabilityDate)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VPCEndpoint != null) __obj.updateDynamic("VPCEndpoint")(VPCEndpoint)
    __obj.asInstanceOf[DescribeGatewayInformationOutput]
  }
}

