package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the key pair (e.g., arn:aws:lightsail:us-east-2:123456789101:KeyPair/05859e3d-331d-48ba-9034-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The timestamp when the key pair was created (e.g., 1479816991.349).
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The RSA fingerprint of the key pair.
    */
  var fingerprint: js.UndefOr[Base64] = js.undefined
  /**
    * The region name and Availability Zone where the key pair was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The friendly name of the SSH key pair.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The resource type (usually KeyPair).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object KeyPair {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    fingerprint: Base64 = null,
    location: ResourceLocation = null,
    name: ResourceName = null,
    resourceType: ResourceType = null,
    supportCode: String = null,
    tags: TagList = null
  ): KeyPair = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[KeyPair]
  }
}

