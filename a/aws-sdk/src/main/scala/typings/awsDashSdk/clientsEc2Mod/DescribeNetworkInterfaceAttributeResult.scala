package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNetworkInterfaceAttributeResult extends js.Object {
  /**
    * The attachment (if any) of the network interface.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.undefined
  /**
    * The description of the network interface.
    */
  var Description: js.UndefOr[AttributeValue] = js.undefined
  /**
    * The security groups associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether source/destination checking is enabled.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
}

object DescribeNetworkInterfaceAttributeResult {
  @scala.inline
  def apply(
    Attachment: NetworkInterfaceAttachment = null,
    Description: AttributeValue = null,
    Groups: GroupIdentifierList = null,
    NetworkInterfaceId: String = null,
    SourceDestCheck: AttributeBooleanValue = null
  ): DescribeNetworkInterfaceAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (Attachment != null) __obj.updateDynamic("Attachment")(Attachment)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (SourceDestCheck != null) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck)
    __obj.asInstanceOf[DescribeNetworkInterfaceAttributeResult]
  }
}

