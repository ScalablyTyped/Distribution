package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The blueprint ID (e.g., os_amlinux_2016_03).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var blueprintName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The bundle for the instance (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The timestamp when the instance was created (e.g., 1479734909.17).
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The size of the vCPU and the amount of RAM for the instance.
    */
  var hardware: js.UndefOr[InstanceHardware] = js.undefined
  /**
    * The IPv6 address of the instance.
    */
  var ipv6Address: js.UndefOr[IpV6Address] = js.undefined
  /**
    * A Boolean value indicating whether this instance has a static IP assigned to it.
    */
  var isStaticIp: js.UndefOr[Boolean] = js.undefined
  /**
    * The region name and Availability Zone where the instance is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name the user gave the instance (e.g., Amazon_Linux-1GB-Ohio-1).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * Information about the public ports and monthly data transfer rates for the instance.
    */
  var networking: js.UndefOr[InstanceNetworking] = js.undefined
  /**
    * The private IP address of the instance.
    */
  var privateIpAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * The public IP address of the instance.
    */
  var publicIpAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * The type of resource (usually Instance).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The name of the SSH key being used to connect to the instance (e.g., LightsailDefaultKeyPair).
    */
  var sshKeyName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The status code and the state (e.g., running) for the instance.
    */
  var state: js.UndefOr[InstanceState] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The user name for connecting to the instance (e.g., ec2-user).
    */
  var username: js.UndefOr[NonEmptyString] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    blueprintId: NonEmptyString = null,
    blueprintName: NonEmptyString = null,
    bundleId: NonEmptyString = null,
    createdAt: IsoDate = null,
    hardware: InstanceHardware = null,
    ipv6Address: IpV6Address = null,
    isStaticIp: js.UndefOr[Boolean] = js.undefined,
    location: ResourceLocation = null,
    name: ResourceName = null,
    networking: InstanceNetworking = null,
    privateIpAddress: IpAddress = null,
    publicIpAddress: IpAddress = null,
    resourceType: ResourceType = null,
    sshKeyName: ResourceName = null,
    state: InstanceState = null,
    supportCode: String = null,
    tags: TagList = null,
    username: NonEmptyString = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (blueprintId != null) __obj.updateDynamic("blueprintId")(blueprintId)
    if (blueprintName != null) __obj.updateDynamic("blueprintName")(blueprintName)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (hardware != null) __obj.updateDynamic("hardware")(hardware)
    if (ipv6Address != null) __obj.updateDynamic("ipv6Address")(ipv6Address)
    if (!js.isUndefined(isStaticIp)) __obj.updateDynamic("isStaticIp")(isStaticIp)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (networking != null) __obj.updateDynamic("networking")(networking)
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress)
    if (publicIpAddress != null) __obj.updateDynamic("publicIpAddress")(publicIpAddress)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sshKeyName != null) __obj.updateDynamic("sshKeyName")(sshKeyName)
    if (state != null) __obj.updateDynamic("state")(state)
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Instance]
  }
}

