package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterRequest extends js.Object {
  /**
    * The ID of the updated Address object.
    */
  var AddressId: js.UndefOr[AddressId] = js.undefined
  /**
    * The cluster ID of the cluster that you want to update, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: awsDashSdkLib.clientsSnowballMod.ClusterId
  /**
    * The updated description of this cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  /**
    * The new or updated Notification object.
    */
  var Notification: js.UndefOr[Notification] = js.undefined
  /**
    * The updated arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.undefined
  /**
    * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[RoleARN] = js.undefined
  /**
    * The updated shipping option value of this cluster's ShippingDetails object.
    */
  var ShippingOption: js.UndefOr[ShippingOption] = js.undefined
}

object UpdateClusterRequest {
  @scala.inline
  def apply(
    ClusterId: ClusterId,
    AddressId: AddressId = null,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    Notification: Notification = null,
    Resources: JobResource = null,
    RoleARN: RoleARN = null,
    ShippingOption: ShippingOption = null
  ): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId)
    if (Notification != null) __obj.updateDynamic("Notification")(Notification)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (ShippingOption != null) __obj.updateDynamic("ShippingOption")(ShippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
}

