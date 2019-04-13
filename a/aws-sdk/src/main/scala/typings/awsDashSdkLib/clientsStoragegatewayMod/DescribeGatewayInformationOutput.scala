package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGatewayInformationOutput extends js.Object {
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[GatewayId] = js.undefined
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A NetworkInterface array that contains descriptions of the gateway network interfaces.
    */
  var GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces] = js.undefined
  /**
    * A value that indicates the operating state of the gateway.
    */
  var GatewayState: js.UndefOr[GatewayState] = js.undefined
  /**
    * A value that indicates the time zone configured for the gateway.
    */
  var GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[GatewayType] = js.undefined
  /**
    * The date on which the last software update was applied to the gateway. If the gateway has never been updated, this field does not return a value in the response.
    */
  var LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate] = js.undefined
  /**
    * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the gateway is not available for an update this field is not returned in the response.
    */
  var NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate] = js.undefined
  /**
    * A list of up to 10 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object DescribeGatewayInformationOutput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN = null,
    GatewayId: GatewayId = null,
    GatewayName: java.lang.String = null,
    GatewayNetworkInterfaces: GatewayNetworkInterfaces = null,
    GatewayState: GatewayState = null,
    GatewayTimezone: GatewayTimezone = null,
    GatewayType: GatewayType = null,
    LastSoftwareUpdate: LastSoftwareUpdate = null,
    NextUpdateAvailabilityDate: NextUpdateAvailabilityDate = null,
    Tags: Tags = null
  ): DescribeGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[DescribeGatewayInformationOutput]
  }
}

