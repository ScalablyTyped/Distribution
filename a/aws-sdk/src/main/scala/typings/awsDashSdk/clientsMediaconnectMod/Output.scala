package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined
  /**
    * A description of the output.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The address where you want to send the output.
    */
  var Destination: js.UndefOr[__string] = js.undefined
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Encryption] = js.undefined
  /**
    * The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
    */
  var EntitlementArn: js.UndefOr[__string] = js.undefined
  /**
    * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added by creating a MediaLive input.
    */
  var MediaLiveInputArn: js.UndefOr[__string] = js.undefined
  /**
    * The name of the output. This value must be unique within the current flow.
    */
  var Name: __string
  /**
    * The ARN of the output.
    */
  var OutputArn: __string
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[__integer] = js.undefined
  /**
    * Attributes related to the transport stream that are used in the output.
    */
  var Transport: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Transport] = js.undefined
}

object Output {
  @scala.inline
  def apply(
    Name: __string,
    OutputArn: __string,
    DataTransferSubscriberFeePercent: Int | Double = null,
    Description: __string = null,
    Destination: __string = null,
    Encryption: Encryption = null,
    EntitlementArn: __string = null,
    MediaLiveInputArn: __string = null,
    Port: Int | Double = null,
    Transport: Transport = null
  ): Output = {
    val __obj = js.Dynamic.literal(Name = Name, OutputArn = OutputArn)
    if (DataTransferSubscriberFeePercent != null) __obj.updateDynamic("DataTransferSubscriberFeePercent")(DataTransferSubscriberFeePercent.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn)
    if (MediaLiveInputArn != null) __obj.updateDynamic("MediaLiveInputArn")(MediaLiveInputArn)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Transport != null) __obj.updateDynamic("Transport")(Transport)
    __obj.asInstanceOf[Output]
  }
}

