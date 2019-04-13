package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpRouteInfo extends js.Object {
  /**
    * The date and time the address block was added to the directory.
    */
  var AddedDateTime: js.UndefOr[AddedDateTime] = js.undefined
  /**
    * IP address block in the IpRoute.
    */
  var CidrIp: js.UndefOr[CidrIp] = js.undefined
  /**
    * Description of the IpRouteInfo.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * Identifier (ID) of the directory associated with the IP addresses.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The status of the IP address block.
    */
  var IpRouteStatusMsg: js.UndefOr[IpRouteStatusMsg] = js.undefined
  /**
    * The reason for the IpRouteStatusMsg.
    */
  var IpRouteStatusReason: js.UndefOr[IpRouteStatusReason] = js.undefined
}

object IpRouteInfo {
  @scala.inline
  def apply(
    AddedDateTime: AddedDateTime = null,
    CidrIp: CidrIp = null,
    Description: Description = null,
    DirectoryId: DirectoryId = null,
    IpRouteStatusMsg: IpRouteStatusMsg = null,
    IpRouteStatusReason: IpRouteStatusReason = null
  ): IpRouteInfo = {
    val __obj = js.Dynamic.literal()
    if (AddedDateTime != null) __obj.updateDynamic("AddedDateTime")(AddedDateTime)
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (IpRouteStatusMsg != null) __obj.updateDynamic("IpRouteStatusMsg")(IpRouteStatusMsg.asInstanceOf[js.Any])
    if (IpRouteStatusReason != null) __obj.updateDynamic("IpRouteStatusReason")(IpRouteStatusReason)
    __obj.asInstanceOf[IpRouteInfo]
  }
}

