package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpAddressResponse extends js.Object {
  /**
    * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  /**
    * One IP address that the resolver endpoint uses for DNS queries.
    */
  var Ip: js.UndefOr[Ip] = js.undefined
  /**
    * The ID of one IP address.
    */
  var IpId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  /**
    * A status code that gives the current status of the request.
    */
  var Status: js.UndefOr[IpAddressStatus] = js.undefined
  /**
    * A message that provides additional information about the status of the request.
    */
  var StatusMessage: js.UndefOr[StatusMessage] = js.undefined
  /**
    * The ID of one subnet.
    */
  var SubnetId: js.UndefOr[SubnetId] = js.undefined
}

object IpAddressResponse {
  @scala.inline
  def apply(
    CreationTime: Rfc3339TimeString = null,
    Ip: Ip = null,
    IpId: ResourceId = null,
    ModificationTime: Rfc3339TimeString = null,
    Status: IpAddressStatus = null,
    StatusMessage: StatusMessage = null,
    SubnetId: SubnetId = null
  ): IpAddressResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Ip != null) __obj.updateDynamic("Ip")(Ip)
    if (IpId != null) __obj.updateDynamic("IpId")(IpId)
    if (ModificationTime != null) __obj.updateDynamic("ModificationTime")(ModificationTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[IpAddressResponse]
  }
}

