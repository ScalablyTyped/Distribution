package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayOptions extends js.Object {
  /**
    * A private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
    */
  var AmazonSideAsn: js.UndefOr[Long] = js.undefined
  /**
    * The ID of the default association route table.
    */
  var AssociationDefaultRouteTableId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether attachment requests are automatically accepted.
    */
  var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue] = js.undefined
  /**
    * Indicates whether resource attachments are automatically associated with the default association route table.
    */
  var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue] = js.undefined
  /**
    * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
    */
  var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue] = js.undefined
  /**
    * Indicates whether DNS support is enabled.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.undefined
  /**
    * The ID of the default propagation route table.
    */
  var PropagationDefaultRouteTableId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether Equal Cost Multipath Protocol support is enabled.
    */
  var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue] = js.undefined
}

object TransitGatewayOptions {
  @scala.inline
  def apply(
    AmazonSideAsn: Int | scala.Double = null,
    AssociationDefaultRouteTableId: String = null,
    AutoAcceptSharedAttachments: AutoAcceptSharedAttachmentsValue = null,
    DefaultRouteTableAssociation: DefaultRouteTableAssociationValue = null,
    DefaultRouteTablePropagation: DefaultRouteTablePropagationValue = null,
    DnsSupport: DnsSupportValue = null,
    PropagationDefaultRouteTableId: String = null,
    VpnEcmpSupport: VpnEcmpSupportValue = null
  ): TransitGatewayOptions = {
    val __obj = js.Dynamic.literal()
    if (AmazonSideAsn != null) __obj.updateDynamic("AmazonSideAsn")(AmazonSideAsn.asInstanceOf[js.Any])
    if (AssociationDefaultRouteTableId != null) __obj.updateDynamic("AssociationDefaultRouteTableId")(AssociationDefaultRouteTableId)
    if (AutoAcceptSharedAttachments != null) __obj.updateDynamic("AutoAcceptSharedAttachments")(AutoAcceptSharedAttachments.asInstanceOf[js.Any])
    if (DefaultRouteTableAssociation != null) __obj.updateDynamic("DefaultRouteTableAssociation")(DefaultRouteTableAssociation.asInstanceOf[js.Any])
    if (DefaultRouteTablePropagation != null) __obj.updateDynamic("DefaultRouteTablePropagation")(DefaultRouteTablePropagation.asInstanceOf[js.Any])
    if (DnsSupport != null) __obj.updateDynamic("DnsSupport")(DnsSupport.asInstanceOf[js.Any])
    if (PropagationDefaultRouteTableId != null) __obj.updateDynamic("PropagationDefaultRouteTableId")(PropagationDefaultRouteTableId)
    if (VpnEcmpSupport != null) __obj.updateDynamic("VpnEcmpSupport")(VpnEcmpSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayOptions]
  }
}

