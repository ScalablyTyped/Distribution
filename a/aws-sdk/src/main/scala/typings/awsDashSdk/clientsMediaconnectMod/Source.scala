package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[__integer] = js.undefined
  /**
    * The type of encryption that is used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[Encryption] = js.undefined
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[__string] = js.undefined
  /**
    * The IP address that the flow will be listening on for incoming content.
    */
  var IngestIp: js.UndefOr[__string] = js.undefined
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[__integer] = js.undefined
  /**
    * The name of the source.
    */
  var Name: __string
  /**
    * The ARN of the source.
    */
  var SourceArn: __string
  /**
    * Attributes related to the transport stream that are used in the source.
    */
  var Transport: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Transport] = js.undefined
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[__string] = js.undefined
}

object Source {
  @scala.inline
  def apply(
    Name: __string,
    SourceArn: __string,
    DataTransferSubscriberFeePercent: Int | Double = null,
    Decryption: Encryption = null,
    Description: __string = null,
    EntitlementArn: __string = null,
    IngestIp: __string = null,
    IngestPort: Int | Double = null,
    Transport: Transport = null,
    WhitelistCidr: __string = null
  ): Source = {
    val __obj = js.Dynamic.literal(Name = Name, SourceArn = SourceArn)
    if (DataTransferSubscriberFeePercent != null) __obj.updateDynamic("DataTransferSubscriberFeePercent")(DataTransferSubscriberFeePercent.asInstanceOf[js.Any])
    if (Decryption != null) __obj.updateDynamic("Decryption")(Decryption)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn)
    if (IngestIp != null) __obj.updateDynamic("IngestIp")(IngestIp)
    if (IngestPort != null) __obj.updateDynamic("IngestPort")(IngestPort.asInstanceOf[js.Any])
    if (Transport != null) __obj.updateDynamic("Transport")(Transport)
    if (WhitelistCidr != null) __obj.updateDynamic("WhitelistCidr")(WhitelistCidr)
    __obj.asInstanceOf[Source]
  }
}

