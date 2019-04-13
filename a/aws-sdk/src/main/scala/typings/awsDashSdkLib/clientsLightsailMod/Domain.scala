package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the domain recordset (e.g., arn:aws:lightsail:global:123456789101:Domain/824cede0-abc7-4f84-8dbc-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The date when the domain recordset was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * An array of key-value pairs containing information about the domain entries.
    */
  var domainEntries: js.UndefOr[DomainEntryList] = js.undefined
  /**
    * The AWS Region and Availability Zones where the domain recordset was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name of the domain.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The resource type. 
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object Domain {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    domainEntries: DomainEntryList = null,
    location: ResourceLocation = null,
    name: ResourceName = null,
    resourceType: ResourceType = null,
    supportCode: java.lang.String = null,
    tags: TagList = null
  ): Domain = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (domainEntries != null) __obj.updateDynamic("domainEntries")(domainEntries)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Domain]
  }
}

