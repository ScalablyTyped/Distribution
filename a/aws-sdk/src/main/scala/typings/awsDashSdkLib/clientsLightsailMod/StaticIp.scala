package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticIp extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the static IP (e.g., arn:aws:lightsail:us-east-2:123456789101:StaticIp/9cbb4a9e-f8e3-4dfe-b57e-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The instance where the static IP is attached (e.g., Amazon_Linux-1GB-Ohio-1).
    */
  var attachedTo: js.UndefOr[ResourceName] = js.undefined
  /**
    * The timestamp when the static IP was created (e.g., 1479735304.222).
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The static IP address.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * A Boolean value indicating whether the static IP is attached.
    */
  var isAttached: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The region and Availability Zone where the static IP was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name of the static IP (e.g., StaticIP-Ohio-EXAMPLE).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The resource type (usually StaticIp).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[java.lang.String] = js.undefined
}

object StaticIp {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    attachedTo: ResourceName = null,
    createdAt: IsoDate = null,
    ipAddress: IpAddress = null,
    isAttached: js.UndefOr[scala.Boolean] = js.undefined,
    location: ResourceLocation = null,
    name: ResourceName = null,
    resourceType: ResourceType = null,
    supportCode: java.lang.String = null
  ): StaticIp = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (attachedTo != null) __obj.updateDynamic("attachedTo")(attachedTo)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (!js.isUndefined(isAttached)) __obj.updateDynamic("isAttached")(isAttached)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    __obj.asInstanceOf[StaticIp]
  }
}

